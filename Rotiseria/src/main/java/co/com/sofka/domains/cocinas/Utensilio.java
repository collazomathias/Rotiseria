package co.com.sofka.domains.cocinas;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.cocinas.value.DescripcionUtensilio;
import co.com.sofka.domains.cocinas.value.TipoUtensilio;
import co.com.sofka.domains.cocinas.value.UtensilioId;

public class Utensilio extends Entity<UtensilioId> {

    private final DescripcionUtensilio descripcionUtensilio;
    private final TipoUtensilio tipoUtensilio;

    public Utensilio(UtensilioId utensilioId,
                    TipoUtensilio tipoUtensilio,
                    DescripcionUtensilio descripcionUtensilio) {
        super(utensilioId);
        this.descripcionUtensilio = descripcionUtensilio;
        this.tipoUtensilio = tipoUtensilio;
    }

    public DescripcionUtensilio descripcionUtensilio() {
        return descripcionUtensilio;
    }

    public TipoUtensilio tipoUtensilio() {
        return tipoUtensilio;
    }
    
}
