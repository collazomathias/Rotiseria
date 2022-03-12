package co.com.sofka.domains.alimentos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.CategoriaId;
import co.com.sofka.domains.alimentos.value.Procedencia;
import co.com.sofka.domains.alimentos.value.TipoCategoria;

public class CategoriaModificada extends DomainEvent {
    
    private final AlimentoId alimentoId;
    private final CategoriaId categoriaId;
    private final Procedencia procedencia;
    private final TipoCategoria tipoCategoria;

    public CategoriaModificada(AlimentoId alimentoId, CategoriaId categoriaId, Procedencia procedencia, TipoCategoria tipoCategoria) {
        super("alimentos.event.categoriamodificada");
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
