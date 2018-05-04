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
public class Parcial{
    //private ArrayList<Huesped> huespedes;
    //private ArrayList<Reservacion> reservaciones;
    
    //GeneradorHabitacion generador= new GeneradorHabitacion();
    //ParcialPOO generator = new ParcialPOO();
    
    public Parcial(){
      //  huespedes = new ArrayList<>();
        //reservaciones = new ArrayList<>();
    }
   
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
        int indice = split(NumerodeHabitacion);
        
        System.out.println("Ingrese el nuevo costo de la habitacion: ");
        double precio = poo.nextDouble();
        inventariodehabitaciones[indice].setPrecio(precio);
        System.out.println("Precio a sido modificado exitosamente.");
    }
    public void inhabilitarHabitaciones(Habitaciones[] inventariodehabitaciones){
        Scanner poo = new Scanner(System.in);
        System.out.println("Ingrese el Numero de habitación que desea inhabilitar: ");
        String Numerodehabitacion = poo.next();
        int indice = split(Numerodehabitacion);
        if(inventariodehabitaciones[indice].getEstado()=="Reservada"){
            System.out.println("Habitacion ocupada, la Habitacion no se puede inhabilitar ");
        }
        else if(inventariodehabitaciones[indice].getEstado()=="Inhabilitada"){
            System.out.println("Habitacion ya se encuentra inhabilitada");
        }
        else{
            inventariodehabitaciones[indice].setEstado("Inhabilitada");
            System.out.println("Se inhabilitó habitación: "+inventariodehabitaciones[indice].getNumHabitacion());
        }
    }
    public void habilitarHabitaciones(Habitaciones[] inventariodehabitaciones){
        Scanner poo = new Scanner(System.in);
        System.out.println(" Ingrese el numero de la habitación que desea habilitar: ");
        String NumerodeHabitacion = poo.next();
        int indice = split(NumerodeHabitacion);
        if(inventariodehabitaciones[indice].getEstado()=="Disponible"){
            System.out.println("Habitacion ya disponible");
        }
        else{
            inventariodehabitaciones[indice].setEstado("Disponible");
            System.out.println("La habitación "+inventariodehabitaciones[indice].getNumHabitacion()+" ahora está disponible");
        }
        
    }
    public int TipHabitaciones(int num,  String id, Reservaciones[] inventariodereservaciones){
        while(!inventariodereservaciones[num].getHabitaciones().getNumHabitacion().equals(id)){
            num=num+1;   
        }
        return num;
    }
    public void ModificarReservaciones(Habitaciones[] inventariodehabitaciones, Huespedes[] inventariodehuesped, Reservaciones[] Inventariodereservaciones){
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
        
        if (opc == 1) {
            Scanner poooo = new Scanner(System.in);
            System.out.println("Ingrese el nuevo nombre: ");
            String nombre = pooo.nextLine();
            inventariodereservaciones[hot].getHuespedes().setNombre(nombre);
            
            inventariodereservaciones[hot].getHuespedes().setDui(pedirDui());
            
            Scanner pooooo=new Scanner(System.in);
            System.out.println("Ingrese su tarjeta de credito: ");
            int tarjeta=pooooo.nextInt();
            inventariodereservaciones[hot].getHuespedes().setN_tarjeta(tarjeta);
       
            inventariodereservaciones[hot].getHuespedes().setEstadia(Estadia());

        }
        else if(opc == 2) {
        
        //reservaciones.get(pos).getHuesped().setNombre(nombre);
        System.out.println("Ingrese el nombre de la habitacion (Ejemplo: A-3, B-10, etc): ");
        String  NumerodeHabitacion = poo.next();
        int indice = split(id);
        inventariodehabitaciones[indice].setEstado("Disponible");
        int indice2=split(NumerodeHabitacion);
        String est=inventariodehabitaciones[indice2].getEstado();
        while (est != "Disponible") {
            System.out.println("Habitación ocupada o inhabilitada. Elija otra.");
            System.out.println("Ingrese el nombre de la habitacion (Ejemplo: A-3, B-2, C-8 etc): ");
            NumerodeHabitacion = poo.next();
            indice2 = split( NumerodeHabitacion);
            est = inventariodehabitaciones[indice2].getEstado();
        }
        inventariodehabitaciones[indice2].setEstado("Disponible");
        System.out.println("Habitación a sido asiganada exitosamente. ");
        inventariodereservaciones[hot].getHabitaciones().setNumHabitacion( NumerodeHabitacion);
        }
        /*else if(opc==3){
            
        }*/
    }    
    public void inhabilitarPiso(Habitaciones[] inventariodehabitaciones){
        Scanner leer = new Scanner(System.in);
        System.out.println("INHABILITACION DE PISO");
        System.out.println("Ingrese el piso a inhabilitar A,B,C,D,E,F (en mayúscula): ");
        String opc = leer.next();
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
        Scanner leer = new Scanner(System.in);
        System.out.println("HABILITACION DE PISO");
        System.out.println("Ingrese el piso a habilitar A,B,C,D,E,F (en mayúscula): ");
        String opc = leer.next();
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
    
   
                    
    
        
        
   
  