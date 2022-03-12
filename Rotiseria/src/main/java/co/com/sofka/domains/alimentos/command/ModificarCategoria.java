package co.com.sofka.domains.alimentos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.CategoriaId;
import co.com.sofka.domains.alimentos.value.Procedencia;
import co.com.sofka.domains.alimentos.value.TipoCategoria;

public class ModificarCategoria extends Command {

    private final AlimentoId alimentoId;
    private final CategoriaId categoriaId;
    private final Procedencia procedencia;
    private final TipoCategoria tipoCategoria;

    public ModificarCategoria(AlimentoId alimentoId, CategoriaId categoriaId, Procedencia procedencia, TipoCategoria tipoCategoria) {
        this.alimentoId = alimentoId;
        this.categoriaId = categoriaId;
        this.procedencia = procedencia;
        this.tipoCategoria = tipoCategoria;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public Procedencia getProcedencia() {
        return procedencia;
    }

    public TipoCategoria getTipoCategoria() {
        return tipoCategoria;
    }
    
}
