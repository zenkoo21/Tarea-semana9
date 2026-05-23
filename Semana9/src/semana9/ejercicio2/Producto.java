package semana9.ejercicio2;

import semana9.ejercicio3.Categoria;

public class Producto {
    
    private int idproducto;
    private String nombre;
    private Double cantidadFabricada;
    private Double costoFabricacion;

    public Producto(String laptop, double par, String activo, Categoria categoria1) {
    }

    public Producto(int idproducto, String nombre, Double cantidadFabricada, Double costoFabricacion) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.cantidadFabricada = cantidadFabricada;
        this.costoFabricacion = costoFabricacion;
    }

    public Double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(Double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCantidadFabricada() {
        return cantidadFabricada;
    }

    public void setCantidadFabricada(Double cantidadFabricada) {
        this.cantidadFabricada = cantidadFabricada;
    }

    @Override
    public String toString() {
        return "Producto{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", cantidadFabricada=" + cantidadFabricada + ", costoFabricacion=" + costoFabricacion + '}';
    }
    
    
    
    
}
