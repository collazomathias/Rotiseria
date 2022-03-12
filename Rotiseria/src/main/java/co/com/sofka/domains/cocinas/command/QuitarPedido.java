package co.com.sofka.domains.cocinas.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class QuitarPedido extends Command {

    private final PedidoId pedidoId;

    public QuitarPedido(PedidoId pedidoId) {
        this.pedidoId = pedidoId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }
    
}
