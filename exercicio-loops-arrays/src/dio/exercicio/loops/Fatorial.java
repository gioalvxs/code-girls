package dio.exercicio.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("INFORME O NÚMERO QUE DESEJA CALCULAR O FATORIAL: ");
        int fatorial = input.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + "!= ");

        for(int i = fatorial; i >= 1; i--){
            multiplicacao *= i;
        }
        System.out.println(multiplicacao);
    }
}
