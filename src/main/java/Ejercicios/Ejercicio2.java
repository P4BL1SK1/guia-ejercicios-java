package Ejercicios;

import java.util.Scanner;
public class Ejercicio2 {
    public static int[] returnMayores(int num, int[] array) {
        int[] temp = new int[array.length];
        int j = 0;

        for (int i = 0; i <= array.length -1; i++) {
            if(array[i] > num) {
              temp[j] = array[i];
              j++;
            }
        }
        int[] aux = new int[j];
        for(int x = 0; x <= aux.length -1; x++) {
            aux[x] = temp[x];
        }
        return aux;
    }

    public static void main(String[] args) {
        Scanner enterDat = new Scanner (System.in);
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Ingrese un numero: ");
        int num = enterDat.nextInt();
        Ejercicio1.show(returnMayores(num, array));
    }
}
