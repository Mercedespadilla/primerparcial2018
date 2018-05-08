
package parcial;

/**
 *
 * @author Daniela Chavez
 */
public class Habitaciones {
    
    public String NumHabitacion;
    public String tipo;
    public String estado;
    public double precio;

    public Habitaciones() {
    }

    public Habitaciones(String NumHabitacion, String tipo, String estado, double precio) {
        this.NumHabitacion = NumHabitacion;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
    }

    public String getNumHabitacion() {
        return NumHabitacion;
    }

    public void setNumHabitacion(String NumHabitacion) {
        this.NumHabitacion = NumHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
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
        int precio=100;
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
        return "La habitacion " + NumHabitacion + " con estado " + estado + " y de tipo "+ tipo + " cuesta "+ precio;
    } 
}

