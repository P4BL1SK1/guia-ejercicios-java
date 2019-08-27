package Ejercicio1;

public class Ejercicio1 {
    public static int[] invertirArray(int[] array){
        int[] aux = new int[array.length];
        int j = 0;
        for(int i = array.length -1; i >= 0 ; i--) {
            aux[j] = array[i];
            j++;
        }
        for(int i = 0; i <= array.length -1; i++) {
            array[i] = aux[i];
        }
        return array;
    }

    public static void show (int[] array) {
        System.out.print("[");
        for(int i = 0; i <= array.length -1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original");
        show(arreglo);

        System.out.println("Invertido");
        show(invertirArray(arreglo));
    }
}
