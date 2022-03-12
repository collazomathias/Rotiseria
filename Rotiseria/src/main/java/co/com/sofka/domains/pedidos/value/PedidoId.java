package co.com.sofka.domains.pedidos.value;

import co.com.sofka.domain.generic.Identity;

public class PedidoId extends Identity {

    protected PedidoId pedidoId;
    
    private PedidoId(String value) {
        super(value);
    }

    public PedidoId(){}

    public static PedidoId of(String value) {
        return new PedidoId(value);
    }

    public PedidoId pedidoId() {
        return pedidoId;
    }

}
