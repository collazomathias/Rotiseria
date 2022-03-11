package co.com.sofka.domains.pedidos.event;

import java.util.Set;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class AlimentoAgregado extends DomainEvent {

    private final PedidoId pedidoId;
    private final Set<AlimentoId> alimentos;

    public AlimentoAgregado(PedidoId pedidoId, Set<AlimentoId> alimentos) {
        super("pedidos.event.alimentoagregado");
        this.pedidoId = pedidoId;
        this.alimentos = alimentos;
    }

    public Set<AlimentoId> getAlimentos() {
        return alimentos;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }
    
}
