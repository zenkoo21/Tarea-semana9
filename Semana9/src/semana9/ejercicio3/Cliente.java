package semana9.ejercicio3;

public abstract class Cliente {
    
    private String Direccion;
    private String Telefono;
    private String Email;

    public Cliente() {
    }

    public Cliente(String Direccion, String Telefono, String Email) {
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    
}