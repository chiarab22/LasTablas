package lastablas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    private int[] contador = new int[10];
    private ArrayList<Integer> listaNum = new ArrayList<>();

    public void numOcurrencias(Scanner teclado) {
        Arrays.fill(contador, 0);
        int valor1;
        do {
            System.out.println("Introduzca un valor comprendido entre 0 y 9 o -1 para terminar: ");
            valor1 = teclado.nextInt();
            listaNum.add(valor1);
        } while (valor1 != -1);

        for (int i = 0; i < contador.length; i++) {
            for (int valor:listaNum) {
                if(valor == i){
                    contador[i]++;
                }
            }
        }

        for (int i = 0; i < contador.length; i++) {
            System.out.printf("\nCantidad de %d: %d%n", i, contador[i]);
        }
    }
}
