/**
 * @author Monica Gomez
 */
package parcial;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcesosHuesped {

public static Huesped ObjH;
public static ArrayList<Huesped> Lista = new ArrayList<>();
public static Scanner tecla = new Scanner(System.in);
char Op;
 
    
    public static void main(String[] args) {
        String Op;
        do{
            Op = Menu();
            switch(Op){
            case "1":
            Insertar();
            break;
            case "2":
            Listar();
            break;
            case "3":
            Buscar();
            break;
            case "4":
            ObjH = new Huesped();
            System.out.print("Ingrese el nombre de huesped a modificar:"); 
            ObjH.setNombre(tecla.next());
            System.out.print("Apellidos:");
            ObjH.setApellido(tecla.next());
            System.out.print("Edad:");
            ObjH.setEdad(tecla.nextInt());
            System.out.print("Pais:");
            ObjH.setPais(tecla.next());
            System.out.print("Telefono:");
            ObjH.setTelefono(tecla.next());
            System.out.print("Tarjeta:");
            ObjH.setTarjeta(tecla.next());
            Modificar();
            break;
            case "5":
            System.out.println("Ingrese el Nombre de Huesped a Eliminar:");
            ObjH.setNombre(tecla.next());
            Eliminar();
            break;       
            }
           }while(!Op.equals("6"));

           }

    public static void Insertar()
    {	
        ObjH = new Huesped();
        System.out.print("Nombre:");
        ObjH.setNombre(tecla.next());
        System.out.print("Apellidos:");
        ObjH.setApellido(tecla.next());
        System.out.print("Edad:");
        ObjH.setEdad(tecla.nextInt());
        System.out.print("Pais:");
        ObjH.setPais(tecla.next());
        System.out.print("Telefono:");
        ObjH.setTelefono(tecla.next());
        System.out.print("Tarjeta:");
        ObjH.setTarjeta(tecla.next());
        Lista.add(ObjH);
    }
    
    public static void Listar()
    {	
        System.out.println("=== LISTADO DE HUESPEDES ===");
        for(int i = 0; i < Lista.size(); i++ )
        System.out.println(Lista.get(i).getNombre()+"\t "+
        Lista.get(i).getApellido()+"\t"+
        Lista.get(i).getEdad()+"\t"+
        Lista.get(i).getPais()+"\t"+
        Lista.get(i).getTelefono()+"\t"+
        Lista.get(i).getTarjeta());
    }
    
    public static void Buscar(){
        boolean estado = false;
        System.out.print("Ingrese el nombre de huesped a buscar:");
        String valor = tecla.next();
        for(int i = 0; i < Lista.size() ; i++)
        if(Lista.get(i).getNombre().equalsIgnoreCase(valor)){
        System.out.println(Lista.get(i).getApellido()+"\t "+
        Lista.get(i).getNombre()+"\t"+
        Lista.get(i).getApellido()+"\t"+
        Lista.get(i).getEdad()+"\t"+
        Lista.get(i).getPais()+"\t"+
        Lista.get(i).getTelefono()+"\t"+
        Lista.get(i).getTarjeta());
        estado = true;
        break;
        }
        System.out.println("=== VALOR "+valor+(estado ? " <SI> ":" <NO> ")+" ENCONTRADO");
    }
    
    public static void Modificar()
    { 
        boolean estado = false;
        for(int i = 0; i < Lista.size(); i++ ){
        if(Lista.get(i).getNombre().equalsIgnoreCase(ObjH.getNombre())){
        estado = true;
        Lista.set(i, ObjH);
        System.out.println("=== DATO "+(estado ? " <SI> ":" <NO> ")+" MODIFICADO");
        }
        }

    }

    public static void Eliminar()
    {
        boolean estado;
        for(int i = 0; i < Lista.size(); i++ ){
        //if(Lista.get(i).getIdPersona()){
        estado = Lista.remove(ObjH);
        System.out.println("=== DATO "+(estado ? " <SI> " : " <NO> ")+"REMOVIDO");
        //}
        }
    }
    
    public static String Menu()
    {
        System.out.println("\n=== MENU DE OPCIONES");
        System.out.println("1.- Añadir Huesped");
        System.out.println("2.- Listar Huesped");
        System.out.println("3.- Buscar Huesped");
        System.out.println("4.- Modificar Huesped");
        System.out.println("5.- Eliminar Huesped");
         System.out.println("6.- Salir del Sistema");
        System.out.print("Digite Opcion entre 1-6:");
        return tecla.next();
    }
    
    
    
}