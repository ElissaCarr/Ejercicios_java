
package array_de_una_dimension;

 
  import java.util.Scanner;

 import java.util.Random;

public class Ejercicio5 {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] numeros = new int[10];
    
    // Genera 10 números aleatorios entre 0 y 100
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = rand.nextInt(101);
    }
    
    // Busca el número máximo y mínimo
    int max = numeros[0];
    int min = numeros[0];
    for (int i = 1; i < numeros.length; i++) {
      if (numeros[i] > max) {
        max = numeros[i];
      }
      if (numeros[i] < min) {
        min = numeros[i];
      }
    }
    
    // Muestra los números introducidos junto con "máximo" y "mínimo" al lado del máximo y del mínimo, respectivamente
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i]);
      if (numeros[i] == max) {
        System.out.print(" (máximo)");
      } else if (numeros[i] == min) {
        System.out.print(" (mínimo)");
      }
      System.out.println();
    }
  }
}
