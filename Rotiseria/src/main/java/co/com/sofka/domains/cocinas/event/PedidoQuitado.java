package co.com.sofka.domains.cocinas.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class PedidoQuitado extends DomainEvent {

    private final PedidoId pedidoId;

    public PedidoQuitado(PedidoId pedidoId) {
        super("cocinas.event.pedidoquitado");
        this.pedidoId = pedidoId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }
    
}
