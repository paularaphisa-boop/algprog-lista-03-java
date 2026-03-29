import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /, ^): ");
        char operador = scanner.next().charAt(0);

        double resultado;

        // Estrutura de decisão
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;

            case '^':
                resultado = Math.pow(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Erro: símbolo da operação inválido.");
        }

        scanner.close();
    }
}