package co.com.sofka.domains.pedidos.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.alimentos.value.PrecioAlimento;
import co.com.sofka.domains.pedidos.value.PedidoId;

public class QuitarAlimento extends Command {
    
    private final PedidoId pedidoId;
    private final AlimentoId alimentoId;
    private final PrecioAlimento precioAlimento;

    public QuitarAlimento(PedidoId pedidoId, AlimentoId alimentoId, PrecioAlimento precioAlimento) {
        this.pedidoId = pedidoId;
        this.alimentoId = alimentoId;
        this.precioAlimento = precioAlimento;
    }

    public AlimentoId getAlimentoId() {
        return alimentoId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public PrecioAlimento getPrecioAlimento() {
        return precioAlimento;
    }

}
