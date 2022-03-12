package co.com.sofka.domains.alimentos.command;

import java.util.Set;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.Ingrediente;

public class AgregarIngrediente extends Command {

    private final AlimentoId alimentoId;
    private final Set<Ingrediente> ingredientes;

    public AgregarIngrediente(AlimentoId alimentoId, Set<Ingrediente> ingredientes) {
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
