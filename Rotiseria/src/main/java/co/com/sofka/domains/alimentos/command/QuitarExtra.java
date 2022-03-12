package co.com.sofka.domains.alimentos.command;


import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.value.ExtraId;
import co.com.sofka.domains.alimentos.value.PrecioExtra;

public class QuitarExtra extends Command {

    private final ExtraId extraId;
    private final PrecioExtra precioExtra;

    public QuitarExtra(ExtraId extraId, PrecioExtra precioExtra) {
        this.extraId = extraId;
        this.precioExtra = precioExtra;
    }

    public ExtraId getExtraId() {
        return extraId;
    }
    
    public PrecioExtra getPrecioExtra() {
        return precioExtra;
    }
    
}
