package semana9.ejercicio3;

public class Juridico extends Cliente{
    
    private String RUC;
    private String RazonSocial;
    private String FAX;
    private String Contacto;

    public Juridico(String string, String empresa_SAC, String string1, String carlos_López, String av_Industrial_456, String string2, String empresagmailcom) {
        
    }

    public Juridico(String RUC, String RazonSocial, String FAX, String Contacto) {
        this.RUC = RUC;
        this.RazonSocial = RazonSocial;
        this.FAX = FAX;
        this.Contacto = Contacto;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getFAX() {
        return FAX;
    }

    public void setFAX(String FAX) {
        this.FAX = FAX;
    }

    @Override
    public String toString() {
        return "Juridico{" + "RUC=" + RUC + ", RazonSocial=" + RazonSocial + ", FAX=" + FAX + ", Contacto=" + Contacto + '}';
    }
  
}
