package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.Identity;

public class AlimentoId extends Identity {

    protected AlimentoId alimentoId;

    public AlimentoId(AlimentoId alimentoId){
        this.alimentoId = alimentoId;
    }

    public AlimentoId alimentoId() {
        return alimentoId;
    }

}
