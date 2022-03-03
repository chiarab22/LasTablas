package lastablas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 extends Tablero {
    private Tablero juegoBarco;

    public void guerraBarcos(Scanner teclado) {

        juegoBarco = generarTablero();
        imprimirTablero(juegoBarco);

        do {
            try {
                movimiento(juegoBarco, teclado);
                imprimirTablero(juegoBarco);
            }catch (InputMismatchException e){
                System.out.println("El caracter introducido no es correcto");
            }

        } while (!juegoBarco.heGanado());
        System.out.println("Felicidades, ¡has ganado!");


    }

    public static void movimiento(Tablero tablero, Scanner teclado) {
        teclado.nextLine();

            System.out.println("¿Qué columna? ");
            int col = teclado.nextInt() - 1;
            System.out.println("¿Qué fila? ");
            int fila = teclado.nextInt() - 1;


            if (col == tablero.getColGanadora() && fila == tablero.getFilaGanadora()) {
                tablero.setWin(true);
            } else {
                tablero.modificarTablero(fila, col);
            }



    }
}
