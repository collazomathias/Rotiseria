package co.com.sofka.domains.pedidos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.pedidos.Cliente;
import co.com.sofka.domains.pedidos.Destino;
import co.com.sofka.domains.pedidos.value.HoraEntrega;
import co.com.sofka.domains.pedidos.value.PrecioPedido;

public class PedidoCreado extends DomainEvent {

    private final HoraEntrega horaEntrega;
    private final Cliente cliente;
    private final Destino destino;
    private final PrecioPedido precioPedido;

    public PedidoCreado(HoraEntrega horaEntrega, Cliente cliente, Destino destino) {
        super("pedidos.event.pedidocreado");
        this.horaEntrega = horaEntrega;
        this.cliente = cliente;
        this.destino = destino;
        this.precioPedido = new PrecioPedido(0D);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Destino getDestino() {
        return destino;
    }

    public HoraEntrega getHoraEntrega() {
        return horaEntrega;
    }

    public PrecioPedido getPrecioPedido() {
        return precioPedido;
    }
    
}
