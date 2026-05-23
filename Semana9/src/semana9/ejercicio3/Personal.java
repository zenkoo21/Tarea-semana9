package semana9.ejercicio3;

import java.util.Date;

public class Personal {
    
    private String Apellidos;
    private String Nombre;
    private String dni;
    private Date fechaNacimiento;
    private Puesto puesto;
    private Personal jefe;

    public Personal() {
    }

    public Personal(String Apellidos, String Nombre, String dni, Date fechaNacimiento, Puesto puesto, Personal jefe) {
        this.Apellidos = Apellidos;
        this.Nombre = Nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.puesto = puesto;
        this.jefe = jefe;
    }

    public Personal getJefe() {
        return jefe;
    }

    public void setJefe(Personal jefe) {
        this.jefe = jefe;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Personal{" +
            "Nombre=" + Nombre +
            ", Apellidos=" + Apellidos +
            ", puesto=" + puesto.getDescripcion() +
            '}';
    }
    
    
    
}
