package co.com.sofka.domains.pedidos;

import java.util.ArrayList;

import co.com.sofka.domain.generic.AggregateEvent;
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

    public void AgregarAlimento(AlimentoId alimentoId, Categoria categoria, Coccion coccion, PrecioAlimento precioAlimento, NombreAlimento nombreAlimento) {
        appendChange(new AlimentoAgregado(alimentoId, categoria, coccion, precioAlimento, nombreAlimento)).apply();
    }

    public void QuitarAlimento(AlimentoId alimentoId, PrecioAlimento precioAlimento) {
        appendChange(new AlimentoQuitado(alimentoId, precioAlimento)).apply();
    }

    public void ModificarCliente(ClienteId clienteId, NombreCliente nombreCliente, TelefonoCliente telefonoCliente, ArrayList<DestinoId> destinos) {
        appendChange(new ClienteModificado(clienteId, nombreCliente, telefonoCliente, destinos)).apply();
    }

    public void ModificarDestino(DestinoId destinoId, Calle calle, Ciudad ciudad, Numero numero) {
        appendChange(new DestinoModificado(destinoId, calle, ciudad, numero)).apply();
    }

    public void ModificarHoraEntrega(HoraEntrega horaEntrega) {
        appendChange(new HoraEntregaModificada(horaEntrega)).apply();
    }

    public void ModificarPrecioPedido(PrecioPedido precioPedido) {
        appendChange(new PrecioPedidoModificado(precioPedido)).apply();
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
