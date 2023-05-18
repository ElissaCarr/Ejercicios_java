package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio6 {
    
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
    int aux=0;
    for(int i=0; i<numeros.length; i++){
        if (i!=numeros.length - 1){
            aux = numeros[i + 1];
            //varible = valor de otra posición
            numeros [i+1] = numeros[i];
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

