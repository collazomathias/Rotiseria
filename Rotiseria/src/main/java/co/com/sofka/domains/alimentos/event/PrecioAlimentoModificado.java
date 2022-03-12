package co.com.sofka.domains.alimentos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;

public class PrecioAlimentoModificado extends DomainEvent {
    
    private final PrecioAlimento precioAlimento;

    public PrecioAlimentoModificado(PrecioAlimento precioAlimento) {
        super("alimentos.event.precioalimentomodificado");
        this.precioAlimento = precioAlimento;
    }

    public PrecioAlimento getPrecioAlimento() {
        return precioAlimento;
    }

}
