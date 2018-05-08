/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigosex;
import parcial.Paquete;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mercedes padilla
 */
public class codigopaquete {
    public static Paquete ObjP;
    public static ArrayList<Paquete> Lista = new ArrayList<>();
    public static Scanner tecla = new Scanner(System.in);
    char Op;
    public static void main(String[] args) {
        String Op;
        do{
            Op = Menu();
            switch(Op){
                case "1":
                    System.out.println("\n**********OPCIONES************\n");
                    System.out.println("\n**********Paquete Basico************\n");
                    System.out.println("\n***Precio: $40***\n");
                    System.out.println("\n***descripcion: ***\n");
                    break;
                case "2":
                    System.out.println("\n**********Paquete Premiun************\n");
                    System.out.println("\n***Precio: $70***\n");
                    System.out.println("\n***descripcion: ***\n");
                    break;
                case "3":
                    Crearpaquete();
                    break;
                case "4":
                    System.out.println("NOMBRE DEL PAQUETE A ELIMINAR:");
                    ObjP.setNombre(tecla.next());
                    Eliminar();
                    break;       
                }
        }while(!Op.equals("4"));
    }
    public static void Crearpaquete()
    {	
        ObjP = new Paquete();
        System.out.print("Nombre del paquete:");
        ObjP.setNombre(tecla.next());
        System.out.print("Precio del paquete:");
        ObjP.setPrecio(tecla.nextDouble());
        System.out.print("fecha entrada:");
        //ObjP.Servicios(tecla.());
        System.out.println("Ingrese detalles separados por comas");
        String detallePaquete = tecla.nextLine();
        ArrayList<String> serv = new ArrayList<>(); 
        String[] detalle = detallePaquete.split(",");
        for(int i = 0; i < detalle.length; i++){
            serv.add(detalle[i]);
        }
        ObjP.setServicios(serv);
        Lista.add(ObjP);
    }
}
