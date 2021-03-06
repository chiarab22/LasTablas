package lastablas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int option = 0;
        Ejercicio1 ejercicio1 = new Ejercicio1();
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Ejercicio3 ejercicio3 = new Ejercicio3();
        Ejercicio4 ejercicio4 = new Ejercicio4();
        Ejercicio5 ejercicio5 = new Ejercicio5();
        Ejercicio6 ejercicio6 = new Ejercicio6();
        Ejercicio7 ejercicio7 = new Ejercicio7();
        Ejercicio8 ejercicio8 = new Ejercicio8();
        Ejercicio9 ejercicio9 = new Ejercicio9();
        Ejercicio10 ejercicio10 = new Ejercicio10();


        do {
            try {
                System.out.println("\n***************************");
                System.out.println("Elija una de las opciones: ");
                menu();
                option = teclado.nextInt();
                switch (option) {
                    case 1:
                        ejercicio1.cuentaAtras();
                        break;
                    case 2:
                        ejercicio2.numOcurrencias(teclado);
                        break;
                    case 3:
                        ejercicio3.notaMedia4(teclado);
                        break;
                    case 4:
                        ejercicio4.maquinaVotar(teclado);
                        break;
                    case 5:
                        ejercicio5.imprimirPalindromo();
                        break;
                    case 6:
                        ejercicio6.queHace(teclado);
                        break;
                    case 7:
                        ejercicio7.imprimirTabla();
                        break;
                    case 8:
                        ejercicio8.guerraBarcos(teclado);
                        break;
                    case 9:
                        ejercicio9.tresEnRaya(teclado);
                        break;
                    case 10:
                        ejercicio10.informacion(teclado);
                        break;
                    default:
                        System.out.println("La opci??n elegida no existe. ");


                }
            } catch (InputMismatchException e) {
                System.out.println("");
                teclado.nextLine();
            }
        } while (option != 11);
        System.out.println("??Muchas gracias!");
    }




    private static void menu() {

        System.out.println("1. Despegue inmediato");
        System.out.println("2. N??mero de ocurrencias");
        System.out.println("3. Nota media (versi??n 4)");
        System.out.println("4. M??quina de votar");
        System.out.println("5. Pal??ndromo");
        System.out.println("6. ??Qu?? hace?");
        System.out.println("7. Matriz");
        System.out.println("8. Micro guerra de barcos");
        System.out.println("9. Tres en raya");
        System.out.println("10.Registro de Empleados");
        System.out.println("11. Salir");

    }

}

