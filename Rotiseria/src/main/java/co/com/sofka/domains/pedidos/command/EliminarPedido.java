package co.com.sofka.domains.pedidos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class EliminarPedido extends Command {
    
    private final PedidoId pedidoId;

    public EliminarPedido(PedidoId pedidoId) {
        this.pedidoId = pedidoId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

}
