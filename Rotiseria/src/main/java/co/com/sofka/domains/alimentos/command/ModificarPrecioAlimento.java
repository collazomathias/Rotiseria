package co.com.sofka.domains.alimentos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;

public class ModificarPrecioAlimento extends Command {

    private final AlimentoId alimentoId;
    private final PrecioAlimento precioAlimento;

    public ModificarPrecioAlimento(AlimentoId alimentoId, PrecioAlimento precioAlimento) {
        this.alimentoId = alimentoId;
        this.precioAlimento = precioAlimento;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public PrecioAlimento getPrecioAlimento() {
        return precioAlimento;
    }
    
}
