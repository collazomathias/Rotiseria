package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.Identity;

public class AlimentoId extends Identity {
    
    private AlimentoId(String alimentoId){
        super(alimentoId);
    }

    public AlimentoId(){}

    public static AlimentoId of(String alimentoId) {
        return new AlimentoId(alimentoId);
    }

}
