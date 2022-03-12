package co.com.sofka.domains.pedidos.command;

import java.util.ArrayList;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.pedidos.value.ClienteId;
import co.com.sofka.domains.pedidos.value.DestinoId;
import co.com.sofka.domains.pedidos.value.NombreCliente;
import co.com.sofka.domains.pedidos.value.PedidoId;
import co.com.sofka.domains.pedidos.value.TelefonoCliente;

public class ModificarCliente extends Command {
    
    private final PedidoId pedidoId;
    private final ClienteId clienteId;
    private final NombreCliente nombreCliente;
    private final TelefonoCliente telefonoCliente;
    private final ArrayList<DestinoId> destinos;

    public ModificarCliente(PedidoId pedidoId, ClienteId clienteId, NombreCliente nombreCliente, TelefonoCliente telefonoCliente, ArrayList<DestinoId> destinos) {
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.destinos = destinos;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public ArrayList<DestinoId> getDestinos() {
        return destinos;
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public TelefonoCliente getTelefonoCliente() {
        return telefonoCliente;
    }

}
