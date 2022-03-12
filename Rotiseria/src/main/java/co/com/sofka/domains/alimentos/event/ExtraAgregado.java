package co.com.sofka.domains.alimentos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.DescripcionExtra;
import co.com.sofka.domains.alimentos.value.ExtraId;
import co.com.sofka.domains.alimentos.value.PrecioExtra;
import co.com.sofka.domains.alimentos.value.TipoExtra;

public class ExtraAgregado extends DomainEvent {
    
    private final AlimentoId alimentoId;
    private final ExtraId extraId;
    private final PrecioExtra precioExtra;
    private final TipoExtra tipoExtra;
    private final DescripcionExtra descripcionExtra;

    public ExtraAgregado(AlimentoId alimentoId, ExtraId extraId, PrecioExtra precioExtra, TipoExtra tipoExtra, DescripcionExtra descripcionExtra) {
        super("alimentos.event.extraagregado");
        this.alimentoId = alimentoId;
        this.extraId = extraId;
        this.precioExtra = precioExtra;
        this.tipoExtra = tipoExtra;
        this.descripcionExtra = descripcionExtra;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public ExtraId getExtraId() {
        return extraId;
    }

    public PrecioExtra getPrecioExtra() {
        return precioExtra;
    }
    
    public DescripcionExtra getDescripcionExtra() {
        return descripcionExtra;
    }

    public TipoExtra getTipoExtra() {
        return tipoExtra;
    }

}
