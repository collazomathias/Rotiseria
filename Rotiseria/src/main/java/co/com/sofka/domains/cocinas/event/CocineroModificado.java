package co.com.sofka.domains.cocinas.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.cocinas.Cocinero;
import co.com.sofka.domains.cocinas.value.CocinaId;

public class CocineroModificado extends DomainEvent {

    private final CocinaId cocinaId;
    private final Cocinero cocinero;

    public CocineroModificado(CocinaId cocinaId, Cocinero cocinero) {
        super("cocinas.event.cocineromodificado");
        this.cocinaId = cocinaId;
        this.cocinero = cocinero;
    }

    public CocinaId cocinaId() {
        return cocinaId;
    }
    
    public Cocinero cocinero() {
        return cocinero;
    }
    
}
