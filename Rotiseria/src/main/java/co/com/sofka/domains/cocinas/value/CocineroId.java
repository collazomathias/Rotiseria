package co.com.sofka.domains.cocinas.value;

import co.com.sofka.domain.generic.Identity;

public class CocineroId extends Identity {
    
    private CocineroId(String cocineroId){
        super(cocineroId);
    }

    public CocineroId(){}

    public static CocineroId of(String cocineroId) {
        return new CocineroId(cocineroId);
    }

}
