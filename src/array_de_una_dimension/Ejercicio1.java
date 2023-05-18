package array_de_una_dimension;

public class Ejercicio1 {

    public static void main(String[] args) {
        int[] num = new int[12];//acaba en la posicion 11
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        for (int i = 0; i < num.length; i++) {//también se puede hacer con un for each
            System.out.println("num[" + i + "]=" + num[i]);
            //Los que no tienen caracter los inicializa con 0
        }
    }

}
