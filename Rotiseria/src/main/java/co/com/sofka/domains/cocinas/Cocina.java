package co.com.sofka.domains.cocinas;

import java.util.ArrayList;
import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.cocinas.event.CocinaCreada;
import co.com.sofka.domains.cocinas.event.CocineroModificado;
import co.com.sofka.domains.cocinas.event.PedidoAgregado;
import co.com.sofka.domains.cocinas.event.PedidoQuitado;
import co.com.sofka.domains.cocinas.event.UtensilioAgregado;
import co.com.sofka.domains.cocinas.event.UtensilioQuitado;
import co.com.sofka.domains.cocinas.value.CocinaId;
import co.com.sofka.domains.cocinas.value.CocineroId;
import co.com.sofka.domains.cocinas.value.DescripcionUtensilio;
import co.com.sofka.domains.cocinas.value.Especialidad;
import co.com.sofka.domains.cocinas.value.NombreCocinero;
import co.com.sofka.domains.cocinas.value.TelefonoCocinero;
import co.com.sofka.domains.cocinas.value.TipoUtensilio;
import co.com.sofka.domains.cocinas.value.UtensilioId;
import co.com.sofka.domains.pedidos.Destino;
import co.com.sofka.domains.pedidos.value.HoraEntrega;
import co.com.sofka.domains.pedidos.value.PedidoId;
import co.com.sofka.domains.pedidos.value.PrecioPedido;

public class Cocina extends AggregateEvent<CocinaId>{

    protected Cocinero cocinero;
    protected ArrayList<Utensilio> utensilios;
    protected ArrayList<PedidoId> pedidos;

    public Cocina(CocinaId cocinaId, Cocinero cocinero) {
        super(cocinaId);
        appendChange(new CocinaCreada(cocinero)).apply();
        subscribe(new CocinaEventChange(this));
    }

    private Cocina(CocinaId cocinaId){
        super(cocinaId);
        subscribe(new CocinaEventChange(this));
    }

    public static Cocina from(CocinaId cocinaId, List<DomainEvent> events){
        var cocina = new Cocina(cocinaId);
        events.forEach(cocina::applyEvent);
        return cocina;
    }

    public void ModificarCocinero(CocineroId cocineroId, NombreCocinero nombreCocinero, TelefonoCocinero telefonoCocinero, Especialidad especialidad) {
        appendChange(new CocineroModificado(cocineroId, nombreCocinero, telefonoCocinero, especialidad)).apply();
    }

    public void AgregarPedido(PedidoId pedidoId, HoraEntrega horaEntrega, Destino destino, PrecioPedido precioPedido, ArrayList<AlimentoId> alimentos) {
        appendChange(new PedidoAgregado(pedidoId, horaEntrega, destino, precioPedido, alimentos)).apply();
    }

    public void QuitarPedido(PedidoId pedidoId) {
        appendChange(new PedidoQuitado(pedidoId)).apply();
    }

    public void AgregarUtensilio(UtensilioId utensilioId, TipoUtensilio tipoUtensilio, DescripcionUtensilio descripcionUtensilio) {
        appendChange(new UtensilioAgregado(utensilioId, tipoUtensilio, descripcionUtensilio)).apply();
    }

    public void QuitarUtensilio(UtensilioId utensilioId) {
        appendChange(new UtensilioQuitado(utensilioId)).apply();
    }

    public Cocinero cocinero() {
        return cocinero;
    }

    public ArrayList<PedidoId> pedidos() {
        return pedidos;
    }

    public ArrayList<Utensilio> utensilios() {
        return utensilios;
    }
    
}
