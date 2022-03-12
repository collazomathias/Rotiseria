package co.com.sofka.usecases.pedidos;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.pedidos.Pedido;
import co.com.sofka.domains.pedidos.command.ModificarDestino;

public class ModificarDestinoUseCase extends UseCase<RequestCommand<ModificarDestino>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarDestino> input) {
        
        var command = input.getCommand();
        var pedido = Pedido.from(command.getPedidoId(), retrieveEvents());
        try {
            pedido.ModificarDestino(command.getPedidoId(), command.getDestinoId(), command.getCalle(), command.getCiudad(), command.getNumero());
        } catch(IllegalArgumentException e) {
            throw new BusinessException(command.getDestinoId().value(), e.getMessage(), e);
        }
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));
        
    }
    
}
