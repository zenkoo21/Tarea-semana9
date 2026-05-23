package semana9.ejercicio3;

public class Producto {
    
    private String nombre;
    private double precio;
    private String estado;
    private Categoria categoria;

    public Producto() {
    }

   
    public Producto(String nombre, double precio, String estado, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
        this.categoria = categoria;
        if (categoria != null) {
            categoria.agregarProducto(this);
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
            "nombre=" + nombre +
            ", precio=" + precio +
            '}';    }

   
    
    
    
}
