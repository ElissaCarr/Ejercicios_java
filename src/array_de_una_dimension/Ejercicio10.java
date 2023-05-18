
package array_de_una_dimension;


public class Ejercicio10 {

    
    public static void main(String[] args) {
        // Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100  que los almacene en un array
         int vector[] = new int[20];
         for (int i = 0; i < 20; i++) {
            vector[i] = (int) (Math.random() * 101);
            System.out.print(" " + vector[i] + " ");
         }
         System.out.println();
         
         int aux = 0;
         int ultimopar = 0;
        for(int i=0; i<20; i++){
            if(vector[i]%2==0){
                aux = vector[i];
                vector[i] = vector[ultimopar];
                vector[ultimopar]= aux;
                ultimopar++;
            }
        }
        for(int valor : vector){
            System.out.print(" " + valor + " ");
        }
        System.out.println();
    }
    
}
