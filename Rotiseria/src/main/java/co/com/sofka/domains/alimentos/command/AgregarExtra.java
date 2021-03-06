package co.com.sofka.domains.alimentos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.DescripcionExtra;
import co.com.sofka.domains.alimentos.value.ExtraId;
import co.com.sofka.domains.alimentos.value.PrecioExtra;
import co.com.sofka.domains.alimentos.value.TipoExtra;

public class AgregarExtra extends Command {

    private final AlimentoId alimentoId;
    private final ExtraId extraId;
    private final PrecioExtra precioExtra;
    private final TipoExtra tipoExtra;
    private final DescripcionExtra descripcionExtra;

    public AgregarExtra(AlimentoId alimentoId, ExtraId extraId, PrecioExtra precioExtra, TipoExtra tipoExtra, DescripcionExtra descripcionExtra) {
        this.alimentoId = alimentoId;
        this.extraId = extraId;
        this.precioExtra = precioExtra;
        this.tipoExtra = tipoExtra;
        this.descripcionExtra = descripcionExtra;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public DescripcionExtra getDescripcionExtra() {
        return descripcionExtra;
    }

    public ExtraId getExtraId() {
        return extraId;
    }

    public PrecioExtra getPrecioExtra() {
        return precioExtra;
    }
    
    public TipoExtra getTipoExtra() {
        return tipoExtra;
    }
    
}
