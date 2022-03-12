package co.com.sofka.usecases.pedidos;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.pedidos.Pedido;
import co.com.sofka.domains.pedidos.command.AgregarAlimento;

public class AgregarAlimentoUseCase extends UseCase<RequestCommand<AgregarAlimento>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarAlimento> input) {
        
        var command = input.getCommand();
        var pedido = Pedido.from(command.getPedidoId(), retrieveEvents());
        try {
            pedido.AgregarAlimento(command.getPedidoId(), command.getAlimentoId(), command.getCategoria(), command.getCoccion(), command.getPrecioAlimento(), command.getNombreAlimento());
        } catch(IllegalArgumentException e) {
            throw new BusinessException(command.getAlimentoId().value(), e.getMessage(), e);
        }
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));
        
    }
    
}
