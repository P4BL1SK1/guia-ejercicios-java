package Ejercicio2;

public class Administrativo extends Empleado {
    private int hsExtra;
    private int hsMes;

    public Administrativo(String dni, String nombre, String apellido, String email, float sueldoBase, int hsMes, int hsExtra) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.hsExtra = hsExtra;
        this.hsMes = hsMes;
    }
    @Override
    public float getSueldo() {
        return (float) (getSueldoBase() * ((hsExtra*1.5) + hsMes)/hsMes);
    }

    @Override
    public String toString() {
        return super.toString() +
                "{" +
                "hsExtra =" + hsExtra +
                ", hsMes =" + hsMes +
                '}';
    }
}
