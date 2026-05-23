package semana9.ejercicio3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    
    private Date fecha;
    private boolean estado;
    private Cliente cliente;
    private Personal personal;
    private List<PedidoDetalle> detalles;

    public Pedido() {
        this.detalles = new ArrayList<>();
    }

    public Pedido(Date fecha, boolean estado, Cliente cliente, Personal personal) {
        this.fecha = fecha;
        this.estado = estado;
        this.cliente = cliente;
        this.personal = personal;
        this.detalles = new ArrayList<>();
    }

    public void agregarDetalle(PedidoDetalle detalle) {
        detalles.add(detalle);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<PedidoDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<PedidoDetalle> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Pedido{" +
            "cliente=" + cliente +
            ", personal=" + personal +
            ", cantidadDetalles=" + detalles.size() +
            '}';
    }

}
