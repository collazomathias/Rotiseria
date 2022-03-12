package co.com.sofka.domains.cocinas;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domains.cocinas.value.CocinaId;

public class Cocina extends AggregateEvent<CocinaId>{

    private final Cocinero cocinero;

    public Cocina(CocinaId cocinaId, 
                Cocinero cocinero) {
        super(cocinaId);
        //TODO: Cambiar aqui.
        this.cocinero = cocinero;
    }

    public Cocinero cocinero() {
        return cocinero;
    }
    
}
