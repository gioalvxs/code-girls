package bootcamp.dio;

public class Main {


    public static void main(String[] args) {

        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemanas();
        switchNumero();
        switchFerias();
    }
    private static void ifSemFlecha (){
        int mes = 5;
        if(mes == 1){
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes ==3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7){
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês inválido!!");
        }
        System.out.println("\n");
    }

    private static void ifFerias (){
           String mes = "Julho";
           if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
               System.out.println("Estamos nas Férias!!");
           }
        System.out.println("\n");
    }

    private static void ifMenor (){

        double salarioMensal = 11893.58;
        double mediaSalario = 10500;

        int qtdDependentes = 4;
        int mediaDependentes = 2;

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDepentes = qtdDependentes >= mediaDependentes;

        boolean recebeAuxilio = (salarioBaixo) && (muitosDepentes);

        if (recebeAuxilio) {
            System.out.println("Funcionário tem direito ao auxílio!");
        } else {
            System.out.println("Funcionário não tem direito ao auxílio!");
        }

        System.out.println("\n");

    }

    private static void switchSemanas() {
        String dia = "Domingo";
        switch(dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case"Sexta":
                System.out.println(6);
            case "Sábado":
                System.out.println(7);
            case "Domingo":
           System.out.println(1);
            break;
            default:
                System.out.println("Dia inválido!");
                break;
        }
        System.out.println("\n");
    }
    private static void switchNumero() {

        int numero = 4;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Correto!");
                break;
            case 4:
                System.out.println("Errado!");
            case 5:
                System.out.println("Talvez!");
            default:
                System.out.println("Indefinido.");
                break;
        }
        System.out.println("\n");
    }

    private static void switchFerias(){
        String mes = "Julho";

        switch (mes){
            case "Julho":
            case "Dezembro":
            case "Janeiro":
                System.out.println("Você está de férias!");
                break;
            default:
                System.out.println("Mês indefinido!!");
                break;
        }
    }
}
