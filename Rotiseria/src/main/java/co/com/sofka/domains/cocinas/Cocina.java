package co.com.sofka.domains.cocinas;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domains.cocinas.event.CocinaCreada;
import co.com.sofka.domains.cocinas.value.CocinaId;

public class Cocina extends AggregateEvent<CocinaId>{

    protected Cocinero cocinero;

    public Cocina(CocinaId cocinaId, 
                Cocinero cocinero) {
        super(cocinaId);
        appendChange(new CocinaCreada(cocinero)).apply();
        subscribe(new CocinaEventChange(this));
    }

    public Cocinero cocinero() {
        return cocinero;
    }
    
}
