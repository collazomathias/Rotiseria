package co.com.sofka.domains.pedidos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.pedidos.value.PrecioPedido;

public class PrecioPedidoModificado extends DomainEvent {
    
    private final PrecioPedido precioPedido;

    public PrecioPedidoModificado(PrecioPedido precioPedido) {
        super("pedidos.event.preciopedidomodificado");
        this.precioPedido = precioPedido;
    }

    public PrecioPedido getPrecioPedido() {
        return precioPedido;
    }

}
