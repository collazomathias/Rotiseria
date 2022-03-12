package co.com.sofka.usecases.pedidos;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.pedidos.Pedido;
import co.com.sofka.domains.pedidos.command.ModificarCliente;

public class ModificarClienteUseCase extends UseCase<RequestCommand<ModificarCliente>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarCliente> input) {
        
        var command = input.getCommand();
        var pedido = Pedido.from(command.getPedidoId(), retrieveEvents());
        try {
            pedido.ModificarCliente(command.getPedidoId(), command.getClienteId(), command.getNombreCliente(), command.getTelefonoCliente(), command.getDestinos());
        } catch(IllegalArgumentException e) {
            throw new BusinessException(command.getClienteId().value(), e.getMessage(), e);
        }
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));
        
    }
    
}
