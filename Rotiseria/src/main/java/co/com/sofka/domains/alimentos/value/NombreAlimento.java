package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.ValueObject;

public class NombreAlimento implements ValueObject<String> {
    
    private final String value;

    public NombreAlimento(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

}
