package semana9.ejercicio1;

import java.time.LocalDate;
import java.util.Date;

public class Prestamo {
    
    private int idprestamo;
    private Double importe;
    private LocalDate fecha;
    private Cliente cliente; //llamando a la clase

    public Prestamo() {
    }

    public Prestamo(int idprestamo, Double importe, LocalDate fecha, Cliente cliente) {
        this.idprestamo = idprestamo;
        this.importe = importe;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(int idprestamo) {
        this.idprestamo = idprestamo;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "idprestamo=" + idprestamo + ", importe=" + importe + ", fecha=" + fecha + ", cliente=" + cliente + '}';
    }

    
    
    
}
