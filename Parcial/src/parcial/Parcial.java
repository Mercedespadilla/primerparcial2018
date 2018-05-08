/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;
import java.util.Scanner;
/**
/**
 *
 * @author Daniela Chavez 
 */

/*
 El metodo de la clase parcial, recibe los datos de la habitacion. 
*/
public class Parcial{
    
    public int split(String cadena){
        int n;
        String c,p;
        String[] partes= cadena.split("-");
        p=partes[0];
        c=partes[1];
        n= Integer.parseInt(c);
        
        if(null!=p)switch (p) {
            case "A":
                n=n-1;
                break;
            case "B":
                n=n+10;
                n=n-1;
                break;
            case "C":
                n=n+20;
                n=n-1;
                break;
            case "D":
                n=n+30;
                n=n-1;
                break;
            case "E":
                n=n+40;
                n=n-1;
                break;
            case "F":
                n=n+50;
                n=n-1;
                break;
            default:
                break;
        }
        
        return n;
    }
    
    
    public void cambiarPrecio(Habitaciones[] inventariodehabitaciones){
        Scanner poo = new Scanner(System.in);
        System.out.println("Ingrese el piso de la habitación: ");
        String NumerodeHabitacion = poo.next();
        int hom = split(NumerodeHabitacion);
        
        System.out.println("Ingrese el nuevo costo de la habitacion: ");
        double precio = poo.nextDouble();
        inventariodehabitaciones[hom].setPrecio(precio);
        System.out.println("Precio a sido modificado exitosamente.");
    }
    /*
    inhabilitarhabitaciones permite al dueño inhabilitar una habitacion por cualquier motivo en especifico.
    */
    public void inhabilitarHabitaciones(Habitaciones[] inventariodehabitaciones){
        Scanner poo = new Scanner(System.in);
        System.out.println("Ingrese el Numero de habitación que desea inhabilitar: ");
        String Numerodehabitacion = poo.next();
        int hom = split(Numerodehabitacion);
        if(inventariodehabitaciones[hom].getEstado()=="Reservada"){
            System.out.println("Habitacion ocupada, La habitacion no se puede inhabilitar ");
        }
        else if(inventariodehabitaciones[hom].getEstado()=="Inhabilitada"){
            System.out.println("La habitacion ya se encuentra inhabilitada");
        }
        else{
            inventariodehabitaciones[hom].setEstado("Inhabilitada");
            System.out.println("Se inhabilitó habitación: "+inventariodehabitaciones[hom].getNumHabitacion());
        }
    }
    /*
     habiltarhabitaciones permite al dueño poder habilitar una habitacion en especifico.
    */
    public void habilitarHabitaciones(Habitaciones[] inventariodehabitaciones){
        Scanner poo = new Scanner(System.in);
        System.out.println(" Ingrese el numero de la habitación que desea habilitar: ");
        String NumerodeHabitacion = poo.next();
        int hom = split(NumerodeHabitacion);
        if(inventariodehabitaciones[hom].getEstado()=="Disponible"){
            System.out.println("Habitacion ya disponible");
        }
        else{
            inventariodehabitaciones[hom].setEstado("Disponible");
            System.out.println("La habitación "+inventariodehabitaciones[hom].getNumHabitacion()+" ahora está disponible");
        }
        
    }
    public int TipHabitaciones(int num,  String id, RegistroReserva[] inventariodereservaciones){
        while(!inventariodereservaciones[num].getHabitaciones().getNumHabitacion().equals(id)){
            num=num+1;   
        }
        return num;
    }
    public void ModificarReservaciones(Habitaciones[] inventariodehabitaciones, Huesped[] inventariodehuesped, RegistroReserva[] Inventariodereservaciones){
        Scanner poo=new Scanner(System.in);
        System.out.println("Ingrese el número de habitación reservada que desea modificar");
        String id=poo.nextLine();
        int n=0;
        
        int hot= TipHabitaciones(n,id, inventariodereservaciones);
        Scanner pooo=new Scanner(System.in);
        System.out.println("Ingrese la modificacion que decee realizar en la reservacion");
        System.out.println("1- Huesped");
        System.out.println("2- Habitacion");
        System.out.println("3- Paquete");
        int opc=pooo.nextInt();
        
        switch (opc) {
            case 1:
                Scanner poooo = new Scanner(System.in);
                System.out.println("Ingrese el nuevo nombre: ");
                String nombre = poooo.nextLine();
                inventariodereservaciones[hot].getHuespedes().setNombre(nombre);
                inventariodehuespedes[hot].setNombre(nombre);
                Scanner pooooo=new Scanner(System.in);
                System.out.println("Ingrese la tarjeta de credito: ");
                int tarjeta=pooooo.nextInt();
                inventariodereservaciones[hot].getHuespedes().setN_tarjeta(tarjeta);
                inventariodehuesped[hot].setN_tarjeta(tarjeta);
                int dias=Estadia();
                inventariodereservaciones[hot].getHuespees().setEstadia(dias);
                inventariodehuespedes[hot].setEstadia(dias);
                break;
            case 2:
                System.out.println("Ingrese el numero la habitacion (Ejemplo: A-3, B-10, etc): ");
                String NumerodeHabitacion = poo.next();
                while(!NumerodeHabitacion.contains("-")){
                    System.out.println("Formato erroneo");
                    System.out.println("Ingrese el numero la habitacion ( A-3, B-10, etc): ");
                    NumerodeHabitacion = poo.next();
                }       int hom = split(NumerodeHabitacion);
                String estate = inventariodehabitaciones[hom].getEstado();
                //Validacion de que la habitacion seleccionada está disponible
                while (!"Disponible".equals(estate)){
                    System.out.println("Habitación ocupada o inhabilitada. Elija otra.");
                    System.out.println("Ingrese el numero la habitacion ( A-3, B-10, etc): ");
                    NumerodeHabitacion = poo.next();
                    while(!NumerodeHabitacion.contains("-")){
                        System.out.println("Error. Formato erroneo");
                        System.out.println("Ingrese el numero la habitacion ( A-3, B-10, etc): ");
                        NumerodeHabitacion = poo.next();
                    }
                    hom = split(NumerodeHabitacion);
                    estate = inventariodehabitaciones[hom].getEstado();
                }       inventariodehabitaciones[hom].setEstado("Reservada");
                System.out.println("Habitación asiganada exitosamente. ");
                int hab=split(inventariodereservacions[hom].getHabitaciones().getNumHabitacion());
                inventariodehabitaciones[hab].setEstado("Disponible");
                inventariodereservaciones[hom].getHabitacion().setNumHabitacion(NumerodeHabitacion);
                break;
            case 3:
                Scanner pooooooo=new Scanner(System.in);
                System.out.println("Ingrese el paquete que decea adquirir (basico o premium): ");
                String opcn = pooooooo.next();
                while(!"basico".equals(opcn) && !"premium".equals(opcn)){
                    System.out.println("");
                    System.out.println("¡Opcion incorrecta!");
                    System.out.println("Ingrese el paquete que decea adquirir (basico o premium): ");
                    opcn = poooooo.next();
                }       if ("basico".equals(opcn)){
                    inventariodereservaciones[hom].setPaquete(basico);
                    
                }
                else if ("premium".equals(opcn)){
                    inventariodereservaciones[hom].setPaquete(premium);
                    
                }       System.out.println(" Paquete a sido cambiado exitosamente...");
                break;
            default:
                System.out.println("");
                break;
        }
    }   
      
