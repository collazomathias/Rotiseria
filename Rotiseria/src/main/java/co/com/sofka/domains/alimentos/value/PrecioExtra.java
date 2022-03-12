package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.ValueObject;

public class PrecioExtra implements ValueObject<Double> {
    
    private final Double value;

    public PrecioExtra(Double value) {
        this.value = value;
    }

    @Override
    public Double value() {
        return value;
    }

}
