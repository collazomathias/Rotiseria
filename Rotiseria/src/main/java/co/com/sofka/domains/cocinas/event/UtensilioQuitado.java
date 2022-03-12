package co.com.sofka.domains.cocinas.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.cocinas.value.UtensilioId;

public class UtensilioQuitado extends DomainEvent {

    private final UtensilioId utensilioId;

    public UtensilioQuitado(UtensilioId utensilioId) {
        super("cocinas.event.utensilioquitado");
        this.utensilioId = utensilioId;
    }

    public UtensilioId getUtensilioId() {
        return utensilioId;
    }
    
}
