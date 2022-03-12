package co.com.sofka.domains.pedidos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.pedidos.value.Calle;
import co.com.sofka.domains.pedidos.value.Ciudad;
import co.com.sofka.domains.pedidos.value.DestinoId;
import co.com.sofka.domains.pedidos.value.Numero;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class DestinoModificado extends DomainEvent {
    
    private final PedidoId pedidoId;
    private final DestinoId destinoId;
    private final Calle calle;
    private final Ciudad ciudad;
    private final Numero numero;

    public DestinoModificado(PedidoId pedidoId, DestinoId destinoId, Calle calle, Ciudad ciudad, Numero numero) {
        super("pedidos.event.destinomodificado");
        this.pedidoId = pedidoId;
        this.destinoId = destinoId;
        this.calle = calle;
        this.ciudad = ciudad;
        this.numero = numero;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public DestinoId getDestinoId() {
        return destinoId;
    }

    public Calle getCalle() {
        return calle;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public Numero getNumero() {
        return numero;
    }

}
