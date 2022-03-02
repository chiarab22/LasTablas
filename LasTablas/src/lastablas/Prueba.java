package lastablas;

import java.util.Scanner;


public class Prueba {
    Scanner teclado = new Scanner(System.in);
    String palindromo = "";
public boolean esPalindromo(Scanner teclado){
       System.out.println("Escriba una palabra y después #");
       teclado.nextLine();
        palindromo = teclado.nextLine().toLowerCase();
        
        char[] valores =  palindromo.toCharArray();

        for (int inicio = 0; inicio < valores.length; inicio++) {
            for ( int fin = valores.length -2; fin >= 0; fin--) {
                if (valores[inicio] == valores[fin]) {
                    return true; 
                }
                   
                }
                
            }
        return false;   
}

public void imprimirPalindromo(){
    if(esPalindromo(teclado)){
        System.out.println("La palabra introducida es palíndroma.");
    }else{
        System.out.println("La palabra introducida es palíndroma.");
    }
}
}
