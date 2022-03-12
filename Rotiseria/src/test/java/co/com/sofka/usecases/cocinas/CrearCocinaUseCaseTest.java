package co.com.sofka.usecases.cocinas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domains.cocinas.Cocinero;
import co.com.sofka.domains.cocinas.command.CrearCocina;
import co.com.sofka.domains.cocinas.event.CocinaCreada;
import co.com.sofka.domains.cocinas.value.CocinaId;
import co.com.sofka.domains.cocinas.value.CocineroId;
import co.com.sofka.domains.cocinas.value.Especialidad;
import co.com.sofka.domains.cocinas.value.NombreCocinero;
import co.com.sofka.domains.cocinas.value.TelefonoCocinero;

public class CrearCocinaUseCaseTest {

    @Test
    void CrearCocina(){

        CocinaId cocinaId = new CocinaId();
        Cocinero cocinero = new Cocinero(new CocineroId(), new NombreCocinero("NombreCocineroTest"), new Especialidad("EspecialidadTest"), new TelefonoCocinero("TelefonoCocineroTest"));
        
        var command = new CrearCocina(cocinaId, cocinero);
        var useCase = new CrearCocinaUseCase();

        var events = UseCaseHandler.getInstance()
            .syncExecutor(useCase, new RequestCommand<>(command))
            .orElseThrow()
            .getDomainEvents();
        
        var event = (CocinaCreada)events.get(0);
        Assertions.assertEquals("cocinas.event.cocinacreada", event.type);
        Assertions.assertEquals(cocinaId.value(), event.aggregateRootId());

    }

}
