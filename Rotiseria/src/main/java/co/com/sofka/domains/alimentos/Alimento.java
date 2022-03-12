package co.com.sofka.domains.alimentos;

import java.util.ArrayList;
import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
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

    private Alimento(AlimentoId alimentoId){
        super(alimentoId);
        subscribe(new AlimentoEventChange(this));
    }

    public static Alimento from(AlimentoId alimentoId, List<DomainEvent> events){
        var alimento = new Alimento(alimentoId);
        events.forEach(alimento::applyEvent);
        return alimento;
    }

    public void AgregarExtra(AlimentoId alimentoId, ExtraId extraId, PrecioExtra precioExtra, TipoExtra tipoExtra, DescripcionExtra descripcionExtra) {
        appendChange(new ExtraAgregado(alimentoId, extraId, precioExtra, tipoExtra, descripcionExtra)).apply();
    }

    public void QuitarExtra(AlimentoId alimentoId, ExtraId extraId, PrecioExtra precioExtra) {
        appendChange(new ExtraQuitado(alimentoId, extraId, precioExtra)).apply();
    }

    public void AgregarIngrediente(AlimentoId alimentoId, Ingrediente ingrediente) {
        appendChange(new IngredienteAgregado(alimentoId, ingrediente)).apply();
    }

    public void QuitarIngrediente(AlimentoId alimentoId, Ingrediente ingrediente) {
        appendChange(new IngredienteQuitado(alimentoId, ingrediente)).apply();
    }

    public void ModificarCategoria(AlimentoId alimentoId, CategoriaId categoriaId, Procedencia procedencia, TipoCategoria tipoCategoria) {
        appendChange(new CategoriaModificada(alimentoId, categoriaId, procedencia, tipoCategoria)).apply();
    }

    public void ModificarCoccion(AlimentoId alimentoId, CoccionId coccionId, Duracion duracion, Temperatura temperatura, TipoCoccion tipoCoccion) {
        appendChange(new CoccionModificada(alimentoId, coccionId, duracion, temperatura, tipoCoccion)).apply();
    }

    public void ModificarPrecioAlimento(AlimentoId alimentoId, PrecioAlimento precioAlimento) {
        appendChange(new PrecioAlimentoModificado(alimentoId, precioAlimento)).apply();
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
