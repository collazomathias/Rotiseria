package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.Identity;

public class CoccionId extends Identity {
    
    private CoccionId(String coccionId){
        super(coccionId);
    }

    public CoccionId(){}

    public static CoccionId of(String coccionId) {
        return new CoccionId(coccionId);
    }

}
