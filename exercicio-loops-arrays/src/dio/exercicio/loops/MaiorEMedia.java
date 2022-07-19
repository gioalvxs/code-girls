package dio.exercicio.loops;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int count = 0;
        int maiorNum = 0;
        double media = 0;

        do {

            System.out.print("INFORME UM NÚMERO: ");
            numero = input.nextInt();

            media += numero / 5;

            if(numero > maiorNum){
                maiorNum = numero;
            }
            count += 1;

        } while(count < 5);

        System.out.println("\nMAIOR NÚMERO: " + maiorNum);
        System.out.println("\nMÉDIA DOS NÚMEROS: " + media);
    }
}
