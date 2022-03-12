package co.com.sofka.domains.pedidos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.pedidos.value.PedidoId;
import co.com.sofka.domains.pedidos.value.PrecioPedido;

public class ModificarPrecioPedido extends Command {
    
    private final PedidoId pedidoId;
    private final PrecioPedido precioPedido;

    public ModificarPrecioPedido(PedidoId pedidoId, PrecioPedido precioPedido) {
        this.pedidoId = pedidoId;
        this.precioPedido = precioPedido;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public PrecioPedido getPrecioPedido() {
        return precioPedido;
    }

}
