package co.com.sofka.domains.pedidos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.pedidos.Cliente;
import co.com.sofka.domains.pedidos.Destino;
import co.com.sofka.domains.pedidos.value.HoraEntrega;

public class PedidoCreado extends DomainEvent {

    private final HoraEntrega horaEntrega;
    private final Cliente cliente;
    private final Destino destino;

    public PedidoCreado(HoraEntrega horaEntrega, Cliente cliente, Destino destino) {
        super("pedidos.event.pedidocreado");
        this.horaEntrega = horaEntrega;
        this.cliente = cliente;
        this.destino = destino;
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
    
}
