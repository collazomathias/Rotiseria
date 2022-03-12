package co.com.sofka.domains.alimentos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.value.CategoriaId;
import co.com.sofka.domains.alimentos.value.Procedencia;
import co.com.sofka.domains.alimentos.value.TipoCategoria;

public class ModificarCategoria extends Command {

    private final CategoriaId categoriaId;
    private final Procedencia procedencia;
    private final TipoCategoria tipoCategoria;

    public ModificarCategoria(CategoriaId categoriaId, Procedencia procedencia, TipoCategoria tipoCategoria) {
        this.categoriaId = categoriaId;
        this.procedencia = procedencia;
        this.tipoCategoria = tipoCategoria;
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
