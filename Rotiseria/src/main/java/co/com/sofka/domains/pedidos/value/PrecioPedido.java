package co.com.sofka.domains.pedidos.value;

import co.com.sofka.domain.generic.ValueObject;

public class PrecioPedido implements ValueObject<Double> {
    
    private final Double value;

    public PrecioPedido(Double value) {
        this.value = value;
    }

    @Override
    public Double value() {
        return value;
    }

}
