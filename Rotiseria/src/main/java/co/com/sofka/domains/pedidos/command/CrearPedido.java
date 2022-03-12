package co.com.sofka.domains.pedidos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.pedidos.Cliente;
import co.com.sofka.domains.pedidos.Destino;
import co.com.sofka.domains.pedidos.value.HoraEntrega;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class CrearPedido extends Command {
    
    private final PedidoId pedidoId;
    private final HoraEntrega horaEntrega;
    private final Cliente cliente;
    private final Destino destino;

    public CrearPedido(PedidoId pedidoId, HoraEntrega horaEntrega, Cliente cliente, Destino destino) {
        this.pedidoId = pedidoId;
        this.horaEntrega = horaEntrega;
        this.cliente = cliente;
        this.destino = destino;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
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
