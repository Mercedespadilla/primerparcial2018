/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner; 
/*Esta libreria nos permite leer lo que se digitas y lo guarda*/
/* java.util.Scanner se utiliza mas adelante*/


/**
 *
 * @author SalvadOlivo
 */
public class factura {
 /* Declaracion de variables*/   
 /* las declare privadas porque son datos priados e internos*/
    
  private static int cantidad;
  private static int id;
  private static int habitaciones;
    private static double costo;
    private static double iva;
    private static double total;
    private static double tot;
    private static String personas;
    private static String Nombre;
    private static String numeroPiso;
    private static String Dui;

    public factura() {
        /* constructor*/
    }
    
    /*se manda a llamar nombre, piso, dui, cantidad y costo */
    /*los mismos datos que se pide al registrarse*/
      public static void main(String[] args) {
    
       Scanner sc= new Scanner (System.in);
         System.out.println("digite nombre: ");
        Nombre=sc.next();
        System.out.println("digite piso: ");
        numeroPiso=sc.next();
        System.out.println("digite Dui: ");
        Dui=sc.next();
       System.out.println("digite cantidad");
        cantidad=sc.nextInt();
            System.out.println("Costo de habitacion");
        costo=sc.nextInt();
        
        /*ingresamos a un ciclo WHILE que siginica que hasta que se cumpla la condicion que esta dentro pasara al proximo
        en este caso si la cantidad de habitacioines es <1 no podra registrarse ya que no puedes obtener ninguna habitacion*/
        while(cantidad<1){
            System.out.println("digite valores validos " );
            cantidad=sc.nextInt(); /* este comando s.c nextInt sirve para leer las entradas de Scanner osea todo lo que estas digitando en el teclado asi puede
             leer la cantidad de habitaciones es lo mismo en todos los lados que aparece ese comando*/
        }
        /*mostramos un mensaje en pantalla*/
        System.out.println("digite costo unidad");
        costo=sc.nextInt();
      
        while(costo<1){
            System.out.println("digite valores validos " );
            costo=sc.nextInt();
        }
        
        
        /*Luego que terminas de desarrollar todo el registro y leer los datos ingresados 
        llamamos el metodo factura y el metodo calcular iva*/
        
    
       factura();
       calcularIva();
    }

    
    public static void factura(){
    /* metodo factura */

  /* aca se llaman todas las variables y los datos del cliente guardados en este momento 
    asi como su nombre, Dui,Numero de piso */
  
  /*arriba primero te aparecen los datos de la persona y luego llamamos a  calculaIva 
    luego llamaria el total ya que esta en el metodo calcular iva */
    
    
    System.out.println("su factura es " + "\n" +" nombre :"  + Nombre + "Dui : " +Dui + "\n" + "Numero de piso : " + numeroPiso + "\n" );
 }
    
    public static void calcularIva(){
        
        
        /*multiplicamos el costo obtenido por la cantidad de habitaciones y  da el total, luego aplicamos iva 
         y se muestra en un mensaje, pero esto no se muestra aca, mas arriba llamamos el metodo calcular iva
        ahi es donde se imprime  el total y el mensaje de su total */
         total = costo*cantidad;
        iva=(total*13)/100;
        tot=total+iva;
        System.out.println("costo total " + tot);
    }



       
    
    
/* Metodos get y set
    */
    /**
     * @return the cantidad
     */
    public static int getCantidad() {
        return cantidad;
    }

    /**
     * @param aCantidad the cantidad to set
     */
    public static void setCantidad(int aCantidad) {
        cantidad = aCantidad;
    }

    /**
     * @return the id
     */
    public static int getId() {
        return id;
    }

    /**
     * @param aId the id to set
     */
    public static void setId(int aId) {
        id = aId;
    }

    /**
     * @return the habitaciones
     */
    public static int getHabitaciones() {
        return habitaciones;
    }

    /**
     * @param aHabitaciones the habitaciones to set
     */
    public static void setHabitaciones(int aHabitaciones) {
        habitaciones = aHabitaciones;
    }

    /**
     * @return the costo
     */
    public static double getCosto() {
        return costo;
    }

    /**
     * @param aCosto the costo to set
     */
    public static void setCosto(double aCosto) {
        costo = aCosto;
    }

    /**
     * @return the iva
     */
    public static double getIva() {
        return iva;
    }

    /**
     * @param aIva the iva to set
     */
    public static void setIva(double aIva) {
        iva = aIva;
    }

    /**
     * @return the total
     */
    public static double getTotal() {
        return total;
    }

    /**
     * @param aTotal the total to set
     */
    public static void setTotal(double aTotal) {
        total = aTotal;
    }

    /**
     * @return the tot
     */
    public static double getTot() {
        return tot;
    }

    /**
     * @param aTot the tot to set
     */
    public static void setTot(double aTot) {
        tot = aTot;
    }

    /**
     * @return the personas
     */
    public static String getPersonas() {
        return personas;
    }

    /**
     * @param aPersonas the personas to set
     */
    public static void setPersonas(String aPersonas) {
        personas = aPersonas;
    }
    
    
    
}