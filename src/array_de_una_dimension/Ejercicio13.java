
package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio13 {

  
    public static void main(String[] args) {
    // Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500
    Scanner sc = new Scanner(System.in);
    int vector[] = new int[100];
         for (int i = 0; i <100; i++) {
            vector[i] = (int) (Math.random() * 501);
            System.out.println(" Mostrar vector: " + vector);
         }
    //el programa mostrará el array y preguntará si el usuario quiere destacar el máximo o el mínimo    
         
     System.out.println("¿Desea destacar el máximo o el mínimo?");
     String opcion = sc.nextInt();
  
        // Encontrar el número máximo y mínimo
        int maximo = encontrarMaximo(vector);
        int minimo = encontrarMinimo(vector);

        // Destacar el máximo o el mínimo en el array
        if (opcion.equalsIgnoreCase("max")) {
            destacarNumero(array, maximo);
        } else if (opcion.equalsIgnoreCase("min")) {
            destacarNumero(array, minimo);
        }

        // Mostrar el array con el número destacado
        System.out.println("Array con número destacado:");
        mostrarArray(array);
    }

  

    // Método para encontrar el número máximo en un array
    public static int encontrarMaximo(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }
        return maximo;
    }

    // Método para encontrar el número mínimo en un array
    public static int encontrarMinimo(int[] array) {
        int minimo = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < minimo) {
                minimo = vector[i];
            }
        }
        return minimo;
    }

    // Método para destacar un número en el array
    public static void destacarNumero(int[] vector, int numero) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero) {
                vector[i] = -numero;
                break;
            }
        }
    }
}

     
     
     

    
