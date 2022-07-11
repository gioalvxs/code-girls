package bootcamp.dio;

public class Mensagem {
    public Mensagem() {
    }

    public static void obterMensagem(int horas) {
        switch (horas) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                mensagensBomNoite();
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagensBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagensBoaTarde();
                break;
            default:
                System.out.println("HORA INVÁLIDA!");
        }

    }

    private static void mensagensBomDia() {
        System.out.println("BOM DIA!!");
    }

    private static void mensagensBoaTarde() {
        System.out.println("BOA TARDE!!");
    }

    private static void mensagensBomNoite() {
        System.out.println("BOA NOITE!!");
    }
}
