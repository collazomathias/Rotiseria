package co.com.sofka.domains.alimentos.value;

import co.com.sofka.domain.generic.Identity;

public class CategoriaId extends Identity {
    
    private CategoriaId(String categoriaId){
        super(categoriaId);
    }

    public CategoriaId(){}

    public static CategoriaId of(String categoriaId) {
        return new CategoriaId(categoriaId);
    }

}
