package co.com.sofka.domains.pedidos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.pedidos.value.PedidoId;
import co.com.sofka.domains.pedidos.value.PrecioPedido;

public class PrecioPedidoModificado extends DomainEvent {
    
    private final PedidoId pedidoId;
    private final PrecioPedido precioPedido;

    public PrecioPedidoModificado(PedidoId pedidoId, PrecioPedido precioPedido) {
        super("pedidos.event.preciopedidomodificado");
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
