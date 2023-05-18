package array_de_una_dimension;

public class Ejercicio2 {

    public static void main(String[] args) {
        char[] simbolo = new char[9];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        for (int i = 0; i < simbolo.length;i++) {//también se puede hacer con un for each

            System.out.println("símbolo[" + i + "]=" + simbolo[i]);
            //los que no tienen valor, loS iniciaciliza con null
        }
    }
}
