package co.com.sofka.domains.pedidos.value;

import co.com.sofka.domain.generic.ValueObject;

public class Ciudad implements ValueObject<String> {
    
    private final String value;

    public Ciudad(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

}
