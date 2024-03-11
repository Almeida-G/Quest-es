import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            int numero = scanner.nextInt();

            if (verificaFibonacci(numero)) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(numero + " não pertence à sequência de Fibonacci.");
            }

            scanner.close();
        }

        public static boolean verificaFibonacci(int numero) {
            if (numero < 0) {
                return false; // A sequência de Fibonacci inicia com 0, então números negativos não pertencem.
            }

            int a = 0;
            int b = 1;

            while (b < numero) {
                int temp = a + b;
                a = b;
                b = temp;
            }

            return b == numero;
        }
    }


