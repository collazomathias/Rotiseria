package co.com.sofka.domains.pedidos.event;

import java.util.ArrayList;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.pedidos.value.ClienteId;
import co.com.sofka.domains.pedidos.value.DestinoId;
import co.com.sofka.domains.pedidos.value.NombreCliente;
import co.com.sofka.domains.pedidos.value.TelefonoCliente;

public class ClienteModificado extends DomainEvent {

    private final ClienteId clienteId;
    private final NombreCliente nombreCliente;
    private final TelefonoCliente telefonoCliente;
    private final ArrayList<DestinoId> destinos;

    public ClienteModificado(ClienteId clienteId, NombreCliente nombreCliente, TelefonoCliente telefonoCliente, ArrayList<DestinoId> destinos) {
        super("pedidos.event.clientemodificado");
        this.clienteId = clienteId;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.destinos = destinos;
    }
    
    public ClienteId getClienteId() {
        return clienteId;
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }

    public TelefonoCliente getTelefonoCliente() {
        return telefonoCliente;
    }

    public ArrayList<DestinoId> getDestinos() {
        return destinos;
    }
    
}
