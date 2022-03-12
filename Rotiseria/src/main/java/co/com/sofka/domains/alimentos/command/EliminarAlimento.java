package co.com.sofka.domains.alimentos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.value.AlimentoId;

public class EliminarAlimento extends Command {

    private AlimentoId alimentoId;

    public EliminarAlimento(AlimentoId alimentoId) {
        this.alimentoId = alimentoId;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

}
