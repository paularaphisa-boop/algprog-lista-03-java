import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos coeficientes
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        // Caso (a): a = 0, b = 0, c ≠ 0
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        }
        // Caso (b): equação de primeiro grau
        else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            double raiz = -c / b;
            System.out.println("Raiz: " + raiz);
        }
        else {
            // Cálculo do delta
            double delta = (b * b) - (4 * a * c);

            // Caso (c): delta < 0
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            }
            // Caso (d): delta == 0
            else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.println("Raiz: " + raiz);
            }
            // Caso (e): delta > 0
            else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
        }

        scanner.close();
    }
}