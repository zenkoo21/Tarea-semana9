package semana9.ejercicio2;

public class MateriaPrima {
    
    private int idmateriaPrima;
    private String nombre;

    public MateriaPrima() {
    }

    public MateriaPrima(int idmateriaPrima, String nombre) {
        this.idmateriaPrima = idmateriaPrima;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdmateriaPrima() {
        return idmateriaPrima;
    }

    public void setIdmateriaPrima(int idmateriaPrima) {
        this.idmateriaPrima = idmateriaPrima;
    }

    @Override
    public String toString() {
        return "MateriaPrima{" + "idmateriaPrima=" + idmateriaPrima + ", nombre=" + nombre + '}';
    }
    
    
    
}
