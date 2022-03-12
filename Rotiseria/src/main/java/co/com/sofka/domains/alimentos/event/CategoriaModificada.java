package co.com.sofka.domains.alimentos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.Categoria;
import co.com.sofka.domains.alimentos.value.AlimentoId;

public class CategoriaModificada extends DomainEvent {
    
    private final AlimentoId alimentoId;
    private final Categoria categoria;

    public CategoriaModificada(AlimentoId alimentoId, Categoria categoria) {
        super("alimentos.event.categoriamodificada");
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
