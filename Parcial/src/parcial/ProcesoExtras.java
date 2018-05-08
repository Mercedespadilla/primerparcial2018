/**
 * @author Monica Gomez
 * 
 */
package parcial;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcesoExtras {

public static Huesped ObjE;
public static ArrayList<Expaquete> L = new ArrayList<>();
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
            ObjE = new Expaquete();
            System.out.print("Ingrese el nombre del extra a modificar:"); 
            ObjE.setNombreExtra(tecla.next());
            System.out.print("Costo del extra:");
            ObjE.setCostoExtra(tecla.next());
            Modificar();
            break;
            case "5":
            System.out.println("Ingrese el Nombre del extra a Eliminar:");
            ObjE.setNombreExtra(tecla.next());
            Eliminar();
            break;       
            }
           }while(!Op.equals("6"));

           }

    public static void Insertar()
    {	
        ObjE = new Expaquete();
        System.out.print("Nombre del paquete:");
        ObjE.setNombreExtra(tecla.next());
        System.out.print("Costo del paquete:");
        ObjE.setCostoExtra(tecla.next())
        L.add(ObjE);
    }
    
    public static void Listar()
    {	
        System.out.println("=== LISTADO DE Extras ===");
        for(int i = 0; i < L.size(); i++ )
        System.out.println(L.get(i).getNombreExtra()+"\t "+
        L.get(i).getCostoExtra());
        
    }
    
    public static void Buscar(){
        boolean estado = false;
        System.out.print("Ingrese el nombre del extra a buscar:");
        String valor = tecla.next();
        for(int i = 0; i < L.size() ; i++)
        if(L.get(i).getNombreExtra().equalsIgnoreCase(valor)){
        System.out.println(Lista.get(i).getCostoExtra()+"\t "+
        L.get(i).getNombreExtra()+"\t"+
        L.get(i).getCostoExtra());
        
        estado = true;
        break;
        }
        System.out.println("=== VALOR "+valor+(estado ? " <SI> ":" <NO> ")+" ENCONTRADO");
    }
    
    public static void Modificar()
    { 
        boolean estado = false;
        for(int i = 0; i < L.size(); i++ ){
        if(L.get(i).getNombreExtra().equalsIgnoreCase(ObjE.getNombreExtra())){
        estado = true;
        L.set(i, ObjE);
        System.out.println("=== DATO "+(estado ? " <SI> ":" <NO> ")+" MODIFICADO");
        }
        }

    }

    public static void Eliminar()
    {
        boolean estado;
        for(int i = 0; i < L.size(); i++ ){
        //if(Lista.get(i).getIdPersona()){
        estado = L.remove(ObjE);
        System.out.println("=== DATO "+(estado ? " <SI> " : " <NO> ")+"REMOVIDO");
        //}
        }
    }
    
    public static String Menu()
    {
        System.out.println("\n=== MENU DE OPCIONES");
        System.out.println("1.- Añadir Extra");
        System.out.println("2.- Listar Extras del paquete");
        System.out.println("3.- Buscar codigo de extras");
        System.out.println("4.- Modificar extras del paquete");
        System.out.println("5.- Eliminar extras del paquete");
         System.out.println("6.- Salir del Sistema");
        System.out.print("Digite Opcion entre 1-6:");
        return tecla.next();
    }
    
    
    
}