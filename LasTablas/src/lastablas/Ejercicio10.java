package lastablas;

import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;

public class Ejercicio10 extends Empleado{

    protected HashSet<Empleado> empleados = new HashSet<>();




    public void informacion(Scanner teclado) {
        int opcion;
        do {
            System.out.println("¿Qué quieres hacer?");
            menu();
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    añadirEmpleado(teclado);
                    break;
                case 2:
                    buscarEmpleado(teclado);

                default:
                    break;
            }


        } while (opcion != 3);
    }



    public void añadirEmpleado(Scanner teclado) {
        teclado.nextLine();
        System.out.println("Dime el nombre del empleado: ");
        String nombre = teclado.nextLine();
        System.out.println("Dime el número de empleado del empleado: ");
        int nEmpleado = teclado.nextInt();
        System.out.println("Dime el número de seguridad social del empleado: ");
        int nSeguridadSocial = teclado.nextInt();

        Empleado empleado = new Empleado(nombre, nEmpleado, nSeguridadSocial);
        empleados.add(empleado);
    }

    public void buscarEmpleado(Scanner teclado) {
        System.out.println("¿Con qué parametro quieres buscar al empleado? [1: nombre ; 2: Número de empleado;"
                + " 3: Número de seguridad social]");
        int eleccion = teclado.nextInt();
        teclado.nextLine();
        switch (eleccion) {
            case 1:
                System.out.println("Dime el nombre del empleado:");
                String nombre = teclado.nextLine();
                Optional<Empleado> empleadoNombre = empleados.stream().filter(e -> e.getNombre().equals(nombre)).findFirst();
                if (empleadoNombre.isPresent()) {
                    Empleado empMostrar = empleadoNombre.get();
                    imprimirEmpleado(empMostrar);
                }else{
                    System.out.println("No existe ningún empleado con el nombre indicado. ");
                }
                break;
            case 2:

                System.out.println("Dime el número del empleado:");
                int nEmpleado = teclado.nextInt();
                Optional<Empleado> empleadoNE = empleados.stream().filter(e -> e.getnEmpleado()==(nEmpleado)).findFirst();
                if (empleadoNE.isPresent()) {
                    Empleado empMostrar = empleadoNE.get();
                    imprimirEmpleado(empMostrar);
                }else{
                    System.out.println("No existe ningún empleado con el número de empleado indicado. ");
                }
                break;
            case 3:

                System.out.println("Dime el número de la seguridad social del empleado:");
                int nSegSocial = teclado.nextInt();
                Optional<Empleado> empleadoNSS = empleados.stream().filter(e -> e.getnSeguridadSocial()==(nSegSocial)).findFirst();
                if (empleadoNSS.isPresent()) {
                    Empleado empMostrar = empleadoNSS.get();
                    imprimirEmpleado(empMostrar);
                }else{
                    System.out.println("No existe ningún empleado con el número de seguridad social indicado. ");
                }
                break;
            default:
                break;
        }
    }

    private void imprimirEmpleado(Empleado empleado) {
        System.out.printf("Nombre: %s - Número: %d - SS: %d%n", empleado.getNombre(),  empleado.getnEmpleado(), empleado.getnSeguridadSocial());
    }

    private static void menu() {
        System.out.println("1. Añadir empleado");
        System.out.println("2. Buscar empleado");
        System.out.println("3. Salir");
    }
}