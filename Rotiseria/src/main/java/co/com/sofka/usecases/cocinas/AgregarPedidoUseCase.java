package co.com.sofka.usecases.cocinas;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.cocinas.Cocina;
import co.com.sofka.domains.cocinas.command.AgregarPedido;

public class AgregarPedidoUseCase extends UseCase<RequestCommand<AgregarPedido>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarPedido> input) {
        
        var command = input.getCommand();
        var cocina = Cocina.from(command.getCocinaId(), retrieveEvents());
        try {
            cocina.AgregarPedido(command.getCocinaId(), command.getPedidoId(), command.getHoraEntrega(), command.getDestino(), command.getPrecioPedido(), command.getAlimentos());
        } catch(IllegalArgumentException e) {
            throw new BusinessException(command.getPedidoId().value(), e.getMessage(), e);
        }
        emit().onResponse(new ResponseEvents(cocina.getUncommittedChanges()));
        
    }
    
}
