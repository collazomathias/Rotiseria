package co.com.sofka.domains.cocinas.command;

import java.util.ArrayList;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domains.alimentos.value.AlimentoId;
import co.com.sofka.domains.pedidos.Destino;
import co.com.sofka.domains.pedidos.value.HoraEntrega;
import co.com.sofka.domains.pedidos.value.PedidoId;
import co.com.sofka.domains.pedidos.value.PrecioPedido;

public class AgregarPedido extends Command {

    private final PedidoId pedidoId;
    private final HoraEntrega horaEntrega;
    private final Destino destino;
    private final PrecioPedido precioPedido;
    private final ArrayList<AlimentoId> alimentos;

    public AgregarPedido(PedidoId pedidoId, HoraEntrega horaEntrega, Destino destino, PrecioPedido precioPedido, ArrayList<AlimentoId> alimentos) {
        this.pedidoId = pedidoId;
        this.horaEntrega = horaEntrega;
        this.destino = destino;
        this.precioPedido = precioPedido;
        this.alimentos = alimentos;
    }

    public ArrayList<AlimentoId> getAlimentos() {
        return alimentos;
    }

    public Destino getDestino() {
        return destino;
    }

    public HoraEntrega getHoraEntrega() {
        return horaEntrega;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public PrecioPedido getPrecioPedido() {
        return precioPedido;
    }
    
}
