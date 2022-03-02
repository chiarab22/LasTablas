package lastablas;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class Tablero {
    private final int TAMAÑO =4;
    char[][] tablero = new char[TAMAÑO][TAMAÑO];
    final char desconocido = '?';
    Random r = new Random();
    int filaGanadora, colGanadora;

    public Tablero(char[][] tablero, int filaGanadora, int colGanadora) {
        this.tablero = tablero;
        this.filaGanadora = filaGanadora;
    }

    public Tablero() {
    }

    public char[][] getTablero() {
        return tablero;
    }

    public Tablero generarTablero(){
        filaGanadora = (r.nextInt(4));
        colGanadora = (r.nextInt(4));
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                tablero[i][j] = desconocido;
            }
        }
        return new Tablero(tablero, filaGanadora, colGanadora);
    }

    public void imprimirTablero(Tablero tab){
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                System.out.println(tab.getTablero()[i][j]);
            }
        }
    }
}
