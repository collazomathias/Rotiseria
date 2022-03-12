package co.com.sofka.domains.pedidos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.pedidos.Cliente;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class ModificarCliente extends Command {
    
    private final PedidoId pedidoId;
    private final Cliente cliente;

    public ModificarCliente(PedidoId pedidoId, Cliente cliente) {
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