    public void MostrarReservacion(RegistroReserva[] inventariodeareservaciones){
        Scanner poo=new Scanner(System.in);
        System.out.println("Nombre de la reservacion ");
        String name = poo.nextLine();
        int n=0;
        while(!name.equals(inventariodeareservaciones[n].getHuesped().getNombre())){
            n=n+1;
        }
        System.out.println("El nombre del huesped: " + inventariodeareservaciones[n].getHuesped().getNombre());
        System.out.println("Numero de habitacion: " + inventariodeareservaciones[n].getHabitaciones().getNumHabitacion());
        System.out.println("El paquete elegido: " +inventariodeareservaciones[n].getPaquete().getNombre());
        
    public void inhabilitarPiso(Habitaciones[] inventariodeareservaciones){
        Scanner poo = new Scanner(System.in);
        System.out.println("Inhabilitacion de piso");
        System.out.println("Ingrese el piso a inhabilitar A,B,C,D,E,F (en mayúscula): ");
        String opc = poo.next();
        if(null!=opc)switch (opc) {
            case "A":
                for(int i=0; i<10; i++){
                    inventariodehabitaciones[i].setEstado("Inhabilitada");
                }
                System.out.println("Piso inhabilitado");
                break;
            case "B":
                for(int i=10; i<20; i++){
                    inventariodehabitaciones[i].setEstado("Inhabilitada");
                }
                System.out.println("Piso inhabilitado");
                break;
            case "C":
                for(int i=20; i<30; i++){
                    inventariodehabitaciones[i].setEstado("Inhabilitada");
                }
                System.out.println("Piso inhabilitado");
                break;
            case "D":
                for(int i=30; i<40; i++){
                    inventariodehabitaciones[i].setEstado("Inhabilitada");
                }
                System.out.println("Piso inhabilitado");
                break;
            case "E":
                for(int i=40; i<50; i++){
                    inventariodehabitaciones[i].setEstado("Inhabilitada");
                }
                System.out.println("Piso inhabilitado");
                break;
            case "F":
                for(int i=50; i<60; i++){
                    inventariodehabitaciones[i].setEstado("Inhabilitada");
                }
                System.out.println("Piso inhabilitado");
                break;
            default:
                System.out.println("Ingresó mal el piso.");
                break;
        }
    }
    
    public void habilitarPiso(Habitaciones[] inventariodehabitaciones){
        Scanner poo = new Scanner(System.in);
        System.out.println("HABILITACION DE PISO");
        System.out.println("Ingrese el piso a habilitar A,B,C,D,E,F (en mayúscula): ");
        String opc = poo.next();
        if(null!=opc)switch (opc) {
            case "A":
                for(int i=0; i<10; i++){
                   inventariodehabitaciones[i].setEstado("Disponible");
                }
                System.out.println("Piso habilitado");
                break;
            case "B":
                for(int i=10; i<20; i++){
                    inventariodehabitaciones[i].setEstado("Disponible");
                }
                System.out.println("Piso habilitado");
                break;
            case "C":
                for(int i=20; i<30; i++){
                    inventariodehabitaciones[i].setEstado("Disponible");
                }
                System.out.println("Piso habilitado");
                break;
            case "D":
                for(int i=30; i<40; i++){
                    inventariodehabitaciones[i].setEstado("Disponible");
                }
                System.out.println("Piso habilitado");
                break;
            case "E":
                for(int i=40; i<50; i++){
                    inventariodehabitaciones[i].setEstado("Disponible");
                }
                System.out.println("Piso habilitado");
                break;
            case "F":
                for(int i=50; i<60; i++){
                    inventariodehabitaciones[i].setEstado("Disponible");
                }
                System.out.println("Piso habilitado");
                break;
            default:
                System.out.println("Ingresó mal el piso.");
                break;
        }
    }
}
    
   
                    
    
        
        
   
  