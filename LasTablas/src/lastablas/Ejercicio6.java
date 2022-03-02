package lastablas;

import java.util.Scanner;

public class Ejercicio6 {
    private final int TAMAÑO = 4;
    int[][] tab2d = new int[TAMAÑO][TAMAÑO];

    public void queHace(Scanner teclado) {
        int option;
        do {
            menuQueHace();
            option = teclado.nextInt();
            switch (option) {
                case 1:
                    int val = 1;
                    for (int j = 0; j < TAMAÑO; j++) {
                        for (int i = 0; i < TAMAÑO; i++) {
                            tab2d[j][i] = val;
                            val++;
                            System.out.print(tab2d[j][i] + " ");
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

