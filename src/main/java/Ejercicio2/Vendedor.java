package Ejercicio2;

public class Vendedor extends Empleado {
    private float porcentaje;
    private float totalVenta;

    public Vendedor(String dni, String nombre, String apellido, String email, float sueldoBase,float porcentaje, float totalVenta) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.porcentaje = porcentaje;
        this.totalVenta = totalVenta;
    }
    @Override
    public float getSueldo() {
        return getSueldoBase() + (porcentaje * totalVenta/100);
    }

    @Override
    public String toString() {
        return super.toString() +
                "{" +
                "porcentaje =" + porcentaje +
                ", totalVenta =" + totalVenta +
                '}';
    }
}
