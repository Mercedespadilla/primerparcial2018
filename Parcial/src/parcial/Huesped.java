/**
 * @author Monica Gomez
 */
package parcial;

import java.util.Scanner;


public class Huesped {

    private static void crearHuesped() {
        String strNombre = "";
        String strApellido = "";
        String strEdad  = "";
        String strPais  = "";
        String strTelefono  = "";
        String strTarjeta  = "";
        Scanner entradaEscaner = new Scanner (System.in); 
        System.out.println ("Por favor introduzca el nombre del huesped:");
        strNombre = entradaEscaner.nextLine (); 
        System.out.println ("Por favor introduzca el apellido del huesped:");
        strApellido = entradaEscaner.nextLine (); 
        System.out.println ("Por favor introduzca la edad del huesped:");
        strEdad = entradaEscaner.nextLine ();
        System.out.println ("Por favor introduzca el pais de residencia del huesped:");
        strPais = entradaEscaner.nextLine ();
        System.out.println ("Por favor introduzca el telefono del huesped:");
        strTelefono = entradaEscaner.nextLine ();
        System.out.println ("Por favor introduzca el numero de tarjeta del huesped:");
        strTarjeta = entradaEscaner.nextLine ();
    }

    private static void modificarHuesped() {
        String strNombre = "";
        String strApellido = "";
        String strEdad  = "";
        String strPais  = "";
        String strTelefono  = "";
        String strTarjeta  = "";
        Scanner entradaEscaner = new Scanner (System.in); 
        System.out.println ("Por favor introduzca el nombre del huesped:");
        strNombre = entradaEscaner.nextLine (); 
        System.out.println ("Por favor introduzca el apellido del huesped:");
        strApellido = entradaEscaner.nextLine (); 
        System.out.println ("Por favor introduzca la edad del huesped:");
        strEdad = entradaEscaner.nextLine ();
        System.out.println ("Por favor introduzca el pais de residencia del huesped:");
        strPais = entradaEscaner.nextLine ();
        System.out.println ("Por favor introduzca el telefono del huesped:");
        strTelefono = entradaEscaner.nextLine ();
        System.out.println ("Por favor introduzca el numero de tarjeta del huesped:");
        strTarjeta = entradaEscaner.nextLine ();
    }    
    
        private static void eliminarHuesped() {
        String strNombre = "";
        String strApellido = "";
        String strEdad  = "";
        String strPais  = "";
        String strTelefono  = "";
        String strTarjeta  = "";
        Scanner entradaEscaner = new Scanner (System.in); 
        System.out.println ("Por favor introduzca el nombre del huesped:");
        strNombre = entradaEscaner.nextLine (); 
        System.out.println ("Por favor introduzca el apellido del huesped:");
        strApellido = entradaEscaner.nextLine (); 
        System.out.println ("Por favor introduzca la edad del huesped:");
        strEdad = entradaEscaner.nextLine ();
        System.out.println ("Por favor introduzca el pais de residencia del huesped:");
        strPais = entradaEscaner.nextLine ();
        System.out.println ("Por favor introduzca el telefono del huesped:");
        strTelefono = entradaEscaner.nextLine ();
        System.out.println ("Por favor introduzca el numero de tarjeta del huesped:");
        strTarjeta = entradaEscaner.nextLine ();
    }
    
    private String nombre;
    private String apel1;
    private String apel2;
    private String dni;
    
    public static void main(String[] args) {
           Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
        
       while(!salir){
            
           System.out.println("1. Opcion 1 Crear Huesped");
           System.out.println("2. Opcion 2 Modificar Huesped");
           System.out.println("3. Opcion 3 Eliminar Huesped");
           System.out.println("4. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("Has seleccionado la opcion 1");
                   crearHuesped();
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   modificarHuesped();
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
                   eliminarHuesped();
                   break;
                case 4:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
        }    
    }
}
  
