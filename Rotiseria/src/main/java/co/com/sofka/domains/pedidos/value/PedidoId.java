package co.com.sofka.domains.pedidos.value;

import co.com.sofka.domain.generic.Identity;

public class PedidoId extends Identity {
    
    private PedidoId(String pedidoId){
        super(pedidoId);
    }

    public PedidoId(){}

    public static PedidoId of(String pedidoId) {
        return new PedidoId(pedidoId);
    }

}
