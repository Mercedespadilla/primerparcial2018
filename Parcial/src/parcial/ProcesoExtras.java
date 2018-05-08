/**
 * @author Monica Gomez
 * 
 */
package parcial;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcesoExtras {

public static Expaquete ObjE;
public static ArrayList<Expaquete> L = new ArrayList<>();
public static Scanner tecla = new Scanner(System.in);
    private static Object Lista;
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
            ObjE.setNombreextras(tecla.next());
            System.out.print("Costo del extra:");
            ObjE.setPrecioextra(tecla.nextDouble());
            Modificar();
            break;
            case "5":
            System.out.println("Ingrese el Nombre del extra a Eliminar:");
            ObjE.setNombreextras(tecla.next());
            Eliminar();
            break;       
            }
           }while(!Op.equals("6"));

           }

    public static void Insertar()
    {	
        ObjE = new Expaquete();
        System.out.print("Nombre del paquete:");
        ObjE.setNombreextras(tecla.next());
        System.out.print("Costo del paquete:");
        ObjE.setPrecioextra(tecla.nextDouble());
        L.add(ObjE);
    }
    
    public static void Listar()
    {	
        System.out.println("=== LISTADO DE Extras ===");
        for(int i = 0; i < L.size(); i++ )
        System.out.println(L.get(i).getNombreextras()+"\t "+
        L.get(i).getPrecioextra());
        
    }
    
    public static void Buscar(){
        boolean estado = false;
        System.out.print("Ingrese el nombre del extra a buscar:");
        String valor = tecla.next();
        for(int i = 0; i < L.size() ; i++)
        if(L.get(i).getNombreextras().equalsIgnoreCase(valor)){
        System.out.println(Lista.get(i).getPrecioextra()+"\t "+
                
        L.get(i).getNombreextras()+"\t"+
        L.get(i).getPrecioextra());
        
        estado = true;
        break;
        }
        System.out.println("=== VALOR "+valor+(estado ? " <SI> ":" <NO> ")+" ENCONTRADO");
    }
    
    public static void Modificar()
    { 
        boolean estado = false;
        for(int i = 0; i < L.size(); i++ ){
        if(L.get(i).getNombreextras().equalsIgnoreCase(ObjE.getNombreextras())){
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