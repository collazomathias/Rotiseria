package co.com.sofka.domains.alimentos;

import java.util.ArrayList;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domains.alimentos.event.AlimentoCreado;
import co.com.sofka.domains.alimentos.event.CategoriaModificada;
import co.com.sofka.domains.alimentos.event.CoccionModificada;
import co.com.sofka.domains.alimentos.event.ExtraAgregado;
import co.com.sofka.domains.alimentos.event.ExtraQuitado;
import co.com.sofka.domains.alimentos.event.IngredienteAgregado;
import co.com.sofka.domains.alimentos.event.IngredienteQuitado;
import co.com.sofka.domains.alimentos.event.PrecioAlimentoModificado;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.Ingrediente;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;

public class AlimentoEventChange extends EventChange {

    public AlimentoEventChange(Alimento alimento) {
        
        apply((AlimentoCreado event) -> {
            if(event.getCategoria().procedencia().value().isBlank() ||
            event.getCategoria().tipoCategoria().value().isBlank()) {
                throw new IllegalArgumentException("La categoría no puede ser nula.");
            } else if(event.getCoccion() == null ||
                    event.getCoccion().duracion().value() <= 0 ||
                    event.getCoccion().temperatura().value() <= 0 ||
                    event.getCoccion().tipoCoccion().value().isBlank()) {
                throw new IllegalArgumentException("La cocción no puede ser nula.");
            } else if(event.getNombreAlimento() == null ||
                    event.getNombreAlimento().value().isBlank()) {
                throw new IllegalArgumentException("El nombre del alimento no puede ser nulo.");
            } else if(event.getPrecioAlimento() == null ||
                    event.getPrecioAlimento().value() <= 0){
                throw new IllegalArgumentException("El precio debe ser mayor a 0.");   
            }
            alimento.categoria = event.getCategoria();
            alimento.coccion = event.getCoccion();
            alimento.nombreAlimento = event.getNombreAlimento();
            alimento.precioAlimento = event.getPrecioAlimento();
            alimento.ingredientes = new ArrayList<Ingrediente>();
            alimento.extras = new ArrayList<Extra>();
        });

        apply((ExtraAgregado event) -> {
            if(event.getPrecioExtra().value() <= 0 ||
            event.getTipoExtra().value().isBlank() ||
            event.getDescripcionExtra().value().isBlank()) {
                throw new IllegalArgumentException("El precio del extra debe ser mayor a 0.");
            }
            alimento.extras.add(new Extra(AlimentoId.of(event.getAlimentoId().value()), event.getExtraId(), event.getPrecioExtra(), event.getTipoExtra(), event.getDescripcionExtra()));
        });

        apply((ExtraQuitado event) -> {
            alimento.extras.removeIf(extra -> extra.identity().equals(event.getExtraId()));
            alimento.precioAlimento = new PrecioAlimento(alimento.precioAlimento.value() - event.getPrecioExtra().value());
        });

        apply((IngredienteAgregado event) -> {
            if(event.getIngrediente() == null ||
            event.getIngrediente().value().isBlank()){
                throw new IllegalArgumentException("El nombre del ingrediente no puede ser nulo.");
            }
            alimento.ingredientes.add(new Ingrediente(event.getAlimentoId(), event.getIngrediente().value()));
        });

        apply((IngredienteQuitado event) -> {
            alimento.ingredientes.removeIf(ingrediente -> ingrediente.value().equals(event.getIngrediente().value()));
        });

        apply((CategoriaModificada event) -> {
            if(event.getProcedencia().value().isBlank() ||
            event.getTipoCategoria().value().isBlank()) {
                throw new IllegalArgumentException("La categoría no puede ser nula.");
            }
            alimento.categoria = new Categoria(event.getAlimentoId(), event.getCategoriaId(), event.getProcedencia(), event.getTipoCategoria());
        });

        apply((CoccionModificada event) -> {
            if(event.getDuracion().value() <= 0 ||
            event.getTemperatura().value() <= 0 ||
            event.getTipoCoccion().value().isBlank()) {
                throw new IllegalArgumentException("La cocción no puede ser nula");
            }
            alimento.coccion = new Coccion(event.getAlimentoId(), event.getCoccionId(), event.getDuracion(), event.getTemperatura(), event.getTipoCoccion());
        });

        apply((PrecioAlimentoModificado event) -> {
            if(event.getPrecioAlimento() == null ||
            event.getPrecioAlimento().value() <= 0) {
                throw new IllegalArgumentException("El precio del alimento no puede ser nulo.");
            }
            alimento.precioAlimento = new PrecioAlimento(event.getPrecioAlimento().value());
        });

    }
    
}
