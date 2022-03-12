package co.com.sofka.domains.cocinas.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.cocinas.value.CocinaId;
import co.com.sofka.domains.cocinas.value.CocineroId;
import co.com.sofka.domains.cocinas.value.Especialidad;
import co.com.sofka.domains.cocinas.value.NombreCocinero;
import co.com.sofka.domains.cocinas.value.TelefonoCocinero;

public class ModificarCocinero extends Command {

    private final CocinaId cocinaId;
    private final CocineroId cocineroId;
    private final NombreCocinero nombreCocinero;
    private final TelefonoCocinero telefonoCocinero;
    private final Especialidad especialidad;

    public ModificarCocinero(CocinaId cocinaId, CocineroId cocineroId, NombreCocinero nombreCocinero, TelefonoCocinero telefonoCocinero, Especialidad especialidad) {
        this.cocinaId = cocinaId;
        this.cocineroId = cocineroId;
        this.nombreCocinero = nombreCocinero;
        this.telefonoCocinero = telefonoCocinero;
        this.especialidad = especialidad;
    }

    public CocinaId getCocinaId() {
        return cocinaId;
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
