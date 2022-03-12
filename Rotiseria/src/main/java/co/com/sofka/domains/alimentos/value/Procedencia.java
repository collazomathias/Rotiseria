package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.ValueObject;

public class Procedencia implements ValueObject<String> {
    
    private final String value;

    public Procedencia(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

}
