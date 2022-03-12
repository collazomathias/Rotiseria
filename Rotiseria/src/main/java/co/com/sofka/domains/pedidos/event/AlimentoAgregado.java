package co.com.sofka.domains.pedidos.event;

import java.util.Set;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.pedidos.value.PedidoId;
import co.com.sofka.domains.pedidos.value.PrecioPedido;

public class AlimentoAgregado extends DomainEvent {

    private final PedidoId pedidoId;
    private final PrecioPedido precioPedido;
    private final Set<AlimentoId> alimentos;

    public AlimentoAgregado(PedidoId pedidoId, PrecioPedido precioPedido, Set<AlimentoId> alimentos) {
        super("pedidos.event.alimentoagregado");
        this.pedidoId = pedidoId;
        this.precioPedido = precioPedido;
        this.alimentos = alimentos;
    }

    public Set<AlimentoId> getAlimentos() {
        return alimentos;
    }

    public PrecioPedido getPrecioPedido() {
        return precioPedido;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }
    
}
