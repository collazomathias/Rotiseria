package co.com.sofka.domains.pedidos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.pedidos.value.HoraEntrega;

public class HoraEntregaModificada extends DomainEvent {
    
    private final HoraEntrega horaEntrega;

    public HoraEntregaModificada(HoraEntrega horaEntrega) {
        super("pedidos.event.horaentregamodificada");
        this.horaEntrega = horaEntrega;
    }

    public HoraEntrega getHoraEntrega() {
        return horaEntrega;
    }

}
