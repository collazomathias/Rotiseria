package co.com.sofka.domains.alimentos;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.CategoriaId;
import co.com.sofka.domains.alimentos.value.Procedencia;
import co.com.sofka.domains.alimentos.value.TipoCategoria;

public class Categoria extends Entity<CategoriaId> {

    private final AlimentoId alimentoId;
    private final Procedencia procedencia;
    private final TipoCategoria tipoCategoria;

    public Categoria(AlimentoId alimentoId, 
                    CategoriaId categoriaId, 
                    Procedencia procedencia,
                    TipoCategoria tipoCategoria) {
        super(categoriaId);
        this.alimentoId = alimentoId;
        this.procedencia = procedencia;
        this.tipoCategoria = tipoCategoria;
    }

    public AlimentoId alimentoId() {
        return alimentoId;
    }

    public Procedencia procedencia() {
        return procedencia;
    }

    public TipoCategoria tipoCategoria() {
        return tipoCategoria;
    }
    
}
