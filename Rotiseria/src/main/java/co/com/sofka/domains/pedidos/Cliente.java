package co.com.sofka.domains.pedidos;

import java.util.ArrayList;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.pedidos.value.ClienteId;
import co.com.sofka.domains.pedidos.value.DestinoId;
import co.com.sofka.domains.pedidos.value.NombreCliente;
import co.com.sofka.domains.pedidos.value.TelefonoCliente;

public class Cliente extends Entity<ClienteId> {

    private final NombreCliente nombreCliente;
    private final TelefonoCliente telefonoCliente;
    protected ArrayList<DestinoId> destinos;

    public Cliente(ClienteId clienteId, 
                NombreCliente nombreCliente,
                TelefonoCliente telefonoCliente) {
        super(clienteId);
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
    }

    public NombreCliente nombreCliente() {
        return nombreCliente;
    }

    public TelefonoCliente telefonoCliente() {
        return telefonoCliente;
    }

    public ArrayList<DestinoId> destinos() {
        return destinos;
    }
    
}
