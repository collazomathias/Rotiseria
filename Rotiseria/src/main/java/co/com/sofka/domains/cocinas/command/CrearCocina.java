package co.com.sofka.domains.cocinas.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.cocinas.Cocinero;
import co.com.sofka.domains.cocinas.value.CocinaId;

public class CrearCocina extends Command {

    private final CocinaId cocinaId;
    private final Cocinero cocinero;

    public CrearCocina(CocinaId cocinaId, Cocinero cocinero) {
        this.cocinaId = cocinaId;
        this.cocinero = cocinero;
    }

    public CocinaId getCocinaId() {
        return cocinaId;
    }
    
    public Cocinero getCocinero() {
        return cocinero;
    }
    
}
