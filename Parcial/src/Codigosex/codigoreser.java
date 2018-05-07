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
        }while(true);
    }
}
