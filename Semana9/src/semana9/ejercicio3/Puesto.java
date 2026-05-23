package semana9.ejercicio3;

public class Puesto {
    private String descripcion;
    private double sueldo;

    public Puesto() {
    }

    public Puesto(String descripcion, double sueldo) {
        this.descripcion = descripcion;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Puesto{" + "descripcion=" + descripcion + ", sueldo=" + sueldo + '}';
    }  
}
