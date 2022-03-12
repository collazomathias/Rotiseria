package co.com.sofka.domains.pedidos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.pedidos.value.HoraEntrega;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class ModificarHoraEntrega extends Command {
    
    private final PedidoId pedidoId;
    private final HoraEntrega horaEntrega;

    public ModificarHoraEntrega(PedidoId pedidoId, HoraEntrega horaEntrega) {
        this.pedidoId = pedidoId;
        this.horaEntrega = horaEntrega;
    }

    public HoraEntrega getHoraEntrega() {
        return horaEntrega;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

}
