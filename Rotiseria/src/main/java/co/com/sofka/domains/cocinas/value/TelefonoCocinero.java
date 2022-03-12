package co.com.sofka.domains.cocinas.value;

import co.com.sofka.domain.generic.ValueObject;

public class TelefonoCocinero implements ValueObject<String> {

    private final String value;

    public TelefonoCocinero(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
    
}
