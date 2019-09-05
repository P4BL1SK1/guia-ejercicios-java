package Ejercicio3_2;
import java.util.Scanner;
import  java.util.List;


public class FrontEnd {
    static List<Empresa> empresas;

    public FrontEnd(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    public static void menu() {
        Scanner enterDat = new Scanner(System.in);
        System.out.println("Desea ingresar una empresa nueva (y/n): ");
        String answer = enterDat.next();
        if (answer.charAt(0) == "y".charAt(0)) {
            empresas.add(new Empresa());
            System.out.println("Ingrese el nombre de la empresa nueva: ");
            String empName = enterDat.next();
            empresas.get(empresas.size() - 1).setNombre(empName);
            menu();
        }
        else if(answer.charAt(0) == "n".charAt(0)) {
            System.out.println("Fin.");
        }
        else{
            System.out.println("Ingrese una respueta correcta.");
            menu();
        }
    }


    public static void main(String[] args) {
        menu();
    }




}
