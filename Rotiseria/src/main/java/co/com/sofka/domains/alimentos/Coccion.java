package co.com.sofka.domains.alimentos;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.CoccionId;
import co.com.sofka.domains.alimentos.value.Duracion;
import co.com.sofka.domains.alimentos.value.Temperatura;
import co.com.sofka.domains.alimentos.value.TipoCoccion;

public class Coccion extends Entity<CoccionId> {

    private final AlimentoId alimentoId;
    private final Duracion duracion;
    private final Temperatura temperatura;
    private final TipoCoccion tipoCoccion;

    public Coccion(AlimentoId alimentoId, 
                CoccionId coccionId,
                Duracion duracion,
                Temperatura temperatura,
                TipoCoccion tipoCoccion) {
        super(coccionId);
        this.alimentoId = alimentoId;
        this.duracion = duracion;
        this.temperatura = temperatura;
        this.tipoCoccion = tipoCoccion;
    }

    public AlimentoId alimentoId() {
        return alimentoId;
    }

    public Duracion duracion() {
        return duracion;
    }

    public Temperatura temperatura() {
        return temperatura;
    }
    
    public TipoCoccion tipoCoccion() {
        return tipoCoccion;
    }
    
}
