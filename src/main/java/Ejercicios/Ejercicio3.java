package Ejercicios;

import java.util.Scanner;
public class Ejercicio3 {

    public static void printAsteriscos (int cant) {
        for(int i = 0; i<= cant-1; i++) {
            System.out.print("*");
        }
    }

    public static float[] ingresarTemps (float[] arrayDeTemperaturas) {
        Scanner enterDat = new Scanner(System.in);
        for(int i = 0; i <= arrayDeTemperaturas.length -1; i++) {
            System.out.println("Ingresar la temperatura de la hora " + i +": ");
            float temp = enterDat.nextFloat();
            arrayDeTemperaturas[i] = temp;
        }
        return arrayDeTemperaturas;
    }

    public static void returnTemps (float[] array) {
        float min = array[0];
        float max = array[0];
        for( int i = 0; i <= array.length -1; i ++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i <= array.length -1; i ++) {
            System.out.print(i + "  ");
            printAsteriscos((int)array[i]);
            if(array[i] == min) {
                System.out.println("  " + array[i] + "  -------> min");
            }
            else if (array[i] == max) {
                System.out.println("  " + array[i] + "  -------> max");
            }
            else {
                System.out.println("  " + array[i]);
            }
        }
    }

    public static void main(String[] args) {
        float[] array= new float[3];
        returnTemps(ingresarTemps(array));
    }
}
