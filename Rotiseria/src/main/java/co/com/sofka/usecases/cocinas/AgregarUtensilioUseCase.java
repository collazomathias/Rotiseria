package co.com.sofka.usecases.cocinas;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.cocinas.Cocina;
import co.com.sofka.domains.cocinas.command.AgregarUtensilio;

public class AgregarUtensilioUseCase extends UseCase<RequestCommand<AgregarUtensilio>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarUtensilio> input) {
        
        var command = input.getCommand();
        var cocina = Cocina.from(command.getCocinaId(), retrieveEvents());
        try {
            cocina.AgregarUtensilio(command.getCocinaId(), command.getUtensilioId(), command.getTipoUtensilio(), command.getDescripcionUtensilio());
        } catch(IllegalArgumentException e) {
            throw new BusinessException(command.getUtensilioId().value(), e.getMessage(), e);
        }
        emit().onResponse(new ResponseEvents(cocina.getUncommittedChanges()));
        
    }
    
}
