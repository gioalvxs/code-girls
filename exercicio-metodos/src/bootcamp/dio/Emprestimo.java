package bootcamp.dio;

public class Emprestimo {
    public Emprestimo() {
    }

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.4;
    }

    public static void calcula(double valor, int parcelas) {
        double valorFinal;
        if (parcelas == 2) {
            valorFinal = valor + valor * getTaxaDuasParcelas();
            System.out.println("VALOR FINAL EMPRÉSTIMO PARA DUAS PARCELAS: R$ " + valorFinal);
        } else if (parcelas == 3) {
            valorFinal = valor + valor * getTaxaTresParcelas();
            System.out.println("VALOR FINAL EMPRÉSTIMO PARA TRÊS PARCELAS: R$ " + valorFinal);
        } else {
            System.out.println("QUANTIDADE DE PARCELAS NÃO ACEITAS");
        }

    }
}