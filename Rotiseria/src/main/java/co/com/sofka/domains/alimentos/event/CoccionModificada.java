package co.com.sofka.domains.alimentos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.CoccionId;
import co.com.sofka.domains.alimentos.value.Duracion;
import co.com.sofka.domains.alimentos.value.Temperatura;
import co.com.sofka.domains.alimentos.value.TipoCoccion;

public class CoccionModificada extends DomainEvent {
    
    private final AlimentoId alimentoId;
    private final CoccionId coccionId;
    private final Duracion duracion;
    private final Temperatura temperatura;
    private final TipoCoccion tipoCoccion;

    public CoccionModificada(AlimentoId alimentoId, CoccionId coccionId, Duracion duracion, Temperatura temperatura, TipoCoccion tipoCoccion) {
        super("alimentos.event.coccionmodificada");
        this.alimentoId = alimentoId;
        this.coccionId = coccionId;
        this.duracion = duracion;
        this.temperatura = temperatura;
        this.tipoCoccion = tipoCoccion;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public CoccionId getCoccionId() {
        return coccionId;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public TipoCoccion getTipoCoccion() {
        return tipoCoccion;
    }

}
