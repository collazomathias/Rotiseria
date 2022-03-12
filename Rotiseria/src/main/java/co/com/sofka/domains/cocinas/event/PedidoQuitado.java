package co.com.sofka.domains.cocinas.event;

import java.util.Set;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.cocinas.value.CocinaId;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class PedidoQuitado extends DomainEvent {

    private final CocinaId cocinaId;
    private final Set<PedidoId> pedidos;

    public PedidoQuitado(CocinaId cocinaId, Set<PedidoId> pedidos) {
        super("cocinas.event.pedidoquitado");
        this.cocinaId = cocinaId;
        this.pedidos = pedidos;
    }

    public CocinaId cocinaId() {
        return cocinaId;
    }

    public Set<PedidoId> pedidos() {
        return pedidos;
    }
    
}
