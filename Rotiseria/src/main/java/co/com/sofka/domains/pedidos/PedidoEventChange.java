package co.com.sofka.domains.pedidos;

import java.util.ArrayList;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.pedidos.event.AlimentoAgregado;
import co.com.sofka.domains.pedidos.event.AlimentoQuitado;
import co.com.sofka.domains.pedidos.event.ClienteModificado;
import co.com.sofka.domains.pedidos.event.DestinoModificado;
import co.com.sofka.domains.pedidos.event.HoraEntregaModificada;
import co.com.sofka.domains.pedidos.event.PedidoCreado;
import co.com.sofka.domains.pedidos.event.PrecioPedidoModificado;
import co.com.sofka.domains.pedidos.value.HoraEntrega;
import co.com.sofka.domains.pedidos.value.PrecioPedido;

public class PedidoEventChange extends EventChange {

    public PedidoEventChange(Pedido pedido){
        
        apply((PedidoCreado event) -> {
            if(event.getDestino() == null ||
            event.getDestino().calle().value().isBlank() ||
            event.getDestino().ciudad().value().isBlank() ||
            event.getDestino().numero().value() <= 0) {
                throw new IllegalArgumentException("El destino no puede ser nulo.");
            } else if(event.getCliente() == null || 
                    event.getCliente().nombreCliente().value().isBlank() ||
                    event.getCliente().telefonoCliente().value().isBlank()) {
                throw new IllegalArgumentException("El cliente no puede ser nulo.");
            } else if(event.getHoraEntrega() == null ||
                    event.getHoraEntrega().value().isBlank()) {
                throw new IllegalArgumentException("La hora de entrega no puede ser nula.");
            } else if(event.getPrecioPedido() == null || 
                    event.getPrecioPedido().value() <= 0) {
                throw new IllegalArgumentException("El precio del pedido no puede ser nulo.");
            }
            pedido.destino = event.getDestino();
            pedido.cliente = event.getCliente();
            pedido.horaEntrega = event.getHoraEntrega();
            pedido.precioPedido = event.getPrecioPedido();
            pedido.alimentos = new ArrayList<AlimentoId>();
        });

        apply((AlimentoAgregado event) -> {
            if(event.getAlimentoId() == null ||
            event.getAlimentoId().value().isBlank()){
                throw new IllegalArgumentException("El ID del alimento no puede ser nulo.");
            }
            pedido.alimentos.add(new AlimentoId(event.getAlimentoId()));
        });

        apply((AlimentoQuitado event) -> {
            pedido.alimentos.removeIf(alimento -> alimento.alimentoId().equals(event.getAlimentoId()));
        });

        apply((ClienteModificado event) -> {
            if(event.getDestinos().isEmpty()){
                throw new IllegalArgumentException("El cliente debe tener al menos un destino.");
            } else if (event.getNombreCliente() == null ||
                    event.getNombreCliente().value().isBlank()) {
                throw new IllegalArgumentException("El nombre del cliente no puede ser nulo.");
            } else if(event.getTelefonoCliente() == null ||
                    event.getTelefonoCliente().value().isBlank()) {
                throw new IllegalArgumentException("El teléfono del cliente no puede ser nulo.");
            }
            pedido.cliente = new Cliente(event.getClienteId(), event.getNombreCliente(), event.getTelefonoCliente(), event.getDestinos());
        });

        apply((DestinoModificado event) -> {
            if(event.getCalle() == null ||
            event.getCalle().value().isBlank()) {
                throw new IllegalArgumentException("La calle no puede ser nula.");
            } else if(event.getCiudad() == null ||
                    event.getCiudad().value().isBlank()) {
                throw new IllegalArgumentException("La ciudad no puede ser nula.");
            } else if(event.getNumero() == null ||
                    event.getNumero().value() <= 0) {
                throw new IllegalArgumentException("El numero no puede ser nulo.");
            }
            pedido.destino = new Destino(event.getDestinoId(), event.getCalle(), event.getCiudad(), event.getNumero());
        });

        apply((HoraEntregaModificada event) -> {
            if(event.getHoraEntrega() == null ||
            event.getHoraEntrega().value().isBlank()) {
                throw new IllegalArgumentException("La hora de entrega no puede ser nula.");
            }
            pedido.horaEntrega = new HoraEntrega(event.getHoraEntrega().value());
        });

        apply((PrecioPedidoModificado event) -> {
            if(event.getPrecioPedido() == null) {
                throw new IllegalArgumentException("El precio del pedido no puede ser nulo.");
            }
            pedido.precioPedido = new PrecioPedido(event.getPrecioPedido().value());
        });

    }
    
}
