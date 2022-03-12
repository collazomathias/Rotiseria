package co.com.sofka.domains.pedidos.command;

import java.util.Set;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.Alimento;
import co.com.sofka.domains.pedidos.value.PedidoId;
import co.com.sofka.domains.pedidos.value.PrecioPedido;

public class QuitarAlimento extends Command {
    
    private final PedidoId pedidoId;
    private final PrecioPedido precioPedido;
    private final Set<Alimento> alimentos;

    public QuitarAlimento(PedidoId pedidoId, PrecioPedido precioPedido, Set<Alimento> alimentos) {
        this.pedidoId = pedidoId;
        this.precioPedido = precioPedido;
        this.alimentos = alimentos;
    }

    public Set<Alimento> getAlimentos() {
        return alimentos;
    }

    public PrecioPedido getPrecioPedido() {
        return precioPedido;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

}
