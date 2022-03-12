package co.com.sofka.domains.cocinas.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.cocinas.value.CocineroId;
import co.com.sofka.domains.cocinas.value.Especialidad;
import co.com.sofka.domains.cocinas.value.NombreCocinero;
import co.com.sofka.domains.cocinas.value.TelefonoCocinero;

public class ModificarCocinero extends Command {

    private final CocineroId cocineroId;
    private final NombreCocinero nombreCocinero;
    private final TelefonoCocinero telefonoCocinero;
    private final Especialidad especialidad;

    public ModificarCocinero(CocineroId cocineroId, NombreCocinero nombreCocinero, TelefonoCocinero telefonoCocinero, Especialidad especialidad) {
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
