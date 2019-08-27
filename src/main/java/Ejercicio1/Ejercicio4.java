package Ejercicio1;
import java.util.Scanner;

public class Ejercicio4 {
    public static void showStringVec (String[] array, String[] array2) {
        System.out.print("[");
        for(int i = 0; i <= array.length -1; i++) {
            System.out.print(array[i] + " " + array2[i] + ", ");
        }
        System.out.println("]");
    }




    public static String[] searchName (String[] array, String[] array2) {
        Scanner enterDat = new Scanner(System.in);
        System.out.println("Ingrese inicial para buscar nombres: ");
        String init = enterDat.nextLine();
        String[] temp = new String[array.length];
        String[] temp2 = new String[array.length];
        int j = 0;
        for( int i = 0; i <= array.length -1; i++) {
            if(array[i].charAt(0) == init.charAt(0) ) {
                temp[j] = array[i];
                temp2[j] = array2[i];
                j++;
            }
        }
        String[] aux = new String[j];
        String[] aux2 = new String[j];
        for(int x = 0; x <= aux.length -1; x++) {
            aux[x] = temp[x];
            aux2[x] = temp2[x];
        }
        for(int i = 0; i <= aux.length -1; i++) {
            System.out.print(aux[i] +" "+ aux2[i] + ", ");
        }
        System.out.println(" ");
        return aux;
    }

    public static void makeTheQuestion (String[] array, String[] array2) {
        Scanner enterDat = new Scanner(System.in);
        System.out.println("Desea buscar un alumno ? (s/n): ");
        String answer = enterDat.next();
        if(answer.charAt(0) == "s".charAt(0)) {
            searchName(array, array2);
            makeTheQuestion(array, array2);
        }
        else if (answer.charAt(0) == "n".charAt(0)) {
            System.out.println("Fin.");
        }
        else if(answer == "fin") {
            System.out.println("Fin.");
        }
        else {
            System.out.println("respuesta equivocada");
            makeTheQuestion(array, array2);
        }

    }

    public static void main (String[] args) {
        String[] nombres = new String[3];
        String[] apellidos = new String[3];
        Scanner enterDat = new Scanner(System.in);

        for (int i = 0; i <= nombres.length -1; i++) {
            System.out.println("Ingresar nombre del alumno " + (i+1) + ": ");
            String name = enterDat.next();
            nombres [i] = name;
            System.out.println("Y su apellido: ");
            String surname = enterDat.next();
            apellidos[i] = surname;
        }
        makeTheQuestion(nombres, apellidos);
    }
}
