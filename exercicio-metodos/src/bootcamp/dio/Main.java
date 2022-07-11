package bootcamp.dio;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.print("CALCULADORA:");
        Calculadora.soma(4.0, 6.0);
        Calculadora.subtracao(4.0, 6.0);
        Calculadora.multiplicacao(4.0, 6.0);
        Calculadora.divisao(4.0, 6.0);
        System.out.println("\n..............................................");
        System.out.println("\nMENSAGEM:");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(18);
        System.out.println("\n..............................................");
        System.out.println("\nEMPRÉSTIMO");
        Emprestimo.calcula(1000.0, Emprestimo.getDuasParcelas());
        Emprestimo.calcula(1000.0, Emprestimo.getTresParcelas());
        Emprestimo.calcula(1000.0, 5);
    }
}

