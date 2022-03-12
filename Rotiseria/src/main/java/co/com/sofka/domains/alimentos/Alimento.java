package co.com.sofka.domains.alimentos;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domains.alimentos.event.AlimentoCreado;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.NombreAlimento;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;

public class Alimento extends AggregateEvent<AlimentoId> {

    protected PrecioAlimento precioAlimento;
    protected Coccion coccion;
    protected Categoria categoria;
    protected NombreAlimento nombreAlimento;

    public Alimento(AlimentoId alimentoId, 
                    Categoria categoria,
                    Coccion coccion,
                    PrecioAlimento precioAlimento, 
                    NombreAlimento nombreAlimento) {
        super(alimentoId);
        appendChange(new AlimentoCreado(categoria, coccion, precioAlimento, nombreAlimento)).apply();
        subscribe(new AlimentoEventChange(this));

    }

    public Categoria categoria() {
        return categoria;
    }

    public Coccion coccion() {
        return coccion;
    }

    public PrecioAlimento precioAlimento() {
        return precioAlimento;
    }

    public NombreAlimento nombreAlimento() {
        return nombreAlimento;
    }

}
