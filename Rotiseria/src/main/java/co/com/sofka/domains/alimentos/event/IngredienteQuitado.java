package co.com.sofka.domains.alimentos.event;

import java.util.Set;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.Ingrediente;

public class IngredienteQuitado extends DomainEvent {
    
    private final AlimentoId alimentoId;
    private final Set<Ingrediente> ingredientes;

    public IngredienteQuitado(AlimentoId alimentoId, Set<Ingrediente> ingredientes) {
        super("alimentos.event.ingredientequitado");
        this.alimentoId = alimentoId;
        this.ingredientes = ingredientes;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public Set<Ingrediente> getIngredientes() {
        return ingredientes;
    }

}
