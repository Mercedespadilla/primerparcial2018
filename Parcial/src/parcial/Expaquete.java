
package parcial;

/**
 * @author Monica Gomez
 */
public class Expaquete {
    public String nombredeextras;
    public double precio;
    public Expaquete(){
    }

     Expaquete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Expaquete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void VerExtras()
    {
    System.out.print("\nNombre del extra:"+this.nombredeextras+
    "\nPrecio del extra:"+this.precio);
            }

    public Expaquete(String nombredeextras, double precio) {
        this.nombredeextras = nombredeextras;
        this.precio = precio;
    }
  
    public String getNombreextras() {
        return nombredeextras;
    }

    public void setNombreextras(String nombreextras) {
        this.nombredeextras = nombredeextras;
    }
    public double getPrecioextra() {
        return precio;
    }

    public void setPrecioextra(double precio) {
        this.precio = precio;
    }

    Object getNombreExtra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
