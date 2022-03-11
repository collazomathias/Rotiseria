package co.com.sofka.domains.cocina;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.cocina.value.cocinero.CocineroId;
import co.com.sofka.domains.cocina.value.cocinero.Especialidad;
import co.com.sofka.domains.cocina.value.cocinero.NombreCocinero;
import co.com.sofka.domains.cocina.value.cocinero.TelefonoCocinero;

public class Cocinero extends Entity<CocineroId> {

    private final NombreCocinero nombreCocinero;
    private final Especialidad especialidad;
    private final TelefonoCocinero telefonoCocinero;

    public Cocinero(CocineroId cocineroId, 
                    NombreCocinero nombreCocinero, 
                    Especialidad especialidad, 
                    TelefonoCocinero telefonoCocinero) {
        super(cocineroId);
        this.nombreCocinero = nombreCocinero;
        this.especialidad = especialidad;
        this.telefonoCocinero = telefonoCocinero;
    }

    public Especialidad especialidad() {
        return especialidad;
    }

    public NombreCocinero nombreCocinero() {
        return nombreCocinero;
    }

    public TelefonoCocinero telefonoCocinero() {
        return telefonoCocinero;
    }
    
}
