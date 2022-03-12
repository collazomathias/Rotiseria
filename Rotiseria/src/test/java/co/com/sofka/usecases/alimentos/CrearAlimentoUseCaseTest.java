package co.com.sofka.usecases.alimentos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domains.alimentos.Categoria;
import co.com.sofka.domains.alimentos.Coccion;
import co.com.sofka.domains.alimentos.command.CrearAlimento;
import co.com.sofka.domains.alimentos.event.AlimentoCreado;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.CategoriaId;
import co.com.sofka.domains.alimentos.value.CoccionId;
import co.com.sofka.domains.alimentos.value.Duracion;
import co.com.sofka.domains.alimentos.value.NombreAlimento;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;
import co.com.sofka.domains.alimentos.value.Procedencia;
import co.com.sofka.domains.alimentos.value.Temperatura;
import co.com.sofka.domains.alimentos.value.TipoCategoria;
import co.com.sofka.domains.alimentos.value.TipoCoccion;

public class CrearAlimentoUseCaseTest {
    
    @Test
    void CrearAlimento(){

        AlimentoId alimentoId = new AlimentoId();
        Categoria categoria = new Categoria(alimentoId, new CategoriaId(), new Procedencia(""), new TipoCategoria(""));
        Coccion coccion = new Coccion(new AlimentoId(), new CoccionId(), new Duracion(0D), new Temperatura(0), new TipoCoccion(""));
        PrecioAlimento precioAlimento = new PrecioAlimento(0D);
        NombreAlimento nombreAlimento = new NombreAlimento("");

        var command = new CrearAlimento(alimentoId, categoria, precioAlimento, coccion, nombreAlimento);
        var useCase = new CrearAlimentoUseCase();

        var events = UseCaseHandler.getInstance()
            .syncExecutor(useCase, new RequestCommand<>(command))
            .orElseThrow()
            .getDomainEvents();
        
        var event = (AlimentoCreado)events.get(0);
        Assertions.assertEquals("alimentos.event.alimentocreado", event.type);
        Assertions.assertEquals(alimentoId.value(), event.aggregateRootId());
        
    }

}
