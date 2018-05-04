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
    public static void main(String[] args) {
        
       
        Paquete premium = new Paquete();
        Paquete basico = new Paquete();
        Habitaciones[] inventariodehabitaciones=new Habitaciones[60];
        Huesped[] listahuesped=new Huesped[60];
        Reservacion listareservacion[]=new Reservacion[60];
   
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
                ArrayList <String> paquetebasico=new ArrayList<>();
                String paquete1="Básico";
                paquetebasico.add("Acceso a la piscina");
                paquetebasico.add("Acceso a internet ilimitado");
                
                basico=new Paquete(paquete1,costo, paquetebasico);
                n=n+1;
            }
            else{
                ArrayList<String> paquetepremium=new ArrayList<>();
                String paquete2="Premium";
                paquetepremium.add("Buffet de desayuno");
                paquetepremium.add("Acceso ilimitado a la piscina");
                paquetepremium.add("Servicio a la habitacion");
                paquetepremium.add("Acceso ilimitado al mini bar");
                paquetepremium.add("Acceso ilimitado al internet");
                
                premium=new Paquete(paquete2,costo*15, paquetepremium);
                n=n+1;
            }
        } 
        
        
        Usuario login = new Usuario();
        login.login(inventariodehabitaciones,basico,premium); 
    }
 
}
  
