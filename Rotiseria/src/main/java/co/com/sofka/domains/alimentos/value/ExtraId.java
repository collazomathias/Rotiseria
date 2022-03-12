package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.Identity;

public class ExtraId extends Identity {

    private ExtraId(String extraId){
        super(extraId);
    }

    public ExtraId(){}

    public static ExtraId of(String extraId) {
        return new ExtraId(extraId);
    }

}
