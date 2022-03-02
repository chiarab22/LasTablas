package lastablas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    protected ArrayList<Integer> notas = new ArrayList<>();
    int nota = 0;

    public void notaMedia4(Scanner teclado) {
        do {
            System.out.println("¿Nota?");
            nota = teclado.nextInt();
            if (nota >= 0) {
                notas.add(nota);
            } else {
                int suma = 0;
                for (int i = 0; i < notas.size(); i++) {
                    suma += notas.get(i);
                }

                double media = suma / notas.size();
                System.out.println("La media de las notas " + notas + " es: " + media);
                notas.clear();
            }

        } while (nota != -1);
    }
}
