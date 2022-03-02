package lastablas;

import java.util.Scanner;

public class Tablero3R {
    private final int SIZE = 3;
    protected char[][] tablero = new char[SIZE][SIZE];

    private final char x = 'x';
    private final char o = 'o';
    private final char VACIA = '_';

    public Tablero3R() {
    }

    public Tablero3R(char[][] tablero) {
        this.tablero = tablero;
    }

    public Tablero3R generarTablero() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tablero[i][j] = VACIA;
            }
        }
        return new Tablero3R(tablero);
    }


    public void movimientox(Scanner teclado) {
        movimiento(teclado, x);
    }

    public void movimientoo(Scanner teclado) {
        movimiento(teclado, o);
    }

    private void movimiento(Scanner teclado, char caracter) {
        try {
            System.out.println("¿En qué columna?");
            int col = teclado.nextInt() - 1;

            for (int i = SIZE - 1; i >= 0; i--) {
                if (tablero[i][col] == VACIA) {
                    tablero[i][col] = caracter;
                    break;

                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Esa posición no existe");
        }
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void imprimirTablero(Tablero3R tab) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(tab.getTablero()[i][j] + " ");
            }
            System.out.println();
        }
    }


    public boolean heGanado() {
        int contador = 0;

        if (comprobacionFilas(contador, x)) return true;
        if (comprobacionFilas(contador, o)) return true;
        if (comprobacionColumnas(contador, x)) return true;
        return comprobacionColumnas(contador, o);
    }

    private boolean comprobacionFilas(int contador, char caracter) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (tablero[i][j] == caracter) {
                    contador++;
                    if (contador == 3) {
                        System.out.printf("¡El jugador %s ha ganado!%n", caracter);
                        return true;
                    }
                }

            }
            contador = 0;
        }
        return false;
    }

    private boolean comprobacionColumnas(int contador, char caracter) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (tablero[j][i] == caracter) {
                    contador++;
                    if (contador == 3) {
                        System.out.printf("¡El jugador %s ha ganado!%n", caracter);
                        return true;
                    }
                }

            }
            contador = 0;
        }
        return false;
    }


    public boolean tableroAgotado() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (tablero[i][j] == VACIA) {
                    return false;
                }
            }

        }
        System.out.println("¡Empate!");
        return true;
    }

}
