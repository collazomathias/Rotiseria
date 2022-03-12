package co.com.sofka.domains.cocinas.value;

import co.com.sofka.domain.generic.Identity;

public class CocinaId extends Identity {
    
    private CocinaId(String cocinaId){
        super(cocinaId);
    }

    public CocinaId(){}

    public static CocinaId of(String cocinaId) {
        return new CocinaId(cocinaId);
    }

}
