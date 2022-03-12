package co.com.sofka.domains.pedidos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.Categoria;
import co.com.sofka.domains.alimentos.Coccion;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.NombreAlimento;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;

public class AlimentoAgregado extends DomainEvent {

    private final AlimentoId alimentoId;
    private final Categoria categoria;
    private final Coccion coccion;
    private final PrecioAlimento precioAlimento;
    private final NombreAlimento nombreAlimento;

    public AlimentoAgregado(AlimentoId alimentoId, Categoria categoria, Coccion coccion, PrecioAlimento precioAlimento, NombreAlimento nombreAlimento) {
        super("pedidos.event.alimentoagregado");
        this.alimentoId = alimentoId;
        this.categoria = categoria;
        this.coccion = coccion;
        this.precioAlimento = precioAlimento;
        this.nombreAlimento = nombreAlimento;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public Coccion getCoccion() {
        return coccion;
    }

    public NombreAlimento getNombreAlimento() {
        return nombreAlimento;
    }

    public PrecioAlimento getPrecioAlimento() {
        return precioAlimento;
    }
    
}
