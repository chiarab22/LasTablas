package lastablas;

import java.util.Objects;

public class Empleado {
    protected String nombre;
    protected int nEmpleado, nSeguridadSocial;

    public Empleado(String nombre, int nEmpleado, int nSeguridadSocial) {
        this.nombre = nombre;
        this.nEmpleado = nEmpleado;
        this.nSeguridadSocial = nSeguridadSocial;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getnEmpleado() {
        return nEmpleado;
    }

    public int getnSeguridadSocial() {
        return nSeguridadSocial;
    }




    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado empleado)) {
            return false;
        }
        return Objects.equals(nombre, empleado.nombre) &&
                nEmpleado == empleado.nEmpleado && nSeguridadSocial ==
                empleado.nSeguridadSocial;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nEmpleado, nSeguridadSocial);
    }


}