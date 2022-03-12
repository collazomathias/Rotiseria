package co.com.sofka.domains.alimentos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.Coccion;
import co.com.sofka.domains.alimentos.value.AlimentoId;

public class CoccionModificada extends DomainEvent {
    
    private final AlimentoId alimentoId;
    private final Coccion coccion;

    public CoccionModificada(AlimentoId alimentoId, Coccion coccion) {
        super("alimentos.event.coccionmodificada");
        this.alimentoId = alimentoId;
        this.coccion = coccion;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public Coccion getCoccion() {
        return coccion;
    }

}
