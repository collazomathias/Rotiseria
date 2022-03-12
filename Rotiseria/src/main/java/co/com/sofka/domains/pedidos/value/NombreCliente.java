package co.com.sofka.domains.pedidos.value;

import co.com.sofka.domain.generic.ValueObject;

public class NombreCliente implements ValueObject<String> {

    private final String value;

    public NombreCliente(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
    
}
