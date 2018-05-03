/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Daniela Chavez
 */
public class Habitaciones {
    
    public String piso;
    public String tipo;
    public boolean estado;
    public double precio;

    public Habitaciones() {
    }

    public Habitaciones(String piso, String tipo, boolean estado, double precio) {
        this.piso = piso;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
    }

    public String getCodigo() {
        return piso;
    }

    public void setCodigo(String piso) {
        this.piso = piso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public static String tipohabitacion(int num){
        
        if(num<11){
                return "A"+(num);
            }
            if(num<21){
                return "B"+(num-10);
            }
            if(num<31){
                return "C"+(num-20);
            }
            if(num<41){
                return "D"+(num-30);
            }
            if(num<51){
                return "E"+(num-40);
            }
            else{
                return "F"+(num-50);
            }
    
    }
    public static double preciohabitacion(int num){
        int precio=200;
        if(num<41){
            if(num%2==0){
                return precio*2;       
            }
            else{
                 return precio;   
            }
               
        }
        else{
            if(num%2==0){
                
                return (precio*2)+(precio*0.10);
              
            }
            else{
                
                return (precio)+(precio*0.10);      
            }
        }  
    }
    public String Datos(){
        return "La habitacion " + codigo + " con estado " + estado + " y de tipo "+ tipo + " cuesta "+ precio;
    } 
}

