import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String palavra = scanner.nextLine();

        String inversao = inverterString(palavra);

        System.out.println("String original: " + palavra);
        System.out.println("String invertida: " + inversao);
    }

    public static String inverterString(String a) {
        int tamanho = a.length();
        StringBuilder stringInvertida = new StringBuilder();

        // Percorre a string de trás para frente e concatena os caracteres
        for (int i = tamanho - 1; i >= 0; i--) {
            stringInvertida.append(a.charAt(i));
        }

        return stringInvertida.toString();
    }
}
