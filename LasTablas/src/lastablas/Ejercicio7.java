package lastablas;

import java.util.Random;

public class Ejercicio7 {
    Random r = new Random();
    private char[][] tabla = new char[20][30];
    private char caracter1 = (char) (r.nextInt(26) + 'a');


    public void imprimirTabla() {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j] = caracter1;
                caracter1 = (char) (r.nextInt(26) + 'a');

                System.out.print(tabla[i][j]);
            }
            System.out.println();
        }

    }
}
