package semana9.ejercicio2;

public class DetalleDeProducto {
    
    private Double cantidadUsada;
    private Producto producto;
    private MateriaPrima materia;

    public DetalleDeProducto() {
    }

    public DetalleDeProducto(Double cantidadUsada, Producto producto, MateriaPrima materia) {
        this.cantidadUsada = cantidadUsada;
        this.producto = producto;
        this.materia = materia;
    }

    public Double getCantidadUsada() {
        return cantidadUsada;
    }

    public void setCantidadUsada(Double cantidadUsada) {
        this.cantidadUsada = cantidadUsada;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public MateriaPrima getMateria() {
        return materia;
    }

    public void setMateria(MateriaPrima materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "DetalleDeProducto{" + "cantidadUsada=" + cantidadUsada + ", producto=" + producto + ", materia=" + materia + '}';
    }
}
