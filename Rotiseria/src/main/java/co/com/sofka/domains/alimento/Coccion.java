package co.com.sofka.domains.alimento;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.alimento.value.coccion.CoccionId;
import co.com.sofka.domains.alimento.value.coccion.Duracion;
import co.com.sofka.domains.alimento.value.coccion.Temperatura;
import co.com.sofka.domains.alimento.value.coccion.TipoCoccion;

public class Coccion extends Entity<CoccionId> {

    private final Duracion duracion;
    private final Temperatura temperatura;
    private final TipoCoccion tipoCoccion;

    public Coccion(CoccionId coccionId,
                Duracion duracion,
                Temperatura temperatura,
                TipoCoccion tipoCoccion) {
        super(coccionId);
        this.duracion = duracion;
        this.temperatura = temperatura;
        this.tipoCoccion = tipoCoccion;
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
