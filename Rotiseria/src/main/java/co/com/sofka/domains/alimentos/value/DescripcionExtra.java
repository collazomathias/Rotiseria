package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.ValueObject;

public class DescripcionExtra implements ValueObject<String> {

    private final String value;

    public DescripcionExtra(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
    
}
