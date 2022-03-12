package co.com.sofka.domains.pedidos.value;

import co.com.sofka.domain.generic.ValueObject;

public class Numero implements ValueObject<Integer> {

    private final Integer value;

    public Numero(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }

}
