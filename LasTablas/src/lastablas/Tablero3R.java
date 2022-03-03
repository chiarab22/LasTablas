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

    public char[][] getTablero() {
        return tablero;
    }

    public void movimientox(Scanner teclado) {
        movimiento(teclado, x);
    }

    public void movimientoo(Scanner teclado) {
        movimiento(teclado, o);
    }

    private void movimiento(Scanner teclado, char caracter) {
        System.out.println("¿En qué columna?");
        int col = teclado.nextInt() - 1;

        for (int i = SIZE - 1; i >= 0; i--) {
            if (tablero[i][col] == VACIA) {
                tablero[i][col] = caracter;
                break;

            }
        }
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
        if (comprobacionFilasCol(x)) return true;
        if (comprobacionFilasCol(o)) return true;
        if (comprobacionDiagonales(x)) return true;
        return comprobacionDiagonales(o);
    }

    private boolean comprobacionFilasCol(char caracter) {
        int contadorfilas = 0;
        int contadorcolumnas = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (tablero[i][j] == caracter) {
                    contadorfilas++;
                    if (contadorfilas == 3) {
                        System.out.printf("¡El jugador %s ha ganado!%n" , caracter);
                        return true;
                    }
                } if (tablero[j][i] == caracter) {
                    contadorcolumnas++;
                    if (contadorcolumnas == 3) {
                        System.out.printf("¡El jugador %s ha ganado!%n", caracter);
                        return true;
                    }
                }

            }
            contadorfilas = 0;
            contadorcolumnas = 0;
        }
        return false;
    }


    private boolean comprobacionDiagonales(char caracter) {
        if (tablero[0][0] == tablero[2][2] && tablero[0][0] == tablero[1][1] && tablero[1][1] == caracter) {
            System.out.printf("¡El jugador %s ha ganado!%n", caracter);
            return true;
        } else if ((tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0] && tablero[1][1] == caracter)) {
            System.out.printf("¡El jugador %s ha ganado!%n", caracter);
            return true;
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
