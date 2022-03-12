package co.com.sofka.domains.cocinas.value;

import co.com.sofka.domain.generic.Identity;

public class UtensilioId extends Identity {
    
    private UtensilioId(String utensilioId){
        super(utensilioId);
    }

    public UtensilioId(){}

    public static UtensilioId of(String utensilioId) {
        return new UtensilioId(utensilioId);
    }

}
