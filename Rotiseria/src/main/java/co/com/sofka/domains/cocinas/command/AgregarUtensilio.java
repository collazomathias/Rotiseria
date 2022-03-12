package co.com.sofka.domains.cocinas.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.cocinas.value.DescripcionUtensilio;
import co.com.sofka.domains.cocinas.value.TipoUtensilio;
import co.com.sofka.domains.cocinas.value.UtensilioId;

public class AgregarUtensilio extends Command {

    private final UtensilioId utensilioId;
    private final TipoUtensilio tipoUtensilio;
    private final DescripcionUtensilio descripcionUtensilio;

    public AgregarUtensilio(UtensilioId utensilioId, TipoUtensilio tipoUtensilio, DescripcionUtensilio descripcionUtensilio) {
        this.utensilioId = utensilioId;
        this.tipoUtensilio = tipoUtensilio;
        this.descripcionUtensilio = descripcionUtensilio;
    }

    public DescripcionUtensilio getDescripcionUtensilio() {
        return descripcionUtensilio;
    }
    
    public TipoUtensilio getTipoUtensilio() {
        return tipoUtensilio;
    }

    public UtensilioId getUtensilioId() {
        return utensilioId;
    }
    
}
