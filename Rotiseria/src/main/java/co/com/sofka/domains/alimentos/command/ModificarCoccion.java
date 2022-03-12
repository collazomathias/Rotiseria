package co.com.sofka.domains.alimentos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.CoccionId;
import co.com.sofka.domains.alimentos.value.Duracion;
import co.com.sofka.domains.alimentos.value.Temperatura;
import co.com.sofka.domains.alimentos.value.TipoCoccion;

public class ModificarCoccion extends Command {

    private final AlimentoId alimentoId;
    private final CoccionId coccionId;
    private final Duracion duracion;
    private final Temperatura temperatura;
    private final TipoCoccion tipoCoccion;

    public ModificarCoccion(AlimentoId alimentoId, CoccionId coccionId, Duracion duracion, Temperatura temperatura, TipoCoccion tipoCoccion) {
        this.alimentoId = alimentoId;
        this.coccionId = coccionId;
        this.duracion = duracion;
        this.temperatura = temperatura;
        this.tipoCoccion = tipoCoccion;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public CoccionId getCoccionId() {
        return coccionId;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public TipoCoccion getTipoCoccion() {
        return tipoCoccion;
    }
    
}
