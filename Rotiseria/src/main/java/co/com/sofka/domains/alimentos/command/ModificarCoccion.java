package co.com.sofka.domains.alimentos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.Coccion;
import co.com.sofka.domains.alimentos.value.AlimentoId;

public class ModificarCoccion extends Command {

    private final AlimentoId alimentoId;
    private final Coccion coccion;

    public ModificarCoccion(AlimentoId alimentoId, Coccion coccion) {
        this.alimentoId = alimentoId;
        this.coccion = coccion;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public Coccion getCoccion() {
        return coccion;
    }
    
}
