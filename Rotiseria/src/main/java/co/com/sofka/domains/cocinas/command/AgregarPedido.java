package co.com.sofka.domains.cocinas.command;

import java.util.Set;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.cocinas.value.CocinaId;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class AgregarPedido extends Command {

    private final CocinaId cocinaId;
    private final Set<PedidoId> pedidos;

    public AgregarPedido(CocinaId cocinaId, Set<PedidoId> pedidos) {
        this.cocinaId = cocinaId;
        this.pedidos = pedidos;
    }

    public CocinaId getCocinaId() {
        return cocinaId;
    }

    public Set<PedidoId> getPedidos() {
        return pedidos;
    }
    
}
