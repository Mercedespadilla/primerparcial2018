/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;
import java.util.ArrayList;
/**
 *
 * @author Daniela Chavez
 */
public class Habit {
     private ArrayList<Habitaciones> NumHabitacion;
     public Habit(){
         NumHabitacion= new ArrayList<>();
     }
     public void adddatetothematrizjeje(int fila ,int columna){
         //System.out.println((char)65);
         //char xa=65;
         int cha=65;
         int matriz[][] = new int[fila][columna];
         for (int x=0; x < matriz.length; x++) {
                        for (int y=0; y < matriz[x].length; y++) {
                                //System.out.println (matriz[x][y]);
                                
                                System.out.print((char)cha);
                                System.out.print(y+1+"\t");
                                    }
                        cha++;
                      System.out.print("\n");  
        }
     }


















}

