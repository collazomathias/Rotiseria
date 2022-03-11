package co.com.sofka.domains.cocina;

import java.util.Set;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domains.cocina.value.cocina.CocinaId;
import co.com.sofka.domains.pedido.value.pedido.PedidoId;

public class Cocina extends AggregateEvent<CocinaId>{

    private final Cocinero cocinero;
    private final Set<Utensilio> utensilios;
    private final Set<PedidoId> pedidos;

    public Cocina(CocinaId cocinaId, 
                Cocinero cocinero, 
                Set<Utensilio> utensilios,
                Set<PedidoId> pedidos) {
        super(cocinaId);
        this.cocinero = cocinero;
        this.utensilios = utensilios;
        this.pedidos = pedidos;
    }

    public Cocinero cocinero() {
        return cocinero;
    }

    public Set<Utensilio> utensilios() {
        return utensilios;
    }

    public Set<PedidoId> pedidos() {
        return pedidos;
    }
    
}
