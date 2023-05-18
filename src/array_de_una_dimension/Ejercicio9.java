
package array_de_una_dimension;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        // Realiza un programa que pida 8 números enteros
        Scanner sc = new Scanner(System.in);
        int vector[] = new int[8];
        for(int i=0; i<8; i++){
            System.out.println("Introduce un número");
            vector[i]=sc.nextInt();
        }
        
        //Mostrar el vector añadiendo par o impar
        for(int i=0; i<8; i++){
            if(vector[i]%2==0){
            System.out.println(vector[i]+" Par");
            } else{
            System.out.println(vector[i]+" Impar"); 
            }          
        }
    }
    
}
