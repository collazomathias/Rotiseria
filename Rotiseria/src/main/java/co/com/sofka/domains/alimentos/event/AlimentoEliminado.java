package co.com.sofka.domains.alimentos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;

public class AlimentoEliminado extends DomainEvent {

    private final AlimentoId alimentoId;

    public AlimentoEliminado(AlimentoId alimentoId) {
        super("alimentos.event.alimentoeliminado");
        this.alimentoId = alimentoId;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }    
}
