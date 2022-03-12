package co.com.sofka.usecases.alimentos;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.alimentos.Alimento;
import co.com.sofka.domains.alimentos.command.ModificarPrecioAlimento;

public class ModificarPrecioAlimentoUseCase extends UseCase<RequestCommand<ModificarPrecioAlimento>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarPrecioAlimento> input) {
        
        var command = input.getCommand();
        var alimento = Alimento.from(command.getAlimentoId(), retrieveEvents());
        try {
            alimento.ModificarPrecioAlimento(command.getAlimentoId(), command.getPrecioAlimento());
        } catch(IllegalArgumentException e) {
            throw new BusinessException(String.valueOf(command.getPrecioAlimento().value()), e.getMessage(), e);
        }
        emit().onResponse(new ResponseEvents(alimento.getUncommittedChanges()));
        
    }
    
}
