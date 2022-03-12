package co.com.sofka.usecases.cocinas;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.cocinas.Cocina;
import co.com.sofka.domains.cocinas.command.CrearCocina;

public class CrearCocinaUseCase extends UseCase<RequestCommand<CrearCocina>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearCocina> input) {

        var command = input.getCommand();
        var cocina = new Cocina(command.getCocinaId(), command.getCocinero());
        emit().onResponse(new ResponseEvents(cocina.getUncommittedChanges()));
        
    }
    
}
