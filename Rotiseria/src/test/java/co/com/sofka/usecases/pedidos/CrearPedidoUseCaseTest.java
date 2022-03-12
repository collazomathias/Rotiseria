package co.com.sofka.usecases.pedidos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domains.pedidos.Cliente;
import co.com.sofka.domains.pedidos.Destino;
import co.com.sofka.domains.pedidos.command.CrearPedido;
import co.com.sofka.domains.pedidos.event.PedidoCreado;
import co.com.sofka.domains.pedidos.value.Calle;
import co.com.sofka.domains.pedidos.value.Ciudad;
import co.com.sofka.domains.pedidos.value.ClienteId;
import co.com.sofka.domains.pedidos.value.DestinoId;
import co.com.sofka.domains.pedidos.value.HoraEntrega;
import co.com.sofka.domains.pedidos.value.NombreCliente;
import co.com.sofka.domains.pedidos.value.Numero;
import co.com.sofka.domains.pedidos.value.PedidoId;
import co.com.sofka.domains.pedidos.value.TelefonoCliente;

public class CrearPedidoUseCaseTest {
    
    @Test
    void CrearPedido(){
        PedidoId pedidoId = new PedidoId();
        HoraEntrega horaEntrega = new HoraEntrega("22:00");
        Cliente cliente = new Cliente(new ClienteId(), new NombreCliente("NombreClienteTest"), new TelefonoCliente("+59899999999"));
        Destino destino = new Destino(new DestinoId(), new Calle("CalleTest"), new Ciudad("CiudadTest"), new Numero(1234));

        var command = new CrearPedido(pedidoId, horaEntrega, cliente, destino);
        var useCase = new CrearPedidoUseCase();

        var events = UseCaseHandler.getInstance()
            .syncExecutor(useCase, new RequestCommand<>(command))
            .orElseThrow()
            .getDomainEvents();

        var event = (PedidoCreado)events.get(0);
        Assertions.assertEquals("pedidos.event.pedidocreado", event.type);
        Assertions.assertEquals(pedidoId.value(), event.aggregateRootId());
        
    }

}
