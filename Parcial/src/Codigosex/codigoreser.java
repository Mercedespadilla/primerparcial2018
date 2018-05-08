/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigosex;
import java.util.ArrayList;
import java.util.Scanner;
import parcial.Huesped;
import parcial.RegistroReserva;
import parcial.Paquete;
/**
 *
 * @author mercedes padilla
 */
public class codigoreser {
    public static RegistroReserva ObjH;
    public static ArrayList<RegistroReserva> Lista = new ArrayList<>();
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
                    ObjH = new RegistroReserva();
                    System.out.print("Ingrese el codigo de la reserva a modifica:"); 
                    ObjH.setCodigo(tecla.next());
                    System.out.print("Fecha de la reserva:");
                    ObjH.setFechareserva(tecla.next());
                    System.out.print("fecha de entrada:");
                    ObjH.setFechaentrada(tecla.next());
                    System.out.print("fecha de salida:");
                    ObjH.setFechasalida(tecla.next());
                    System.out.print("Cantodad de personas:");
                    ObjH.setCantpersona(tecla.nextDouble());
                    System.out.print("Precio:");
                    ObjH.setPrecio(tecla.nextDouble());
                    Modificar();
                break;
                case "5":
                    System.out.println("Codigo de reserva a Eliminar?:");
                    ObjH.setCodigo(tecla.next());
                    Eliminar();
                    break;       
                }
        }while(!Op.equals("6"));
    }
    public static void Insertar()
    {	
        ObjH = new RegistroReserva();
        System.out.print("Codigo de reserva:");
        ObjH.setCodigo(tecla.next());
        System.out.print("fecha de reserva:");
        ObjH.setFechareserva(tecla.next());
        System.out.print("fecha entrada:");
        ObjH.setFechaentrada(tecla.next());
        System.out.print("fecha salida:");
        ObjH.setFechasalida(tecla.next());
        System.out.print("cantidad de personas:");
        ObjH.setCantpersona(tecla.nextDouble());
        System.out.print("precio:");
        ObjH.setPrecio(tecla.nextDouble());
        Lista.add(ObjH);
    }
    public static void Listar()
    {	
        System.out.println("RESERVAS");
        for(int i = 0; i < Lista.size(); i++ )
        System.out.println(Lista.get(i).getCodigo()+"\t "+
        Lista.get(i).getFechareserva()+"\t"+
        Lista.get(i).getFechaentrada()+"\t"+
        Lista.get(i).getFechasalida()+"\t"+
        Lista.get(i).getCantpersona()+"\t"+
        Lista.get(i).getPrecio());
    }
     public static void Buscar(){
        boolean estado = false;
        System.out.print("Ingrese codigo de reserva a buscar:");
        String valor = tecla.next();
        for(int i = 0; i < Lista.size() ; i++)
        if(Lista.get(i).getCodigo().equalsIgnoreCase(valor)){
        System.out.println(Lista.get(i).getFechareserva()+"\t "+
        Lista.get(i).getCodigo()+"\t"+
        Lista.get(i).getFechareserva()+"\t"+
        Lista.get(i).getFechaentrada()+"\t"+
        Lista.get(i).getFechasalida()+"\t"+
        Lista.get(i).getCantpersona()+"\t"+
        Lista.get(i).getPrecio());
        estado = true;
        break;
        }
        System.out.println("VALOR "+valor+(estado ? " <SI> ":" <NO> ")+" ENCONTRADO");
    }
    
    public static void Modificar()
    { 
        boolean estado = false;
        for(int i = 0; i < Lista.size(); i++ ){
        if(Lista.get(i).getCodigo().equalsIgnoreCase(ObjH.getCodigo())){
        estado = true;
        Lista.set(i, ObjH);
        System.out.println("DATO "+(estado ? " <SI> ":" <NO> ")+" MODIFICADO");
        }
        }

    }
     public static void Eliminar()
    {
        boolean estado;
        for(int i = 0; i < Lista.size(); i++ ){
        estado = Lista.remove(ObjH);
        System.out.println("DATO "+(estado ? " <SI> " : " <NO> ")+"REMOVIDO");
        }
    }
    
    public static String Menu()
    {
        System.out.println("\n**********OPCIONES************\n");
        System.out.println("1.- Añadir Reserva");
        System.out.println("2.- todas las Reserva");
        System.out.println("3.- Buscar Reserva");
        System.out.println("4.- Modificar Reserva");
        System.out.println("5.- Eliminar Reserva");
         System.out.println("6.- Salir del Sistema");
        System.out.print("Digite Opcion entre 1-6:");
        return tecla.next();
    }
}
