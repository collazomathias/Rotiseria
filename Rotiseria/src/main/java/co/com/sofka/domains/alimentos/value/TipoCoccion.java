package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.ValueObject;

public class TipoCoccion implements ValueObject<String> {
    
    private final String value;

    public TipoCoccion(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

}
