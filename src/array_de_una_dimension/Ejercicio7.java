package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        // 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios
        int vector[] = new int[100];
        /*int convierte en entero lo que devuelve el Math.random, que es un doble. Se multiplica por 
        21 porque son el rango de valores que hay entre el 0 y el 20. Si quisiera que el número por 
        el que empiece no fuera el 0, añadiría a la formula + y el número por el que quiero que empiece
         */

        for (int i = 0; i < 100; i++) {
            vector[i] = (int) (Math.random() * 21);
            System.out.print(" " + vector[i] + " ");
        }
        System.out.println();

        //El programa pedirá entonces por teclado dos valores
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte valor 1");
        int numero1 = sc.nextInt();
        System.out.println("Inserte valor 2");
        int numero2 = sc.nextInt();

        /*cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente. Los números que se
        han cambiado deben aparecer entrecomillados*/
        for (int i = 0; i < 100; i++) {
            if (vector[i] == numero1) {
                vector[i] = numero2;
            }
        }
        for (int valor : vector) {
         if(valor == numero2) {
             System.out.print("\"" + valor + "\" ");
         }else{
            System.out.print(" " + valor + " "); 
         }
            
        }
    }

}
