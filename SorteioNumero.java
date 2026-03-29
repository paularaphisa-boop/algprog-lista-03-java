import java.util.Random;
import java.util.Scanner;

public class SorteioNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Entrada de dados
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Determinar menor e maior
        int menor, maior;

        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

        // Sorteio (inclui o maior número também)
        int sorteado = random.nextInt((maior - menor) + 1) + menor;

        // Saída
        System.out.println("Número sorteado: " + sorteado);

        // Verificar se é par ou ímpar
        if (sorteado % 2 == 0) {
            System.out.println("O número é PAR");
        } else {
            System.out.println("O número é ÍMPAR");
        }

        scanner.close();
    }
}