package lastablas;

import java.util.Scanner;


public class Ejercicio5 {
    Scanner teclado = new Scanner(System.in);
public boolean esPalindromo(Scanner teclado){
       System.out.println("Escriba una palabra y después #");
        String palindromo = teclado.nextLine().toLowerCase();
        for (int inicio = 0, fin= palindromo.length()-2; inicio <= fin; inicio++, fin--) {
           if(palindromo.charAt(inicio) != palindromo.charAt(fin)){
               return false;
        }
        
      
       
        }
        return true;
}

public void imprimirPalindromo(){
    if(esPalindromo(teclado)){
        System.out.println("La palabra es palindroma");
    }else{
        System.out.println("La palabra no es palindroma");
    }
}
}
