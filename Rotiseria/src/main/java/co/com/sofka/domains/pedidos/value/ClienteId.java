package co.com.sofka.domains.pedidos.value;

import co.com.sofka.domain.generic.Identity;

public class ClienteId extends Identity {
    
    private ClienteId(String clienteId){
        super(clienteId);
    }

    public ClienteId(){}

    public static ClienteId of(String clienteId) {
        return new ClienteId(clienteId);
    }

}
