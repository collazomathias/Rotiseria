package co.com.sofka.domains.alimentos.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domains.alimentos.Categoria;
import co.com.sofka.domains.alimentos.Coccion;
import co.com.sofka.domains.alimentos.value.NombreAlimento;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;

public class AlimentoCreado extends DomainEvent {

    private final Categoria categoria;
    private final Coccion coccion;
    private final PrecioAlimento precioAlimento;
    private final NombreAlimento nombreAlimento;

    public AlimentoCreado(Categoria categoria,
                        Coccion coccion,
                        PrecioAlimento precioAlimento,
                        NombreAlimento nombreAlimento) {
        super("alimentos.event.alimentocreado");
        this.categoria = categoria;
        this.coccion = coccion;
        this.precioAlimento = precioAlimento;
        this.nombreAlimento = nombreAlimento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Coccion getCoccion() {
        return coccion;
    }

    public PrecioAlimento getPrecioAlimento() {
        return precioAlimento;
    }

    public NombreAlimento getNombreAlimento() {
        return nombreAlimento;
    }
    
}
