package co.com.sofka.domains.alimentos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.ExtraId;
import co.com.sofka.domains.alimentos.value.PrecioExtra;

public class ExtraQuitado extends DomainEvent {
    
    private final ExtraId extraId;
    private final PrecioExtra precioExtra;

    public ExtraQuitado(ExtraId extraId, PrecioExtra precioExtra) {
        super("alimentos.event.extraquitado");
        this.extraId = extraId;
        this.precioExtra = precioExtra;
    }

    public ExtraId getExtraId() {
        return extraId;
    }

    public PrecioExtra getPrecioExtra() {
        return precioExtra;
    }

}
