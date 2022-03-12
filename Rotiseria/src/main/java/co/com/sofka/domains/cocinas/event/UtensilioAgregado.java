package co.com.sofka.domains.cocinas.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.cocinas.value.DescripcionUtensilio;
import co.com.sofka.domains.cocinas.value.TipoUtensilio;
import co.com.sofka.domains.cocinas.value.UtensilioId;

public class UtensilioAgregado extends DomainEvent {

    private final UtensilioId utensilioId;
    private final TipoUtensilio tipoUtensilio;
    private final DescripcionUtensilio descripcionUtensilio;

    public UtensilioAgregado(UtensilioId utensilioId, TipoUtensilio tipoUtensilio, DescripcionUtensilio descripcionUtensilio) {
        super("cocinas.event.utensilioagregado");
        this.utensilioId = utensilioId;
        this.tipoUtensilio = tipoUtensilio;
        this.descripcionUtensilio = descripcionUtensilio;
    }

    public UtensilioId getUtensilioId() {
        return utensilioId;
    }

    public DescripcionUtensilio getDescripcionUtensilio() {
        return descripcionUtensilio;
    }

    public TipoUtensilio getTipoUtensilio() {
        return tipoUtensilio;
    }
    
}
