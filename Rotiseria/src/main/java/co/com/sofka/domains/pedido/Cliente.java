package co.com.sofka.domains.pedido;

import java.util.Set;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domains.pedido.value.cliente.ClienteId;
import co.com.sofka.domains.pedido.value.cliente.NombreCliente;
import co.com.sofka.domains.pedido.value.cliente.TelefonoCliente;

public class Cliente extends Entity<ClienteId> {

    private final Set<Destino> destinos;
    private final NombreCliente nombreCliente;
    private final TelefonoCliente telefonoCliente;

    public Cliente(ClienteId clienteId, 
                Set<Destino> destinos,
                NombreCliente nombreCliente,
                TelefonoCliente telefonoCliente) {
        super(clienteId);
        this.destinos = destinos;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
    }

    public Set<Destino> destinos() {
        return destinos;
    }

    public NombreCliente nombreCliente() {
        return nombreCliente;
    }

    public TelefonoCliente telefonoCliente() {
        return telefonoCliente;
    }
    
}
