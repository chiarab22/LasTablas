package lastablas;

import java.util.Scanner;

public class Ejercicio9 extends Tablero3R {

    private Tablero3R juego3R = generarTablero();

    public void tresEnRaya(Scanner teclado) {
        generarTablero();

        do {
            System.out.println("Turno del jugador X");
            juego3R.movimientox(teclado);
            imprimirTablero(juego3R);

            System.out.println("Turno del jugador O");
            juego3R.movimientoo(teclado);
            imprimirTablero(juego3R);
        } while (!juego3R.heGanado() && !juego3R.tableroAgotado());
    }
}
