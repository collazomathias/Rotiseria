package co.com.sofka.domains.alimentos.command;

import java.util.Set;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.Extra;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;

public class QuitarExtra extends Command {

    private final AlimentoId alimentoId;
    private final PrecioAlimento precioAlimento;
    private final Set<Extra> extras;

    public QuitarExtra(AlimentoId alimentoId, PrecioAlimento precioAlimento, Set<Extra> extras) {
        this.alimentoId = alimentoId;
        this.precioAlimento = precioAlimento;
        this.extras = extras;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public Set<Extra> getExtras() {
        return extras;
    }

    public PrecioAlimento getPrecioAlimento() {
        return precioAlimento;
    }
    
}
