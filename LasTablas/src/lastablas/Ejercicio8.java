package lastablas;

import java.util.Scanner;

public class Ejercicio8 extends TableroBarcos {
    TableroBarcos juegoBarco;


    public void guerraBarcos(Scanner teclado){

        juegoBarco = generarTablero();

        do{
            juegoBarco = movimiento(juegoBarco, teclado);
            imprimirTablero(juegoBarco);

        }while(!juegoBarco.heGanado());
        System.out.println("Felicidades, ¡has ganado!");


    }
    public static TableroBarcos movimiento(TableroBarcos tablero, Scanner teclado) {
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
        return tablero;

    }
}
