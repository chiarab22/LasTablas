package lastablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    private final int TAMAÑO = 4;
    int[][] tab2d = new int[TAMAÑO][TAMAÑO];

    public void queHace(Scanner teclado) {
        int option;
        do {
            menuQueHace();
            option = teclado.nextInt();
            teclado.nextLine();
            switch (option) {
                case 1:
                    int val =1;

                    for (int i = 0; i < TAMAÑO; i++) {
                        for (int j = 0; j < TAMAÑO; j++) {
                            tab2d[j][i] = val;
                            val++;
                        }
                    }
                    val = 1;

                    /*
                    AVISO: He tenido que repetir el rellenar array porque al ejecutarlo por primera vez varios valores no se estaban mostrando correctamente,
                    sin embargo con el resto de ejecuciones sí.
                    La única forma que he conseguido para mostrar los valores correctos desde el primer momento es repetir la secuencia.
                     */
                    for (int i = 0; i < TAMAÑO; i++) {
                        for (int j = 0; j < TAMAÑO; j++) {
                            tab2d[j][i] = val;
                            System.out.print(tab2d[i][j] + " ");
                            val++;
                        }

                        System.out.println();
                    }
                    break;
                case 2:
                    val = 0;

                    for (int j = 0; j < TAMAÑO; j++) {
                        for (int i = 0; i < TAMAÑO; i++) {
                            tab2d[j][i] = val;
                            val++;
                            System.out.print(tab2d[j][i] + " ");
                        }
                        val = j +1;
                        System.out.println();
                    }
                    break;

            }
        } while (option != 3);

    }

    public static void menuQueHace() {
        System.out.println("1. Tabla cuatro filas y cuatro columnas. ");
        System.out.println("2. Tabla con valores indicados. ");
        System.out.println("3. Salir. ");
    }
}

