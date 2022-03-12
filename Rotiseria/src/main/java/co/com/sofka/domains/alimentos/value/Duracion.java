package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.ValueObject;

public class Duracion implements ValueObject<Double> {
    
    private final Double value;

    public Duracion(Double value) {
        this.value = value;
    }

    @Override
    public Double value() {
        return value;
    }

}
