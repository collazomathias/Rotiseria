package co.com.sofka.domains.alimentos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.Ingrediente;

public class IngredienteQuitado extends DomainEvent {
    
    private final AlimentoId alimentoId;
    private final Ingrediente ingrediente;

    public IngredienteQuitado(AlimentoId alimentoId, Ingrediente ingrediente) {
        super("alimentos.event.ingredientequitado");
        this.alimentoId = alimentoId;
        this.ingrediente = ingrediente;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

}
