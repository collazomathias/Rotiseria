package co.com.sofka.domains.pedidos;

import java.util.ArrayList;
import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.Categoria;
import co.com.sofka.domains.alimentos.Coccion;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.NombreAlimento;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;
import co.com.sofka.domains.pedidos.event.AlimentoAgregado;
import co.com.sofka.domains.pedidos.event.AlimentoQuitado;
import co.com.sofka.domains.pedidos.event.ClienteModificado;
import co.com.sofka.domains.pedidos.event.DestinoModificado;
import co.com.sofka.domains.pedidos.event.HoraEntregaModificada;
import co.com.sofka.domains.pedidos.event.PedidoCreado;
import co.com.sofka.domains.pedidos.event.PrecioPedidoModificado;
import co.com.sofka.domains.pedidos.value.Calle;
import co.com.sofka.domains.pedidos.value.Ciudad;
import co.com.sofka.domains.pedidos.value.ClienteId;
import co.com.sofka.domains.pedidos.value.DestinoId;
import co.com.sofka.domains.pedidos.value.HoraEntrega;
import co.com.sofka.domains.pedidos.value.NombreCliente;
import co.com.sofka.domains.pedidos.value.Numero;
import co.com.sofka.domains.pedidos.value.PedidoId;
import co.com.sofka.domains.pedidos.value.PrecioPedido;
import co.com.sofka.domains.pedidos.value.TelefonoCliente;

public class Pedido extends AggregateEvent<PedidoId> {

    protected HoraEntrega horaEntrega;
    protected Cliente cliente;
    protected Destino destino;
    protected PrecioPedido precioPedido;
    protected ArrayList<AlimentoId> alimentos;

    public Pedido(PedidoId pedidoId, HoraEntrega horaEntrega, Cliente cliente) {
        super(pedidoId);
        appendChange(new PedidoCreado(horaEntrega, cliente, destino)).apply();
        subscribe(new PedidoEventChange(this));
    }

    private Pedido(PedidoId pedidoId){
        super(pedidoId);
        subscribe(new PedidoEventChange(this));
    }

    public static Pedido from(PedidoId pedidoId, List<DomainEvent> events){
        var pedido = new Pedido(pedidoId);
        events.forEach(pedido::applyEvent);
        return pedido;
    }

    public void AgregarAlimento(PedidoId pedidoId, AlimentoId alimentoId, Categoria categoria, Coccion coccion, PrecioAlimento precioAlimento, NombreAlimento nombreAlimento) {
        appendChange(new AlimentoAgregado(pedidoId, alimentoId, categoria, coccion, precioAlimento, nombreAlimento)).apply();
    }

    public void QuitarAlimento(PedidoId pedidoId, AlimentoId alimentoId, PrecioAlimento precioAlimento) {
        appendChange(new AlimentoQuitado(pedidoId, alimentoId, precioAlimento)).apply();
    }

    public void ModificarCliente(PedidoId pedidoId, ClienteId clienteId, NombreCliente nombreCliente, TelefonoCliente telefonoCliente, ArrayList<DestinoId> destinos) {
        appendChange(new ClienteModificado(pedidoId, clienteId, nombreCliente, telefonoCliente, destinos)).apply();
    }

    public void ModificarDestino(PedidoId pedidoId, DestinoId destinoId, Calle calle, Ciudad ciudad, Numero numero) {
        appendChange(new DestinoModificado(pedidoId, destinoId, calle, ciudad, numero)).apply();
    }

    public void ModificarHoraEntrega(PedidoId pedidoId, HoraEntrega horaEntrega) {
        appendChange(new HoraEntregaModificada(pedidoId, horaEntrega)).apply();
    }

    public void ModificarPrecioPedido(PedidoId pedidoId, PrecioPedido precioPedido) {
        appendChange(new PrecioPedidoModificado(pedidoId, precioPedido)).apply();
    }

    public ArrayList<AlimentoId> alimentos() {
        return alimentos;
    }

    public Cliente cliente() {
        return cliente;
    }

    public Destino destino() {
        return destino;
    }

    public HoraEntrega horaEntrega() {
        return horaEntrega;
    }
    
}
