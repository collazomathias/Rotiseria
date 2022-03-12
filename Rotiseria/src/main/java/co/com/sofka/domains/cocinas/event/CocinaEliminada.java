package co.com.sofka.domains.cocinas.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.cocinas.value.CocinaId;

public class CocinaEliminada extends DomainEvent {

    private final CocinaId cocinaId;

    public CocinaEliminada(CocinaId cocinaId) {
        super("cocinas.event.cocinaeliminada");
        this.cocinaId = cocinaId;
    }

    public CocinaId cocinaId() {
        return cocinaId;
    }
    
}
