package Ejercicio1;
import java.util.Random;

public class Ejercicio7 {
    public static void crearMatriz100x100R(){
        int [][] matriz = new int[100][100];
        Random r = new Random();
        int aleatorio = r.nextInt(100);
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = aleatorio + i + j;
            }
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
        crearMatriz100x100R();
    }
}
