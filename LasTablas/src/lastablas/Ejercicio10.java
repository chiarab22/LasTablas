package lastablas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Ejercicio10 {
    protected String nombre;
    protected int nEmpleado, nSeguridadSocial;
    protected HashSet<Ejercicio10> empleados = new HashSet<>();

    public Ejercicio10(String nombre, int nEmpleado, int nSeguridadSocial) {
        this.nombre = nombre;
        this.nEmpleado = nEmpleado;
        this.nSeguridadSocial = nSeguridadSocial;
    }

    public Ejercicio10() {
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNEmpleado() {
        return this.nEmpleado;
    }

    public void setNEmpleado(int nEmpleado) {
        this.nEmpleado = nEmpleado;
    }

    public int getNSeguridadSocial() {
        return this.nSeguridadSocial;
    }

    public void setNSeguridadSocial(int nSeguridadSocial) {
        this.nSeguridadSocial = nSeguridadSocial;
    }
    
    public void informacion(Scanner teclado){
        int opcion = 0;
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

            
        } while (opcion !=3);
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ejercicio10)) {
            return false;
        }
        Ejercicio10 ejercicio10 = (Ejercicio10) o;
        return Objects.equals(nombre, ejercicio10.nombre) && 
        nEmpleado == ejercicio10.nEmpleado && nSeguridadSocial ==
         ejercicio10.nSeguridadSocial;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nEmpleado, nSeguridadSocial);
    }


 public void añadirEmpleado(Scanner teclado){
        System.out.println("Dime el nombre del empleado: ");
        String nombre = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Dime el número de empleado del empleado: ");
        int nEmpleado = teclado.nextInt();
        System.out.println("Dime el número de seguridad social del empleado: ");
        int nSeguridadSocial = teclado.nextInt();

        Ejercicio10 empleado  = new Ejercicio10(nombre, nEmpleado, nSeguridadSocial);
        empleados.add(empleado);
    }

 public void buscarEmpleado(Scanner teclado){
     System.out.println("¿Con qué parametro quieres buscar al empleado? [1: nombre ; 2: Número de empleado;"
     + " 3: Número de seguridad social]");
     int eleccion = teclado.nextInt();
     teclado.nextLine();
     switch (eleccion) {
         case 1:
         System.out.println("Dime el nombre del empleado:");
         String nombre = teclado.nextLine();
                 if(empleados.contains(nombre)){
                    System.out.println(empleados);
             }
             break;
             case 2 :
             
         System.out.println("Dime el número del empleado:");
         int  nEmpleado = teclado.nextInt();
                 if(empleados.contains(nEmpleado)){
                    System.out.println(getNombre() + getNEmpleado() + getNSeguridadSocial() );
             }
             case 3:
             
         System.out.println("Dime el número de la seguridad social del empleado:");
         int nSegSocial = teclado.nextInt();
                 if(empleados.contains(nSegSocial)){
                    System.out.println(getNombre() + getNEmpleado() + getNSeguridadSocial() );
             }
         default:
             break;
     }
    }

    private static void menu() {
        System.out.println("1. Añadir empleado");
        System.out.println("2. Buscar empleado");
        System.out.println("3. Salir");
    }
}