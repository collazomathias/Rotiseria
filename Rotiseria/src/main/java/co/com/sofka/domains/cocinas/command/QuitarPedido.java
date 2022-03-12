package co.com.sofka.domains.cocinas.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.cocinas.value.CocinaId;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class QuitarPedido extends Command {

    private final CocinaId cocinaId;
    private final PedidoId pedidoId;

    public QuitarPedido(CocinaId cocinaId, PedidoId pedidoId) {
        this.cocinaId = cocinaId;
        this.pedidoId = pedidoId;
    }

    public CocinaId getCocinaId() {
        return cocinaId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }
    
}
