package co.com.sofka.domains.alimentos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;

public class ModificarPrecioAlimento extends Command {

    private final PrecioAlimento precioAlimento;

    public ModificarPrecioAlimento(PrecioAlimento precioAlimento) {
        this.precioAlimento = precioAlimento;
    }

    public PrecioAlimento getPrecioAlimento() {
        return precioAlimento;
    }
    
}
