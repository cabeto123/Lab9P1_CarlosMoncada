/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_carlosmoncada;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author calol
 */
public class Lab9P1_CarlosMoncada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> arreglo = new ArrayList<Integer>();
        ArrayList<Integer> arreglo2 = new ArrayList<Integer>();
        int opcion = 1;
        while (opcion != 3) {
            System.out.println("1.Triangular recursivo");
            System.out.println("2.Fusion descendente");
            System.out.println("3.Salir");
            opcion=entrada.nextInt();
            
            switch (opcion) {

                case 1:
                    System.out.println("Ingrese un numero: ");
                    int numero = entrada.nextInt();
                    Recursion recu = new Recursion(numero);
                    numero = recu.recursivo();
                    System.out.println("Numero " + numero);
                    break;
                case 2:
                    System.out.println("Digite la cantidad de elementos");
                    int cantelementos = entrada.nextInt();
                    Lista lista = new Lista();
                    arreglo = lista.llenararraylist(cantelementos,arreglo);
                    System.out.println("Digite la cantidad de elementos");
                     cantelementos = entrada.nextInt();
                    
                    arreglo2 = lista.llenararraylist(cantelementos,arreglo2);
                    System.out.print("La lista es:");
                    lista.imprimir(arreglo,false);
                    System.out.print("La otra lista es:");
                    lista.imprimir(arreglo2,false);
                     ArrayList<Integer> ordenado = new ArrayList();
                     ordenado=lista.ordenararreglo(arreglo, arreglo2);
                     System.out.print("La nueva lista fusionada es: ");
                     lista.imprimir(ordenado, false);
                     break;
                     
                    

            }

        }

    }

}
