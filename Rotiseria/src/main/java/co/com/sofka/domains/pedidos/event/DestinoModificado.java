package co.com.sofka.domains.pedidos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.pedidos.Destino;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class DestinoModificado extends DomainEvent {
    
    private final PedidoId pedidoId;
    private final Destino destino;

    public DestinoModificado(PedidoId pedidoId, Destino destino) {
        super("pedidos.event.destinomodificado");
        this.pedidoId = pedidoId;
        this.destino = destino;
    }

    public Destino getDestino() {
        return destino;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

}
