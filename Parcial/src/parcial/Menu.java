package parcial;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Monica Gomez
 */
public class Menu {

    public static void main(String[] args) {
        
 Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Huesped");
            System.out.println("2. Reserva");
            System.out.println("3. Paquete");
            System.out.println("4. Tipo Habitacion");
            System.out.println("5. Habitacion");
            System.out.println("6. Disponibilidad");            
            System.out.println("7. Categoria Habitacion");            
            System.out.println("8. Piso");     
            System.out.println("9. Extras");                 
            System.out.println("10. Factura");                 
            System.out.println("11. Salir"); 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1 Huesped");
                        ProcesosHuesped.main(args);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2 Reserva");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3 Paquete");
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4 Tipo Habitacion");
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5 Habitacion");
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion 6 Disponibilidad");
                        break;
                    case 7:
                        System.out.println("Has seleccionado la opcion 7 Categoria Habitacion");
                        break;
                    case 8:
                        System.out.println("Has seleccionado la opcion 8 Piso");
                        break;
                    case 9:
                        System.out.println("Has seleccionado la opcion 9 Extras");
                        break;
                    case 10:
                        System.out.println("Has seleccionado la opcion 10 Factura");
                        break;
                    case 11:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 11");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        }   
}