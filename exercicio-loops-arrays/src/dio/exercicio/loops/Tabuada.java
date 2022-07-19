package dio.exercicio.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("INFORME O NÚMERO QUE DESEJA VER A TABUADA: ");
        int tabuada = input.nextInt();

        System.out.println("TABUADA DE " + tabuada + ":");

        for(int i = 1; i <= 10; i++){

            System.out.println( tabuada + "x" + i + "= " + (tabuada*i));
        }
    }
}
