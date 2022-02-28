package lastablas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int option;
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Ejercicio4 ejercicio4 = new Ejercicio4();

        do {
            System.out.println("\n***************************");
            System.out.println("Elija una de las opciones: ");
            menu();
            option = teclado.nextInt();
            switch (option) {
                case 1:
                    break;
                case 2:
                    ejercicio2.numOcurrencias(teclado);
                    break;
                case 3:
                    break;
                case 4:
                    ejercicio4.maquinaVotar(teclado);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;


            }

        } while (option != 11);
        System.out.println("¡Muchas gracias!");
    }

    private static void menu() {

        System.out.println("1. Despegue inmediato");
        System.out.println("2. Número de ocurrencias");
        System.out.println("3. Nota media (versión 4)");
        System.out.println("4. Máquina de votar");
        System.out.println("5. Palíndromo");
        System.out.println("6. ¿Qué hace?");
        System.out.println("7. Matriz");
        System.out.println("8. Micro guerra de barcos");
        System.out.println("9. Tres en raya");
        System.out.println("10.Registro de Empleados");
        System.out.println("11. Salir");

    }

}

