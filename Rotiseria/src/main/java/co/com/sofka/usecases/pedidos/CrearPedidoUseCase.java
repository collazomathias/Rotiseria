package co.com.sofka.usecases.pedidos;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domains.pedidos.Pedido;
import co.com.sofka.domains.pedidos.command.CrearPedido;

public class CrearPedidoUseCase extends UseCase<RequestCommand<CrearPedido>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearPedido> input) {
       
        var command = input.getCommand();
        var pedido = new Pedido(command.getPedidoId(), command.getHoraEntrega(), command.getCliente());
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));
        
    }
    
}
