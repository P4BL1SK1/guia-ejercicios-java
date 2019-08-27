package Ejercicio1;
import java.util.Scanner;

public class Ejercicio6 {
    public static void crearMatriz3x3(){
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int[3][3];
        System.out.println("Ingrese los datos de la matriz: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print("Ingrese dato posicion ["+ i+ "]" + "[" + j + "]: " );
                matriz[i][j] = leer.nextInt();
            }
            System.out.println("");
        }
        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        crearMatriz3x3();
    }
}
