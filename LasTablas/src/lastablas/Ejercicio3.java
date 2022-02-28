package lastablas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    Scanner teclado = new Scanner(System.in);
    protected ArrayList<Integer> notas = new ArrayList<>();
    protected int terminar = 0;

    public void notaMedia4(Scanner teclado){
        do{
            System.out.println("¿Nota?");
            int nota = teclado.nextInt();
            if(nota >= 0){
                notas.add(nota);
            }else{
                int suma  = 0;
                for (int i = 0; i < notas.size(); i++) {
                     suma  +=  notas.get(i);
                }

                System.out.println(suma);

                float media = suma/notas.size();
                System.out.println("La media de las notas "+ notas + " es: " + media);
                notas.clear();
                break;
            }

        }while(terminar != -1);
    }
}
