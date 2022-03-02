package lastablas;

import java.util.Random;
import java.util.Scanner;

public class Tablero {
    private final int SIZE = 4;
    char[][] tablero = new char[SIZE][SIZE];

    final char desconocido = '?';
    final char agua = '~';

    Random r = new Random();

    int filaGanadora;
    int colGanadora;

    boolean win;

    public Tablero(char[][] tablero) {
        this.tablero = tablero;
    }

    public Tablero() {
    }

    public char[][] getTablero() {
        return tablero;
    }

    public int getFilaGanadora() {
        return filaGanadora;
    }

    public int getColGanadora() {
        return colGanadora;
    }

    public Tablero generarTablero() {
        filaGanadora = (r.nextInt(4));
        colGanadora = (r.nextInt(4));
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tablero[i][j] = desconocido;
            }
        }
        return new Tablero(tablero);
    }

    public Tablero movimiento(Scanner teclado) {
        System.out.println("¿Qué columna? ");
        int col = teclado.nextInt() -1;
        System.out.println("¿Qué fila? ");
        int fila = teclado.nextInt() -1;

        if (col == this.colGanadora && fila == this.filaGanadora) {
            this.win = true;
        } else {
            tablero[fila][col] = agua;
        }
        return new Tablero(tablero);

    }

    public void imprimirTablero(Tablero tab) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(tab.getTablero()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean heGanado() {
        return this.win;
    }
}
