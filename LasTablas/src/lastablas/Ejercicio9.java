package lastablas;

import java.util.Scanner;

public class Ejercicio9 extends Tablero3R{

    Tablero3R juego3R = generarTablero();

    public void tresEnRaya(Scanner teclado){
        generarTablero();

        movimientox(teclado);
        imprimirTablero(juego3R);
        movimientoo(teclado);
    }
}
