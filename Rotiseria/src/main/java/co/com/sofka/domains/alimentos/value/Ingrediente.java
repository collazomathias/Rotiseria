package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.ValueObject;

public class Ingrediente implements ValueObject<String> {
    
    private final AlimentoId alimentoId;
    private final String value;

    public Ingrediente(AlimentoId alimentoId, String value) {
        this.alimentoId = alimentoId;
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

    public AlimentoId alimentoId() {
        return alimentoId;
    }

}
