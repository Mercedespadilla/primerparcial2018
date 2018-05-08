/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author mercedes padilla
 */
public class Expaquete {
    public String nombredeextras;
    public double precio;
    public Expaquete(){
    }
    public Expaquete(String nombredeextras, double precio) {
        this.nombredeextras = nombredeextras;
        this.precio = precio;
    }

    public String getNombreextras() {
        return nombredeextras;
    }

    public void setNombreextras(String detalle) {
        this.nombredeextras = nombredeextras;
    }
    public double getPrecioextra() {
        return precio;
    }

    public void setPrecioextra(double precio) {
        this.precio = precio;
    }

}
