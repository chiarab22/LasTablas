package lastablas;

import java.util.Scanner;

public class Ejercicio8 extends Tablero{
    Tablero juegoBarco = generarTablero();



    public void guerraBarcos(Scanner teclado){

        juegoBarco = generarTablero();

        do{
            juegoBarco = juegoBarco.movimiento(teclado);
            imprimirTablero(juegoBarco);
            System.out.println(juegoBarco.getColGanadora() + " " + getFilaGanadora());
        }while(!juegoBarco.heGanado());
        System.out.println("Felicidades, ¡has ganado!");


    }
}
