package co.com.sofka.domains.pedidos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.pedidos.value.Calle;
import co.com.sofka.domains.pedidos.value.Ciudad;
import co.com.sofka.domains.pedidos.value.DestinoId;
import co.com.sofka.domains.pedidos.value.Numero;

public class DestinoModificado extends DomainEvent {
    
    private final DestinoId destinoId;
    private final Calle calle;
    private final Ciudad ciudad;
    private final Numero numero;

    public DestinoModificado(DestinoId destinoId, Calle calle, Ciudad ciudad, Numero numero) {
        super("pedidos.event.destinomodificado");
        this.destinoId = destinoId;
        this.calle = calle;
        this.ciudad = ciudad;
        this.numero = numero;
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
