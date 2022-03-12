package co.com.sofka.domains.pedidos.value;

import co.com.sofka.domain.generic.Identity;

public class DestinoId extends Identity {
    
    private DestinoId(String destinoId){
        super(destinoId);
    }

    public DestinoId(){}

    public static DestinoId of(String destinoId) {
        return new DestinoId(destinoId);
    }

}
