package co.com.sofka.domains.cocinas.event;

import java.util.Set;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.cocinas.Utensilio;
import co.com.sofka.domains.cocinas.value.CocinaId;

public class UtensilioQuitado extends DomainEvent {

    private final CocinaId cocinaId;
    private final Set<Utensilio> utensilios;

    public UtensilioQuitado(CocinaId cocinaId, Set<Utensilio> utensilios) {
        super("cocinas.event.utensilioquitado");
        this.cocinaId = cocinaId;
        this.utensilios = utensilios;
    }

    public CocinaId cocinaId() {
        return cocinaId;
    }

    public Set<Utensilio> utensilios() {
        return utensilios;
    }
    
}
