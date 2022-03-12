package co.com.sofka.domains.pedidos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.pedidos.value.HoraEntrega;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class HoraEntregaModificada extends DomainEvent {
    
    private final PedidoId pedidoId;
    private final HoraEntrega horaEntrega;

    public HoraEntregaModificada(PedidoId pedidoId, HoraEntrega horaEntrega) {
        super("pedidos.event.horaentregamodificada");
        this.pedidoId = pedidoId;
        this.horaEntrega = horaEntrega;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public HoraEntrega getHoraEntrega() {
        return horaEntrega;
    }

}
