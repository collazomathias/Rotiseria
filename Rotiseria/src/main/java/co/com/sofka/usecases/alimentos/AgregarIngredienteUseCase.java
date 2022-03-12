package co.com.sofka.usecases.alimentos;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.alimentos.Alimento;
import co.com.sofka.domains.alimentos.command.AgregarIngrediente;

public class AgregarIngredienteUseCase extends UseCase<RequestCommand<AgregarIngrediente>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarIngrediente> input) {
        
        var command = input.getCommand();
        var alimento = Alimento.from(command.getAlimentoId(), retrieveEvents());
        try {
            alimento.AgregarIngrediente(command.getAlimentoId(), command.getIngrediente());
        } catch(IllegalArgumentException e) {
            throw new BusinessException(command.getIngrediente().value(), e.getMessage(), e);
        }
        emit().onResponse(new ResponseEvents(alimento.getUncommittedChanges()));
        
    }
    
}
