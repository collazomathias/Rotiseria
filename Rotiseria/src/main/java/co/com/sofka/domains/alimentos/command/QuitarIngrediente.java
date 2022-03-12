package co.com.sofka.domains.alimentos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.Ingrediente;

public class QuitarIngrediente extends Command {

    private final AlimentoId alimentoId;
    private final Ingrediente ingrediente;

    public QuitarIngrediente(AlimentoId alimentoId, Ingrediente ingrediente) {
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
