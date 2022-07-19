package dio.exercicio.loops;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota;

        System.out.print("INFORME SUA NOTA: ");
        nota = input.nextInt();

        while (nota < 0 || nota > 10){
              System.out.print("VALOR INVÁLIDO!!!\nINFORME SUA NOTA: " );
              nota = input.nextInt();
       }
    }
}
