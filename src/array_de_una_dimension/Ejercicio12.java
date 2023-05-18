
package array_de_una_dimension;

import java.util.Scanner;


public class Ejercicio12 {

    public static void main(String[] args) {
        // Realiza un programa que pida 10 números por teclado y que los almacene en un array.
        Scanner sc = new Scanner(System.in);
        int vector[] = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Introduce un número");
            vector[i]=sc.nextInt();
        }
     /*A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.*/   
        
        
    }
    
}
