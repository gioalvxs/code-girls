package dio.exercicio.arrays;

import java.util.Random;

public class Aleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("NÚMEROS ALEATÓRIOS:");
        for (int numero : numerosAleatorios) {

            System.out.print(numero + " ");
        }

        System.out.println("\nSUCESSOR DOS NÚMEROS ALEATÓRIOS:");
        for (int numero : numerosAleatorios) {

            System.out.print((numero + 1) + " ");
        }
    }
}
