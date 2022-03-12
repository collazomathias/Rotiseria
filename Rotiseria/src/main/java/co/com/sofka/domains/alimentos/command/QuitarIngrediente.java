package co.com.sofka.domains.alimentos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.value.Ingrediente;

public class QuitarIngrediente extends Command {

    private final Ingrediente ingrediente;

    public QuitarIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }
    
}
