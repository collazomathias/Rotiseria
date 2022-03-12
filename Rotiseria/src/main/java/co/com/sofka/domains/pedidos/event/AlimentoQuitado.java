package co.com.sofka.domains.pedidos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;

public class AlimentoQuitado extends DomainEvent {

    private final AlimentoId alimentoId;
    private final PrecioAlimento precioAlimento;

    public AlimentoQuitado(AlimentoId alimentoId, PrecioAlimento precioAlimento) {
        super("pedidos.event.alimentoquitado");
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
