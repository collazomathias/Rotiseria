package co.com.sofka.domains.alimentos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.Ingrediente;

public class IngredienteQuitado extends DomainEvent {
    
    private final Ingrediente ingrediente;

    public IngredienteQuitado(Ingrediente ingrediente) {
        super("alimentos.event.ingredientequitado");
        this.ingrediente = ingrediente;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

}
