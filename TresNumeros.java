import java.util.Scanner;

public class TresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos números
        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = scanner.nextInt();

        // Encontrar o maior número
        int maior = n1;
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        // Encontrar o menor número
        int menor = n1;
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        // Calcular a média
        double media = (n1 + n2 + n3) / 3;

        // Exibir resultados
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + media);

        scanner.close();
    }
}