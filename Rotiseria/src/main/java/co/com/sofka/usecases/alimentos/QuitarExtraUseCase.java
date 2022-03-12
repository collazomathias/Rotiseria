package co.com.sofka.usecases.alimentos;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.alimentos.Alimento;
import co.com.sofka.domains.alimentos.command.QuitarExtra;

public class QuitarExtraUseCase extends UseCase<RequestCommand<QuitarExtra>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<QuitarExtra> input) {
        
        var command = input.getCommand();
        var alimento = Alimento.from(command.getAlimentoId(), retrieveEvents());
        try {
            alimento.QuitarExtra(command.getAlimentoId(), command.getExtraId(), command.getPrecioExtra());
        } catch(IllegalArgumentException e) {
            throw new BusinessException(command.getExtraId().value(), e.getMessage(), e);
        }
        emit().onResponse(new ResponseEvents(alimento.getUncommittedChanges()));
        
    }
    
}
