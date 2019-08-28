package Ejercicio2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Ejercicio1 {
    public static void main(String[]args) {

    Empleado vendedor1 = new Vendedor("243324", "Juan", "Traversa", "jtraversa@gmail.com", 500.00f, 10, 15 );
    Empleado vendedor2 = new Vendedor("427272", "Pedro", "Canestrari", "peter234@gmail.com", 500.00f, 15, 20);
    Empleado administrativo1 = new Administrativo("2453437", "Teresa", "Fidalgo", null, 750.00f, 160, 10);
    Empleado administrativo2 = new Administrativo("5778763", "Ramon", "Salazar", "ramoncito428@outlook.com", 750.00f, 100, 8);
    List <Empleado> empleados = new ArrayList<>();

    empleados.add(vendedor1);
    empleados.add(vendedor2);
    empleados.add(administrativo1);
    empleados.add(administrativo2);
    empleados.stream().forEach(empleado -> System.out.println(empleado.getSueldo()));
    }
}
