package lastablas;

import java.util.Scanner;


public class Ejercicio5 {
    Scanner teclado = new Scanner(System.in);
    String palindromo = "";

    public boolean esPalindromo(Scanner teclado) {
        System.out.println("Escriba una palabra y después #");
        palindromo = teclado.nextLine().toLowerCase();

        char[] valores = palindromo.toCharArray();


        for (int inicio = 0, fin = palindromo.length() - 2; inicio <= fin; inicio++, fin--) {
            if (valores[inicio] != valores[fin]) {
                return false;
            }

        }
        return true;
    }


    public void imprimirPalindromo() {
        if (esPalindromo(teclado)) {
            System.out.println("La palabra introducida es palíndroma.");
        } else {
            System.out.println("La palabra introducida no es palíndroma.");
        }
    }
}
