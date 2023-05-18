
package array_de_una_dimension;

import java.util.Scanner;


public class Ejercicio_6 {

  
    public static void main(String[] args) {
         // Escribe un programa que lea 15 números por teclado y que los almacene en un array
        int[] numeros = new int[15];
        Scanner sc = new Scanner (System.in);
       for(int i=0; i<numeros.length; i++){
          System.out.println("Introduce un número del vector");
         // variable = valor scanner
          numeros[i] = sc.nextInt();
       }      
    // Rota los elementos de ese array, el elemento de la posición 0 pasa a la 1
    //la variable aux la declaro fuera del for para que no se cree cada vez
    int aux=numeros[14];
    for(int i=14; i>=0; i--){
        if (i!=0){
            numeros [i] = numeros[i-1];
        }else{
            numeros[0] = aux;
        }
    }
    // foreach 
    for(int valor:numeros){
        System.out.print(valor);
    }
    }
    
}


    
    

