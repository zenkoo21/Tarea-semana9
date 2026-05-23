package semana9.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    
    private String tipo;
    List<Producto> productos;

    public Categoria() {
        this.productos = new ArrayList<>();
    }

    public Categoria(String tipo) {
        this.tipo = tipo;
        this.productos = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public String toString() {
        return "Categoria{" + "tipo=" + tipo + '}';
    }
}
    

    
   
    
    
    
    

