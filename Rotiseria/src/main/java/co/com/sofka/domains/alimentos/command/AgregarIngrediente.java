package co.com.sofka.domains.alimentos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.value.Ingrediente;

public class AgregarIngrediente extends Command {

    private final Ingrediente ingrediente;

    public AgregarIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }
    
}
