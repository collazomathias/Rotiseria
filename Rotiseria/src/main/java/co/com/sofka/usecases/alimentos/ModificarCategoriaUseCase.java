package co.com.sofka.usecases.alimentos;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.alimentos.Alimento;
import co.com.sofka.domains.alimentos.command.ModificarCategoria;

public class ModificarCategoriaUseCase extends UseCase<RequestCommand<ModificarCategoria>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarCategoria> input) {
        
        var command = input.getCommand();
        var alimento = Alimento.from(command.getAlimentoId(), retrieveEvents());
        try {
            alimento.ModificarCategoria(command.getAlimentoId(), command.getCategoriaId(), command.getProcedencia(), command.getTipoCategoria());
        } catch(IllegalArgumentException e) {
            throw new BusinessException(command.getCategoriaId().value(), e.getMessage(), e);
        }
        emit().onResponse(new ResponseEvents(alimento.getUncommittedChanges()));
        
    }
    
}
