package co.com.sofka.domains.cocinas.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.cocinas.value.CocineroId;
import co.com.sofka.domains.cocinas.value.Especialidad;
import co.com.sofka.domains.cocinas.value.NombreCocinero;
import co.com.sofka.domains.cocinas.value.TelefonoCocinero;

public class CocineroModificado extends DomainEvent {

    private final CocineroId cocineroId;
    private final NombreCocinero nombreCocinero;
    private final TelefonoCocinero telefonoCocinero;
    private final Especialidad especialidad;

    public CocineroModificado(CocineroId cocineroId, NombreCocinero nombreCocinero, TelefonoCocinero telefonoCocinero, Especialidad especialidad) {
        super("cocinas.event.cocineromodificado");
        this.cocineroId = cocineroId;
        this.nombreCocinero = nombreCocinero;
        this.telefonoCocinero = telefonoCocinero;
        this.especialidad = especialidad;
    }

    public CocineroId getCocineroId() {
        return cocineroId;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public NombreCocinero getNombreCocinero() {
        return nombreCocinero;
    }
    
    public TelefonoCocinero getTelefonoCocinero() {
        return telefonoCocinero;
    }
    
}
