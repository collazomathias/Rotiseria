package co.com.sofka.domains.cocinas.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.cocinas.value.CocinaId;
import co.com.sofka.domains.cocinas.value.UtensilioId;

public class UtensilioQuitado extends DomainEvent {

    private final CocinaId cocinaId;
    private final UtensilioId utensilioId;

    public UtensilioQuitado(CocinaId cocinaId, UtensilioId utensilioId) {
        super("cocinas.event.utensilioquitado");
        this.cocinaId = cocinaId;
        this.utensilioId = utensilioId;
    }

    public CocinaId getCocinaId() {
        return cocinaId;
    }

    public UtensilioId getUtensilioId() {
        return utensilioId;
    }
    
}
