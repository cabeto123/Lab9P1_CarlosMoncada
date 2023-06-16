/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_carlosmoncada;

/**
 *
 * @author calol
 */
public class Recursion {
int entero;
int i=0;
int j=0;
    public Recursion(int entero) {
        this.entero = entero;
    }
   public int recursivo(){
       if (j<entero) {
           i++;
           j++;
           
           return i+recursivo();
       }else{
       return 0;
       
       }
   
   
   }
 
}
