package lastablas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    protected ArrayList<Integer> notas = new ArrayList<>();
    private int nota = 0;

    public void notaMedia4(Scanner teclado) {
        do {
            System.out.println("¿Nota?");
            nota = teclado.nextInt();
            if (nota >= 0) {
                notas.add(nota);
            } else {
                double suma = 0;
                for (Integer integer : notas) {
                    suma += integer;
                }

                double media = suma / notas.size();
                System.out.println("La media de las notas " + notas + " es: " + Math.round(media* 100.0) / 100.0 );
                notas.clear();
            }

        } while (nota != -1);
    }
}
