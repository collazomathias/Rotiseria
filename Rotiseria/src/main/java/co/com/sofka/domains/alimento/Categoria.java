package co.com.sofka.domains.alimento;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.alimento.value.categoria.CategoriaId;
import co.com.sofka.domains.alimento.value.categoria.Procedencia;
import co.com.sofka.domains.alimento.value.categoria.TipoCategoria;

public class Categoria extends Entity<CategoriaId> {

    private final Procedencia procedencia;
    private final TipoCategoria tipoCategoria;

    public Categoria(CategoriaId categoriaId, 
                    Procedencia procedencia,
                    TipoCategoria tipoCategoria) {
        super(categoriaId);
        this.procedencia = procedencia;
        this.tipoCategoria = tipoCategoria;
    }

    public Procedencia procedencia() {
        return procedencia;
    }

    public TipoCategoria tipoCategoria() {
        return tipoCategoria;
    }
    
}
