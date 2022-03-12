package co.com.sofka.usecases.cocinas;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.cocinas.Cocina;
import co.com.sofka.domains.cocinas.command.ModificarCocinero;

public class ModificarCocineroUseCase extends UseCase<RequestCommand<ModificarCocinero>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarCocinero> input) {
        
        var command = input.getCommand();
        var cocina = Cocina.from(command.getCocinaId(), retrieveEvents());
        try {
            cocina.ModificarCocinero(command.getCocinaId(), command.getCocineroId(), command.getNombreCocinero(), command.getTelefonoCocinero(), command.getEspecialidad());
        } catch(IllegalArgumentException e) {
            throw new BusinessException(command.getCocineroId().value(), e.getMessage(), e);
        }
        emit().onResponse(new ResponseEvents(cocina.getUncommittedChanges()));
        
    }
    
}
