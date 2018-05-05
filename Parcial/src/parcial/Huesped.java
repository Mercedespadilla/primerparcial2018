/**
 * @author Monica Gomez
 */
package parcial;

public class Huesped {

    private String strNombre;
    private String strApellido;
    protected int intEdad;
    private String strPais;
    private String strTelefono;
    private String strTarjeta;

    public static void main(String[] args) {
    
    }
    
    public void VerHuesped()
    {
    System.out.print("\nNombre:"+this.strNombre+
    "\nApellidos:"+this.strApellido+
    "\nEdad:"+this.intEdad+
    "\nPais:"+this.strPais+
    "\nTelefono:"+this.strTelefono+
    "\nTarjeta:"+this.strTarjeta);
    }
    
    public Huesped(String strNombre, String strApellido, int intEdad, String strPais, String strTelefono, String strTarjeta) {
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.intEdad = intEdad;
        this.strPais = strPais;
        this.strTelefono = strTelefono;
        this.strTarjeta = strTarjeta;
    }
    
    public Huesped() {
    }
    
    public String getNombre() {
        return strNombre;
    }

    public void setNombre(String Nombre) {
        this.strNombre = Nombre;
    }

    public String getApellido() {
        return strApellido;
    }

    public void setApellido(String Apellidos) {
        this.strApellido = Apellidos;
    }
    
    public int getEdad() {
        return intEdad;
    }

    public void setEdad(int Edad) {
        this.intEdad = Edad;
    }
    
    public String getPais() {
        return strPais;
    }

    public void setPais(String Pais) {
        this.strPais = Pais;
    }    
    
    public String getTelefono() {
        return strTelefono;
    }

    public void setTelefono(String Telefono) {
        this.strTelefono = Telefono;
    }      
    
    public String getTarjeta() {
        return strTarjeta;
    }

    public void setTarjeta(String Tarjeta) {
        this.strTarjeta = Tarjeta;
    }          
}
  
