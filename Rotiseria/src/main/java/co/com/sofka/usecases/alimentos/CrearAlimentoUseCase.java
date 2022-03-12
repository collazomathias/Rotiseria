package co.com.sofka.usecases.alimentos;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.alimentos.Alimento;
import co.com.sofka.domains.alimentos.command.CrearAlimento;

public class CrearAlimentoUseCase extends UseCase<RequestCommand<CrearAlimento>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearAlimento> input) {
        
        var command = input.getCommand();
        var alimento = new Alimento(command.getAlimentoId(), command.getCategoria(), command.getCoccion(), command.getPrecioAlimento(), command.getNombreAlimento());
        emit().onResponse(new ResponseEvents(alimento.getUncommittedChanges()));
        
    }
    
}
