package co.com.sofka.domains.cocinas.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.cocinas.value.CocinaId;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class PedidoQuitado extends DomainEvent {

    private final CocinaId cocinaId;
    private final PedidoId pedidoId;

    public PedidoQuitado(CocinaId cocinaId, PedidoId pedidoId) {
        super("cocinas.event.pedidoquitado");
        this.cocinaId = cocinaId;
        this.pedidoId = pedidoId;
    }

    public CocinaId getCocinaId() {
        return cocinaId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }
    
}
