package co.com.sofka.domains.cocinas.value;

import co.com.sofka.domain.generic.ValueObject;

public class TipoUtensilio implements ValueObject<String> {

    private final String value;

    public TipoUtensilio(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
    
}
