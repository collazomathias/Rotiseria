package co.com.sofka.domains.cocinas.command;

import java.util.Set;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.cocinas.Utensilio;
import co.com.sofka.domains.cocinas.value.CocinaId;

public class QuitarUtensilio extends Command {

    private final CocinaId cocinaId;
    private final Set<Utensilio> utensilios;

    public QuitarUtensilio(CocinaId cocinaId, Set<Utensilio> utensilios) {
        this.cocinaId = cocinaId;
        this.utensilios = utensilios;
    }

    public CocinaId getCocinaId() {
        return cocinaId;
    }

    public Set<Utensilio> getUtensilios() {
        return utensilios;
    }
    
}
