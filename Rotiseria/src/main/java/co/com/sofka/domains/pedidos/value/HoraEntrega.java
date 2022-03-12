package co.com.sofka.domains.pedidos.value;

import java.sql.Time;

import co.com.sofka.domain.generic.ValueObject;

public class HoraEntrega implements ValueObject<Time> {
    
    private final Time value;

    public HoraEntrega(Time value) {
        this.value = value;
    }

    @Override
    public Time value() {
        return value;
    }

}
