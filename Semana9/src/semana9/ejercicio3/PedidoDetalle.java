package semana9.ejercicio3;

public class PedidoDetalle {
    
    private double importe;
    private int cantidad;
    private Producto producto;
    private Pedido pedido;

    public PedidoDetalle() {
    }

    public PedidoDetalle(double importe, int cantidad, Producto producto, Pedido pedido) {
        this.importe = importe;
        this.cantidad = cantidad;
        this.producto = producto;
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
       return "PedidoDetalle{" +
           
            ", cantidad=" + cantidad +
            ", producto=" + producto +
            '}';
    }
    
    
    
}
