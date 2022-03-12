package co.com.sofka.domains.pedidos.value;

import co.com.sofka.domain.generic.Identity;

public class PedidoId extends Identity {

    protected PedidoId pedidoId;
    
    public PedidoId(PedidoId pedidoId){
        this.pedidoId = pedidoId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

}
