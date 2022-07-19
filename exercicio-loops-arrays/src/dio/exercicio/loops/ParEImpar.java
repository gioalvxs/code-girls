package dio.exercicio.loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdNum;
        int numeros;
        int qtdPares = 0;
        int qtdImpar = 0;
        int count = 0;

        System.out.print("INFORME A QUANTIDADE DE NÚMEROS: ");
        qtdNum = input.nextInt();

        do {
            System.out.print("INFORME UM NÚMERO: ");
            numeros = input.nextInt();

            if(numeros % 2 == 0){
                qtdPares++;
            } else qtdImpar ++;

            count++;

        } while (count < qtdNum);

        System.out.print("QUANTIDADE DE NÚMEROS PARES: " + qtdPares);
        System.out.println("\nQUANTIDADE DE NÚMEROS ÍMPARES: " + qtdImpar);

    }
}
