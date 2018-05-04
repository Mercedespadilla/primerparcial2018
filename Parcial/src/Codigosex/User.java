/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigosex;
import java.util.Scanner;
import parcial.Paquete;
import parcial.Habitaciones;

/**
 *
 * @author mercedes padilla
 */
public class User {
    public String user;
    public String password;

    public Usuario() {
    }

    public Usuario(String user, String password) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void login(Habitaciones[] listahabitacion, Paquete basico, Paquete premium){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su usuario: ");
        user = leer.nextLine();
       
        if(user.equals("admin") && password.equals("admin")){
            System.out.println("Ha iniciado sesion como administrador");
            Menu menu = new Menu();
            menu.menuAdmin(listahabitacion, basico, premium);
        }else if(user.equals("empleado") && password.equals("empleado")){
            System.out.println("Ha iniciado sesion como empleado");
            Menu menu2 = new Menu();
            menu2.menuEmpleado(listahabitacion, basico, premium);
        }else{
            System.out.println("Credenciales incorrectas");
        }
    }
    
}
