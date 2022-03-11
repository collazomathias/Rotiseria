package co.com.sofka.domains.pedidos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.pedidos.Cliente;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class ClienteModificado extends DomainEvent {

    private final PedidoId pedidoId;
    private final Cliente cliente;

    public ClienteModificado(PedidoId pedidoId, Cliente cliente) {
        super("pedidos.event.clientemodificado");
        this.pedidoId = pedidoId;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }
    
}
