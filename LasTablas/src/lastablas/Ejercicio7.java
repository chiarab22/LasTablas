package lastablas;

import java.util.Random;

public class Ejercicio7 {
    char[][] tabla = new char[20][30];
    Random r = new Random();
    char caracter1 = (char)(r.nextInt(26) + 'a');


public void imprimirTabla(){
    for (int i = 0; i < tabla.length; i++) {
        for (int j = 0; j < tabla.length; j++) {
            tabla[i][j] = caracter1;

            System.out.print(tabla[i][j]);
        }
        System.out.println();
    }
    
}   
}
