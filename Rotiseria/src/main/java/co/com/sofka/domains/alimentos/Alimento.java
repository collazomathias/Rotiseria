package co.com.sofka.domains.alimentos;

import java.util.ArrayList;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domains.alimentos.event.AlimentoCreado;
import co.com.sofka.domains.alimentos.event.CategoriaModificada;
import co.com.sofka.domains.alimentos.event.CoccionModificada;
import co.com.sofka.domains.alimentos.event.ExtraAgregado;
import co.com.sofka.domains.alimentos.event.ExtraQuitado;
import co.com.sofka.domains.alimentos.event.IngredienteAgregado;
import co.com.sofka.domains.alimentos.event.IngredienteQuitado;
import co.com.sofka.domains.alimentos.event.PrecioAlimentoModificado;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.CategoriaId;
import co.com.sofka.domains.alimentos.value.CoccionId;
import co.com.sofka.domains.alimentos.value.DescripcionExtra;
import co.com.sofka.domains.alimentos.value.Duracion;
import co.com.sofka.domains.alimentos.value.ExtraId;
import co.com.sofka.domains.alimentos.value.Ingrediente;
import co.com.sofka.domains.alimentos.value.NombreAlimento;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;
import co.com.sofka.domains.alimentos.value.PrecioExtra;
import co.com.sofka.domains.alimentos.value.Procedencia;
import co.com.sofka.domains.alimentos.value.Temperatura;
import co.com.sofka.domains.alimentos.value.TipoCategoria;
import co.com.sofka.domains.alimentos.value.TipoCoccion;
import co.com.sofka.domains.alimentos.value.TipoExtra;

public class Alimento extends AggregateEvent<AlimentoId> {

    protected PrecioAlimento precioAlimento;
    protected Coccion coccion;
    protected Categoria categoria;
    protected NombreAlimento nombreAlimento;
    protected ArrayList<Ingrediente> ingredientes;
    protected ArrayList<Extra> extras;

    public Alimento(AlimentoId alimentoId, 
                    Categoria categoria,
                    Coccion coccion,
                    PrecioAlimento precioAlimento, 
                    NombreAlimento nombreAlimento) {
        super(alimentoId);
        appendChange(new AlimentoCreado(categoria, coccion, precioAlimento, nombreAlimento)).apply();
        subscribe(new AlimentoEventChange(this));

    }

    public void AgregarExtra(ExtraId extraId, PrecioExtra precioExtra, TipoExtra tipoExtra, DescripcionExtra descripcionExtra) {
        appendChange(new ExtraAgregado(extraId, precioExtra, tipoExtra, descripcionExtra)).apply();
    }

    public void QuitarExtra(ExtraId extraId, PrecioExtra precioExtra) {
        appendChange(new ExtraQuitado(extraId, precioExtra)).apply();
    }

    public void AgregarIngrediente(Ingrediente ingrediente) {
        appendChange(new IngredienteAgregado(ingrediente)).apply();
    }

    public void QuitarIngrediente(Ingrediente ingrediente) {
        appendChange(new IngredienteQuitado(ingrediente)).apply();
    }

    public void ModificarCategoria(CategoriaId categoriaId, Procedencia procedencia, TipoCategoria tipoCategoria) {
        appendChange(new CategoriaModificada(categoriaId, procedencia, tipoCategoria)).apply();
    }

    public void ModificarCoccion(CoccionId coccionId, Duracion duracion, Temperatura temperatura, TipoCoccion tipoCoccion) {
        appendChange(new CoccionModificada(coccionId, duracion, temperatura, tipoCoccion)).apply();
    }

    public void ModificarPrecioAlimento(PrecioAlimento precioAlimento) {
        appendChange(new PrecioAlimentoModificado(precioAlimento)).apply();
    }

    public Categoria categoria() {
        return categoria;
    }

    public Coccion coccion() {
        return coccion;
    }

    public PrecioAlimento precioAlimento() {
        return precioAlimento;
    }

    public NombreAlimento nombreAlimento() {
        return nombreAlimento;
    }

    public ArrayList<Extra> extras() {
        return extras;
    }

}
