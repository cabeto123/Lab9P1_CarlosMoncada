/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_carlosmoncada;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author calol
 */
public class Lista {


    public Lista() {
    }

    
 
  public ArrayList<Integer> llenararraylist(int cantelementos, ArrayList<Integer> arreglo){
  Scanner entrada = new Scanner(System.in);
  int numero=0;
    
      for (int i = 0; i < cantelementos; i++) {
      numero=(int) ((Math.random() * (20 - 1)) + 1);
      arreglo.add(numero);
      }
  return arreglo;
  }
  
  public void imprimir(ArrayList<Integer> arreglo,boolean si){
      System.out.print("{");
      if (si==false) {
      for (int i = 0; i < arreglo.size(); i++) {
          if (i==arreglo.size()-1) {
            System.out.print(arreglo.get(i));    
          }else{
          System.out.print(arreglo.get(i)+",");    
          }
          
      }    
      }
      System.out.println("}");
      
  }
  
  public ArrayList<Integer> unir(ArrayList<Integer> arreglo1,ArrayList<Integer> arreglo2){
      for (int i = 0; i < arreglo2.size(); i++) {
          arreglo1.add(arreglo2.get(i));
      }
  return arreglo1;
  } 
  
  
    public  ArrayList<Integer> ordenararreglo(ArrayList<Integer> arreglo, ArrayList<Integer> arreglo2) {
        ArrayList<Integer> arrayunido = new ArrayList();
         arreglo.addAll(arreglo2);
         arrayunido=arreglo;
        int mayor;
        int indice;
        ArrayList<Integer> nuevoarray = new ArrayList();
        while (arrayunido.size() > 0) {
             mayor = mayor(arrayunido);
            
            nuevoarray.add(mayor); 
             indice = arrayunido.indexOf(mayor);
            arrayunido.remove(indice);
           
        }

        return nuevoarray;
    }
  public static int mayor(ArrayList<Integer> arreglo){
      int mayor=arreglo.get(0);
      for (int i = 0; i < arreglo.size(); i++) {
      int numero=arreglo.get(i);
          if (numero>mayor) {
              mayor=numero;
          }
      }
  return mayor;
  }
}


