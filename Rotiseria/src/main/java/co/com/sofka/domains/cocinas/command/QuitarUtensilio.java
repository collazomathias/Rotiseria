package co.com.sofka.domains.cocinas.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.cocinas.value.CocinaId;
import co.com.sofka.domains.cocinas.value.UtensilioId;

public class QuitarUtensilio extends Command {

    private final CocinaId cocinaId;
    private final UtensilioId utensilioId;

    public QuitarUtensilio(CocinaId cocinaId, UtensilioId utensilioId) {
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
