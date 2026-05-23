package semana9.ejercicio3;

import java.util.Date;



public class Natural extends Cliente{
    
    private String Apellidos;
    private String Nombres;
    private Date Fecha;
    private String dni;
    private String sexo;

    public Natural() {
    }
    
    

    public Natural(String Apellidos, String Nombres, Date Fecha, String dni, String sexo, String Direccion, String Telefono, String Email) {
        super(Direccion, Telefono, Email);
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Fecha = Fecha;
        this.dni = dni;
        this.sexo = sexo;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Natural{" + "Apellidos=" + Apellidos + ", Nombres=" + Nombres + ", Fecha=" + Fecha + ", dni=" + dni + ", sexo=" + sexo + '}';
    }

  

   
    
}
