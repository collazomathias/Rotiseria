package co.com.sofka.usecases.alimentos;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.alimentos.Alimento;
import co.com.sofka.domains.alimentos.command.ModificarCoccion;

public class ModificarCoccionUseCase extends UseCase<RequestCommand<ModificarCoccion>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarCoccion> input) {
        
        var command = input.getCommand();
        var alimento = Alimento.from(command.getAlimentoId(), retrieveEvents());
        try {
            alimento.ModificarCoccion(command.getAlimentoId(), command.getCoccionId(), command.getDuracion(), command.getTemperatura(), command.getTipoCoccion());
        } catch(IllegalArgumentException e) {
            throw new BusinessException(command.getCoccionId().value(), e.getMessage(), e);
        }
        emit().onResponse(new ResponseEvents(alimento.getUncommittedChanges()));
        
    }
    
}
