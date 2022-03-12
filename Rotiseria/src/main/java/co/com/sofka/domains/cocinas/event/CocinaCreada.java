package co.com.sofka.domains.cocinas.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.cocinas.Cocinero;

public class CocinaCreada extends DomainEvent {

    private final Cocinero cocinero;

    public CocinaCreada(Cocinero cocinero) {
        super("cocinas.event.cocinacreada");
        this.cocinero = cocinero;
    }

    public Cocinero getCocinero() {
        return cocinero;
    }
    
}
