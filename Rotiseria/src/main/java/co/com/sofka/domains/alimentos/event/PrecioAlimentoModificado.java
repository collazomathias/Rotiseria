package co.com.sofka.domains.alimentos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;

public class PrecioAlimentoModificado extends DomainEvent {
    
    private final AlimentoId alimentoId;
    private final PrecioAlimento precioAlimento;

    public PrecioAlimentoModificado(AlimentoId alimentoId, PrecioAlimento precioAlimento) {
        super("alimentos.event.precioalimentomodificado");
        this.alimentoId = alimentoId;
        this.precioAlimento = precioAlimento;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public PrecioAlimento getPrecioAlimento() {
        return precioAlimento;
    }

}
