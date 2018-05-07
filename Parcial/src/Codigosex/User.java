/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigosex;
import java.util.Scanner;
import parcial.Paquete;
import parcial.Habitaciones;
import parcial.Menu;
/**
 *
 * @author mercedes padilla
 */


//Clase Usuario
public class User {
    public String users;
    public String password;

    public User() {
    }

    public User(String users, String password) {
        this.users = users;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
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
        users = leer.nextLine();
       
        if(users.equals("admin") && password.equals("admin")){
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
