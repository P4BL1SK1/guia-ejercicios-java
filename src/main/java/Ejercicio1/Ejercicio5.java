package Ejercicio1;

public class Ejercicio5 {
    public static int contarLetra(char letra, String phrase) {
        int contador = 0;
        char[] caracteres = phrase.toCharArray();
        for(int i = 0; i <= caracteres.length -1; i++) {
            if(caracteres[i] == letra) {
                contador++;
            }
        }
        return contador;
    }

    public static void visualizarRecuento(String phrase) {
        for(int i = 0; i <= phrase.length()-1; i++){
            System.out.println("Letra: " + phrase.charAt(i)+ " iteraciones: " + contarLetra(phrase.charAt(i), phrase));
        }
    }


    public static void main(String[] args) {
        String test = "esternocleidomastoideo";
        visualizarRecuento(test);
    }
}

