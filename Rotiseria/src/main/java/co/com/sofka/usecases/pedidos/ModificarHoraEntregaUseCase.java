package co.com.sofka.usecases.pedidos;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.pedidos.Pedido;
import co.com.sofka.domains.pedidos.command.ModificarHoraEntrega;

public class ModificarHoraEntregaUseCase extends UseCase<RequestCommand<ModificarHoraEntrega>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarHoraEntrega> input) {
        
        var command = input.getCommand();
        var pedido = Pedido.from(command.getPedidoId(), retrieveEvents());
        try {
            pedido.ModificarHoraEntrega(command.getPedidoId(), command.getHoraEntrega());
        } catch(IllegalArgumentException e) {
            throw new BusinessException(command.getHoraEntrega().value(), e.getMessage(), e);
        }
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));
        
    }
    
}
