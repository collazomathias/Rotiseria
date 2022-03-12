package co.com.sofka.domains.alimentos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.Ingrediente;

public class IngredienteAgregado extends DomainEvent {

    private final Ingrediente ingrediente;

    public IngredienteAgregado(Ingrediente ingrediente) {
        super("alimentos.event.ingredienteagregado");
        this.ingrediente = ingrediente;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }
    
}
