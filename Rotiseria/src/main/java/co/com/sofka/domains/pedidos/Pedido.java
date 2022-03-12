package co.com.sofka.domains.pedidos;

import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.pedidos.event.PedidoCreado;
import co.com.sofka.domains.pedidos.value.HoraEntrega;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class Pedido extends AggregateEvent<PedidoId> {

    protected HoraEntrega horaEntrega;
    protected Cliente cliente;
    protected Destino destino;

    public Pedido(PedidoId pedidoId, HoraEntrega horaEntrega, Cliente cliente) {
        super(pedidoId);
        appendChange(new PedidoCreado(horaEntrega, cliente, destino)).apply();
        subscribe(new PedidoEventChange(this));
    }

    private Pedido(PedidoId pedidoId){
        super(pedidoId);
        subscribe(new PedidoEventChange(this));
    }

    public static Pedido from(PedidoId pedidoId, List<DomainEvent> events) {
        var pedido = new Pedido(pedidoId);
        events.forEach(pedido::applyEvent);
        return pedido;
    }
    
}
