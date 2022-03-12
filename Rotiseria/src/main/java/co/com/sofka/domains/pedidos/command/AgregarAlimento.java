package co.com.sofka.domains.pedidos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.Categoria;
import co.com.sofka.domains.alimentos.Coccion;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.NombreAlimento;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class AgregarAlimento extends Command {
    
    private final PedidoId pedidoId;
    private final AlimentoId alimentoId;
    private final Categoria categoria;
    private final Coccion coccion;
    private final PrecioAlimento precioAlimento;
    private final NombreAlimento nombreAlimento;

    public AgregarAlimento(PedidoId pedidoId, AlimentoId alimentoId, Categoria categoria, Coccion coccion, PrecioAlimento precioAlimento, NombreAlimento nombreAlimento) {
        this.pedidoId = pedidoId;
        this.alimentoId = alimentoId;
        this.categoria = categoria;
        this.coccion = coccion;
        this.precioAlimento = precioAlimento;
        this.nombreAlimento = nombreAlimento;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Coccion getCoccion() {
        return coccion;
    }

    public NombreAlimento getNombreAlimento() {
        return nombreAlimento;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public PrecioAlimento getPrecioAlimento() {
        return precioAlimento;
    }

}
