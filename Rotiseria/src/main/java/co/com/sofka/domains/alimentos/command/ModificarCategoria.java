package co.com.sofka.domains.alimentos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.Categoria;
import co.com.sofka.domains.alimentos.value.AlimentoId;

public class ModificarCategoria extends Command {

    private final AlimentoId alimentoId;
    private final Categoria categoria;

    public ModificarCategoria(AlimentoId alimentoId, Categoria categoria) {
        this.alimentoId = alimentoId;
        this.categoria = categoria;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    
}
