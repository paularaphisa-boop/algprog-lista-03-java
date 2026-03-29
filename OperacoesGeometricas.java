import java.util.Scanner;

public class OperacoesGeometricas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.141592;

        // Entrada de dados
        System.out.print("Digite o código da operação (1, 2 ou 3): ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        // Estrutura de decisão
        switch (operacao) {
            case 1:
                // Perímetro do círculo
                double perimetro = 2 * PI * raio;
                System.out.println("Perímetro do círculo: " + perimetro);
                break;

            case 2:
                // Área do círculo
                double area = PI * Math.pow(raio, 2);
                System.out.println("Área do círculo: " + area);
                break;

            case 3:
                // Volume da esfera
                double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);
                System.out.println("Volume da esfera: " + volume);
                break;

            default:
                // Código inválido
                System.out.println("Erro: código da operação inválido.");
        }

        scanner.close();
    }
}