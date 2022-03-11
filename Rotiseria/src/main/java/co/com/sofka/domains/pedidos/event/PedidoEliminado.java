package co.com.sofka.domains.pedidos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class PedidoEliminado extends DomainEvent {

    private final PedidoId pedidoId;

    public PedidoEliminado(PedidoId pedidoId) {
        super("pedidos.event.pedidoeliminado");
        this.pedidoId = pedidoId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }
    
}
