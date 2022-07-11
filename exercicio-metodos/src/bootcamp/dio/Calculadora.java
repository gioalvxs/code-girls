package bootcamp.dio;

public class Calculadora {
    public Calculadora() {
    }

    public static void soma(double a, double b) {
        double somas = a + b;
        System.out.println("VALOR DA SOMA: " + somas);
    }

    public static void subtracao(double a, double b) {
        double subt = a - b;
        System.out.println("VALOR DA SUBTRAÇÃO: " + subt);
    }

    public static void multiplicacao(double a, double b) {
        double mult = a * b;
        System.out.println("VALOR DA MULTIPLICAÇÃO: " + mult);
    }

    public static void divisao(double a, double b) {
        double div = a / b;
        System.out.printf("VALOR DA DIVISÃO: %.2f", div);
    }
}