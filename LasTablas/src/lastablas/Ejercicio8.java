package lastablas;

import java.util.Scanner;

public class Ejercicio8 extends Tablero{
    Tablero juegoBarco = generarTablero();



    public void guerraBarcos(Scanner teclado){

        juegoBarco = generarTablero();

        do{
            juegoBarco = movimiento(juegoBarco, teclado);
            imprimirTablero(juegoBarco);
  
        }while(!juegoBarco.heGanado());
        System.out.println("Felicidades, ¡has ganado!");


    }
    public static Tablero movimiento(Tablero tablero, Scanner teclado) {
        System.out.println("¿Qué columna? ");
        int col = teclado.nextInt() - 1;
        System.out.println("¿Qué fila? ");
        int fila = teclado.nextInt() - 1;

        if (col == tablero.colGanadora && fila == tablero.filaGanadora) {
            tablero.setWin(true);
        } else {
            tablero.modificarTablero(fila, col);
        }
        return tablero;

    }
}
