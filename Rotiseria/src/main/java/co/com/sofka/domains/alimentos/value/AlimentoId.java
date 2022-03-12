package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.Identity;

public class AlimentoId extends Identity {

    protected AlimentoId alimentoId;

    private AlimentoId(String value){
        super(value);
    }

    public AlimentoId(){}

    public static AlimentoId of(String value) {
        return new AlimentoId(value);
    }

    public AlimentoId alimentoId() {
        return alimentoId;
    }

}
