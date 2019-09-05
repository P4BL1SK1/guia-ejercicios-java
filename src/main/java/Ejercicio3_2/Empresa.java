package Ejercicio3_2;
import java.util.List;

public class Empresa {
    String nombre;
    List<Empleado> empleados;

    public Empresa() {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void list() {
        System.out.println(this.nombre);
    }
}
