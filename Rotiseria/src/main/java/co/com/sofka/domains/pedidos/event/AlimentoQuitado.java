package co.com.sofka.domains.pedidos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class AlimentoQuitado extends DomainEvent {

    private final PedidoId pedidoId;
    private final AlimentoId alimentoId;
    private final PrecioAlimento precioAlimento;

    public AlimentoQuitado(PedidoId pedidoId, AlimentoId alimentoId, PrecioAlimento precioAlimento) {
        super("pedidos.event.alimentoquitado");
        this.pedidoId = pedidoId;
        this.alimentoId = alimentoId;
        this.precioAlimento = precioAlimento;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public PrecioAlimento getPrecioAlimento() {
        return precioAlimento;
    }

}
