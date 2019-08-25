package Ejercicios;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner enterDat = new Scanner(System.in);
        System.out.print("Si o No, nada más. ");
        String answer = enterDat.nextLine();
        if(answer.charAt(0) == "s".charAt(0)) {
            System.out.println("Si");
        }
        else if (answer.charAt(0) == "n".charAt(0)) {
            System.out.println("No");
        }
        else {
            System.out.println("RESPUESTA INCORRECTA");
        }

    }


}
