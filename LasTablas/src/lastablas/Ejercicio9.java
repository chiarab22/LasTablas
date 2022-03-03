package lastablas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 extends Tablero3R {

    private Tablero3R juego3R = generarTablero();

    public void tresEnRaya(Scanner teclado) {
        generarTablero();
        imprimirTablero(juego3R);

        do {
            try {
                System.out.println("Turno del jugador X");
                juego3R.movimientox(teclado);
                imprimirTablero(juego3R);

                System.out.println("Turno del jugador O");
                juego3R.movimientoo(teclado);
                imprimirTablero(juego3R);
            } catch (InputMismatchException e) {
                System.out.println("El caracter introducido no es correcto. ");
                teclado.nextLine();
            }
        } while (!juego3R.heGanado() && !juego3R.tableroAgotado());
    }
}
