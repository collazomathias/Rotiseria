package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.ValueObject;

public class Temperatura implements ValueObject<Integer> {

    private final Integer value;

    public Temperatura(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }

}
