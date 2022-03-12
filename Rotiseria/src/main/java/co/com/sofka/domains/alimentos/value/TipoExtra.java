package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.ValueObject;

public class TipoExtra implements ValueObject<String> {
    
    private final String value;

    public TipoExtra(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

}
