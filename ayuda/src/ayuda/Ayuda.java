/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayuda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author calol
 */
public class Ayuda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> arreglo = new ArrayList<Integer>();
        ArrayList<Integer> arreglo2 = new ArrayList<Integer>();
        ArrayList<Integer> ordenado = new ArrayList<Integer>();
        arreglo = llenararraylist(4, arreglo);
        arreglo2 = llenararraylist(4, arreglo);
        System.out.println("ORDENANDO");
        ordenado = ordenararreglo(arreglo, arreglo2);
        System.out.println(ordenado);

    }

    public static ArrayList<Integer> llenararraylist(int cantelementos, ArrayList<Integer> arreglo) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        for (int i = 0; i < cantelementos; i++) {
            System.out.println("Digite el numero");

            arreglo.add(entrada.nextInt());
        }

        return arreglo;
    }

    public static ArrayList<Integer> ordenararreglo(ArrayList<Integer> arreglo, ArrayList<Integer> arreglo2) {
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

    public static int mayor(ArrayList<Integer> arreglo) {
        int mayor = arreglo.get(0);
        for (int i = 0; i < arreglo.size(); i++) {
            int numero = arreglo.get(i);
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }

    public static ArrayList<Integer> unir(ArrayList<Integer> arreglo1, ArrayList<Integer> arreglo2) {
        
        for (int i = 0; i < arreglo2.size(); i++) {
            arreglo1.add(arreglo2.get(i));
        }
        return arreglo1;
    }

}
