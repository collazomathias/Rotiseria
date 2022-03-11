package co.com.sofka.domains.pedido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domains.pedido.value.pedido.HoraEntrega;
import co.com.sofka.domains.pedido.value.pedido.PedidoId;
import co.com.sofka.domains.pedido.value.pedido.PrecioPedido;

public class Pedido extends AggregateEvent<PedidoId> {

    private final PrecioPedido precioPedido;
    private final HoraEntrega horaEntrega;

    public Pedido(PedidoId pedidoId, 
                PrecioPedido precioPedido, 
                HoraEntrega horaEntrega) {
        super(pedidoId);
        this.precioPedido = precioPedido;
        this.horaEntrega = horaEntrega;
    }

    public HoraEntrega horaEntrega() {
        return horaEntrega;
    }

    public PrecioPedido precioPedido() {
        return precioPedido;
    }
    
}
