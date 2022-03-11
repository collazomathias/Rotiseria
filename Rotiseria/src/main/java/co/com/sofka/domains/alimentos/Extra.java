package co.com.sofka.domains.alimentos;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.alimentos.value.DescripcionExtra;
import co.com.sofka.domains.alimentos.value.ExtraId;
import co.com.sofka.domains.alimentos.value.PrecioExtra;
import co.com.sofka.domains.alimentos.value.TipoExtra;

public class Extra extends Entity<ExtraId> {

    private final PrecioExtra precioExtra;
    private final TipoExtra tipoExtra;
    private final DescripcionExtra descripcionExtra;

    public Extra(ExtraId extraId, 
                PrecioExtra precioExtra, 
                TipoExtra tipoExtra, 
                DescripcionExtra descripcionExtra) {
        super(extraId);
        this.precioExtra = precioExtra;
        this.tipoExtra = tipoExtra;
        this.descripcionExtra = descripcionExtra;
    }

    public DescripcionExtra descripcionExtra() {
        return descripcionExtra;
    }

    public PrecioExtra precioExtra() {
        return precioExtra;
    }

    public TipoExtra tipoExtra() {
        return tipoExtra;
    }
    
}
