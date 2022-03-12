package co.com.sofka.domains.cocinas.value;

import co.com.sofka.domain.generic.ValueObject;

public class DescripcionUtensilio implements ValueObject<String> {

    private final String value;

    public DescripcionUtensilio(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
    
}
