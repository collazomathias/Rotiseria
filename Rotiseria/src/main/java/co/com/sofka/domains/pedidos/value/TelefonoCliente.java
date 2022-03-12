package co.com.sofka.domains.pedidos.value;

import co.com.sofka.domain.generic.ValueObject;

public class TelefonoCliente implements ValueObject<String> {

    private final String value;

    public TelefonoCliente(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
    
}
