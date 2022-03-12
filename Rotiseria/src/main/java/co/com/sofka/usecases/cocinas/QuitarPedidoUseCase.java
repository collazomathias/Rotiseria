package co.com.sofka.usecases.cocinas;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.cocinas.Cocina;
import co.com.sofka.domains.cocinas.command.QuitarPedido;

public class QuitarPedidoUseCase extends UseCase<RequestCommand<QuitarPedido>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<QuitarPedido> input) {
       
        var command = input.getCommand();
        var cocina = Cocina.from(command.getCocinaId(), retrieveEvents());
        try {
            cocina.QuitarPedido(command.getCocinaId(), command.getPedidoId());
        } catch(IllegalArgumentException e) {
            throw new BusinessException(command.getPedidoId().value(), e.getMessage(), e);
        }
        emit().onResponse(new ResponseEvents(cocina.getUncommittedChanges()));
        
    }
    
}
