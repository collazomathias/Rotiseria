package co.com.sofka.usecases.pedidos;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.pedidos.Pedido;
import co.com.sofka.domains.pedidos.command.ModificarPrecioPedido;

public class ModificarPrecioPedidoUseCase extends UseCase<RequestCommand<ModificarPrecioPedido>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarPrecioPedido> input) {
        
        var command = input.getCommand();
        var pedido = Pedido.from(command.getPedidoId(), retrieveEvents());
        try { 
            pedido.ModificarPrecioPedido(command.getPedidoId(), command.getPrecioPedido());
        } catch(IllegalArgumentException e) {
            throw new BusinessException(command.getPedidoId().value(), e.getMessage(), e);
        }
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));
        
    }
    
}
