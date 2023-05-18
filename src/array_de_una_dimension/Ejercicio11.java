
package array_de_una_dimension;

import java.util.Scanner;


public class Ejercicio11 {

    
    public static void main(String[] args) {
        // Realiza un programa que pida 10 números por teclado y que los almacene en un array
        //A continuación se mostrará el contenido de ese array junto al índice(0 – 9) 
        Scanner sc = new Scanner(System.in);
        int indice[] = new int[10];
        int vector[] = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Introduce un número");
            vector[i]=sc.nextInt();
            
            System.out.print("Vector: "+vector[i]);
        }
        for (int i = 0; i < 10; i++) {
        indice[i] = i;
        System.out.print("Indice: " +indice[i]);
        }
      
        
        
        
        
        
    }
    
}
