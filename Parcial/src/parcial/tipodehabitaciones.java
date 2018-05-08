/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;


/**
 *
 * @author Daniela Chavez
 */
public class tipodehabitaciones {
    public static ArrayList <String> pbasico=new ArrayList<>();
    public static ArrayList<String> ppremium=new ArrayList<>();

    public tipodehabitaciones() {
    }

    public static ArrayList<String> getPbasico() {
        return pbasico;
    }

    public static void setPbasico(ArrayList<String> pbasico) {
        tipodehabitaciones.pbasico = pbasico;
    }

    public static ArrayList<String> getPpremium() {
        return ppremium;
    }

    public static void setPpremium(ArrayList<String> ppremium) {
        tipodehabitaciones.ppremium = ppremium;
    }   
    
    public static void main(String[] args) {
        
       
        Paquete premium = new Paquete();
        Paquete basico = new Paquete();
        Habitaciones[] inventariodehabitaciones=new Habitaciones[60];
        Huesped[] listahuesped=new Huesped[60];
        RegistroReserva listareservacion[]=new RegistroReserva[60];
   
        int n=1;
        String estado="Habitacion Disponible";
        while(n<61){
            
            if(n%2==0){
                String tipo="Habitacion doble";
                inventariodehabitaciones[n-1]=new Habitaciones(Habitaciones.tipohabitacion(n),tipo,estado,Habitaciones.preciohabitacion(n));
                n=n+1;    
            }
            else{
                String tipo="Habitacion sencilla";
                inventariodehabitaciones[n-1]=new Habitaciones(Habitaciones.tipohabitacion(n),tipo,estado, Habitaciones.preciohabitacion(n) );
                n=n+1;
            }  
        }
        double costo=10;
        n=0;
        while(n<2){
            if(n==0){
                ArrayList <String> pbasico=new ArrayList<>();
                String paquete1="Básico";
                pbasico.add("Acceso a la piscina");
                pbasico.add("Acceso a internet ilimitado");
                
                basico=new Paquete(paquete1,costo, pbasico);
                n=n+1;
            }
            else{
                ArrayList<String> ppremium=new ArrayList<>();
                String paquete2="Premium";
                ppremium.add("Buffet de desayuno");
                ppremium.add("Acceso ilimitado a la piscina");
                ppremium.add("Servicio a la habitacion");
                ppremium.add("Acceso ilimitado al mini bar");
                ppremium.add("Acceso ilimitado al internet");
                
                premium=new Paquete(paquete2,costo*15, ppremium);
                n=n+1;
            }
        } 
    }
 
}
  
