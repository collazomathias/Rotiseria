package co.com.sofka.domains.cocinas.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.cocinas.value.CocinaId;

public class EliminarCocina extends Command {

    private final CocinaId cocinaId;

    public EliminarCocina(CocinaId cocinaId) {
        this.cocinaId = cocinaId;
    }

    public CocinaId getCocinaId() {
        return cocinaId;
    }
    
}
