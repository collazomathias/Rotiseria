package co.com.sofka.domains.cocinas.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.cocinas.value.UtensilioId;

public class QuitarUtensilio extends Command {

    private final UtensilioId utensilioId;

    public QuitarUtensilio(UtensilioId utensilioId) {
        this.utensilioId = utensilioId;
    }
    
    public UtensilioId getUtensilioId() {
        return utensilioId;
    }

}
