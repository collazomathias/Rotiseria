package co.com.sofka.domains.pedidos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.pedidos.value.Calle;
import co.com.sofka.domains.pedidos.value.Ciudad;
import co.com.sofka.domains.pedidos.value.DestinoId;
import co.com.sofka.domains.pedidos.value.Numero;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class ModificarDestino extends Command {

    private final PedidoId pedidoId;
    private final DestinoId destinoId;
    private final Calle calle;
    private final Ciudad ciudad;
    private final Numero numero;

    public ModificarDestino(PedidoId pedidoId, DestinoId destinoId, Calle calle, Ciudad ciudad, Numero numero) {
        this.pedidoId = pedidoId;
        this.destinoId = destinoId;
        this.calle = calle;
        this.ciudad = ciudad;
        this.numero = numero;
    }

    public Calle getCalle() {
        return calle;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public DestinoId getDestinoId() {
        return destinoId;
    }
    
    public Numero getNumero() {
        return numero;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

}
