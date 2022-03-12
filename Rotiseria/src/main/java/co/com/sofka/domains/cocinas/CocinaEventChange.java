package co.com.sofka.domains.cocinas;

import java.util.ArrayList;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domains.cocinas.event.CocinaCreada;
import co.com.sofka.domains.cocinas.event.CocineroModificado;
import co.com.sofka.domains.cocinas.event.PedidoAgregado;
import co.com.sofka.domains.cocinas.event.PedidoQuitado;
import co.com.sofka.domains.cocinas.event.UtensilioAgregado;
import co.com.sofka.domains.cocinas.event.UtensilioQuitado;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class CocinaEventChange extends EventChange {

    public CocinaEventChange(Cocina cocina){
        
        apply((CocinaCreada event) -> {
            if(event.getCocinero() == null) {
                throw new IllegalArgumentException("El cocinero no puede ser nulo.");
            } else if(event.getCocinero().especialidad().value().isBlank()) {
                throw new IllegalArgumentException("La especialidad del cocinero no puede ser nula.");
            } else if(event.getCocinero().nombreCocinero().value().isBlank()) {
                throw new IllegalArgumentException("El nombre del cocinero no puede ser nulo.");
            } else if(event.getCocinero().telefonoCocinero().value().isBlank()) {
                throw new IllegalArgumentException("El teléfono del cocinero no puede ser nulo.");
            }
            cocina.cocinero = event.getCocinero();
            cocina.pedidos = new ArrayList<PedidoId>();
            cocina.utensilios = new ArrayList<Utensilio>();
        });

        apply((CocineroModificado event) -> {
            if(event.getNombreCocinero() == null ||
            event.getNombreCocinero().value().isBlank()){
                throw new IllegalArgumentException("El nombre del cocinero no puede ser nulo.");
            } else if(event.getEspecialidad() == null ||
                    event.getEspecialidad().value().isBlank()) {
                throw new IllegalArgumentException("La especialidad del cocinero no puede ser nula.");
            } else if(event.getTelefonoCocinero() == null ||
                    event.getTelefonoCocinero().value().isBlank()) {
                throw new IllegalArgumentException("El teléfono del cocinero no puede ser nulo.");
            }
            cocina.cocinero = new Cocinero(event.getCocineroId(), event.getNombreCocinero(), event.getEspecialidad(), event.getTelefonoCocinero());
        });

        apply((PedidoAgregado event) -> {
            if(event.getPedidoId() == null ||
            event.getPedidoId().value().isBlank()){
                throw new IllegalArgumentException("El ID del pedido no puede ser nulo.");
            }
            cocina.pedidos.add(new PedidoId(event.getPedidoId()));
        });

        apply((PedidoQuitado event) -> {
            cocina.pedidos.removeIf(pedido -> pedido.getPedidoId().value().equals(event.getPedidoId().value()));
        });

        apply((UtensilioAgregado event) -> {
            if(event.getDescripcionUtensilio() == null ||
            event.getDescripcionUtensilio().value().isBlank()) {
                throw new IllegalArgumentException("La descripción del utensilio no puede ser nula.");
            } else if(event.getTipoUtensilio() == null ||
                    event.getTipoUtensilio().value().isBlank()) {
                throw new IllegalArgumentException("El tipo del utensilio no puede ser nulo.");
            }
            cocina.utensilios.add(new Utensilio(event.getUtensilioId(), event.getTipoUtensilio(), event.getDescripcionUtensilio()));
        });

        apply((UtensilioQuitado event) -> {
            cocina.utensilios.removeIf(utensilio -> utensilio.identity().equals(event.getUtensilioId()));
        });

    }
    
}
