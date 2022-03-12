package co.com.sofka.domains.alimentos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.Categoria;
import co.com.sofka.domains.alimentos.Coccion;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.NombreAlimento;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;

public class CrearAlimento extends Command {

    private final AlimentoId alimentoId;
    private final Categoria categoria;
    private final PrecioAlimento precioAlimento;
    private final Coccion coccion;
    private final NombreAlimento nombreAlimento;

    public CrearAlimento(AlimentoId alimentoId,
                        Categoria categoria,
                        PrecioAlimento precioAlimento,
                        Coccion coccion,
                        NombreAlimento nombreAlimento) {
        this.alimentoId = alimentoId;
        this.categoria = categoria;
        this.precioAlimento = precioAlimento;
        this.coccion = coccion;
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
