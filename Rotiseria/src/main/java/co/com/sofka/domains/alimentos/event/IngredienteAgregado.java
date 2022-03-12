package co.com.sofka.domains.alimentos.event;

import java.util.Set;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.Ingrediente;

public class IngredienteAgregado extends DomainEvent {

    private final AlimentoId alimentoId;
    private final Set<Ingrediente> ingredientes;

    public IngredienteAgregado(AlimentoId alimentoId, Set<Ingrediente> ingredientes) {
        super("alimentos.event.ingredienteagregado");
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
