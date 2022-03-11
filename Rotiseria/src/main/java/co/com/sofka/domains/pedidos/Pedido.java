package co.com.sofka.domains.pedidos;

import java.util.List;
import java.util.Set;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.pedidos.event.PedidoCreado;
import co.com.sofka.domains.pedidos.value.HoraEntrega;
import co.com.sofka.domains.pedidos.value.PedidoId;
import co.com.sofka.domains.pedidos.value.PrecioPedido;

public class Pedido extends AggregateEvent<PedidoId> {

    protected PrecioPedido precioPedido;
    protected HoraEntrega horaEntrega;
    protected Set<AlimentoId> alimentos;
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
