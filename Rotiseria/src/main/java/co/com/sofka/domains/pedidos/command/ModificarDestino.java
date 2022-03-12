package co.com.sofka.domains.pedidos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.pedidos.Destino;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class ModificarDestino extends Command {

    private final PedidoId pedidoId;
    private final Destino destino;

    public ModificarDestino(PedidoId pedidoId, Destino destino) {
        this.pedidoId = pedidoId;
        this.destino = destino;
    }

    public Destino getDestino() {
        return destino;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

}
