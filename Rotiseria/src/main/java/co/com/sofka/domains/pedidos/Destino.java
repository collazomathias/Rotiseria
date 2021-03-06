package co.com.sofka.domains.pedidos;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.pedidos.value.Calle;
import co.com.sofka.domains.pedidos.value.Ciudad;
import co.com.sofka.domains.pedidos.value.DestinoId;
import co.com.sofka.domains.pedidos.value.Numero;

public class Destino extends Entity<DestinoId> {

    private final Calle calle;
    private final Ciudad ciudad;
    private final Numero numero;

    public Destino(DestinoId destinoId, 
                Calle calle, 
                Ciudad ciudad, 
                Numero numero) {
        super(destinoId);
        this.calle = calle;
        this.ciudad = ciudad;
        this.numero = numero;
    }

    public Calle calle() {
        return calle;
    }

    public Ciudad ciudad() {
        return ciudad;
    }

    public Numero numero() {
        return numero;
    }
    
}
