package co.com.sofka.domains.alimentos;

import java.util.Set;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.Ingrediente;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;

public class Alimento extends AggregateEvent<AlimentoId> {

    private final Set<Ingrediente> ingredientes;
    private final PrecioAlimento precioAlimento;
    private final Coccion coccion;
    private final Categoria categoria;
    private final Set<Extra> extras;

    public Alimento(AlimentoId alimentoId,
                    Set<Ingrediente> ingredientes,
                    PrecioAlimento precioAlimento,
                    Coccion coccion,
                    Categoria categoria,
                    Set<Extra> extras) {
        super(alimentoId);
        this. ingredientes = ingredientes;
        this.precioAlimento = precioAlimento;
        this.coccion = coccion;
        this.categoria = categoria;
        this.extras = extras;
    }

    public Categoria categoria() {
        return categoria;
    }

    public Coccion coccion() {
        return coccion;
    }
    
    public Set<Extra> extras() {
        return extras;
    }

    public Set<Ingrediente> ingredientes() {
        return ingredientes;
    }

    public PrecioAlimento precioAlimento() {
        return precioAlimento;
    }

}
