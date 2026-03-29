import java.util.Scanner;

public class MaquinaVendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor da compra: R$ ");
        int valorCompra = scanner.nextInt();

        System.out.print("Digite o valor pago: R$ ");
        int valorPago = scanner.nextInt();

        // Verificação
        if (valorPago < valorCompra) {
            System.out.println("Valor insuficiente para realizar a compra.");
        } else {
            int troco = valorPago - valorCompra;
            System.out.println("Troco: R$ " + troco);

            // Cálculo das notas (menor quantidade possível)
            int n50 = troco / 50;
            troco %= 50;

            int n20 = troco / 20;
            troco %= 20;

            int n10 = troco / 10;
            troco %= 10;

            int n5 = troco / 5;
            troco %= 5;

            int n2 = troco / 2;
            troco %= 2;

            int n1 = troco;

            // Saída
            System.out.println("Notas para o troco:");
            if (n50 > 0) System.out.println(n50 + " nota(s) de R$50");
            if (n20 > 0) System.out.println(n20 + " nota(s) de R$20");
            if (n10 > 0) System.out.println(n10 + " nota(s) de R$10");
            if (n5 > 0) System.out.println(n5 + " nota(s) de R$5");
            if (n2 > 0) System.out.println(n2 + " nota(s) de R$2");
            if (n1 > 0) System.out.println(n1 + " nota(s) de R$1");
        }

        scanner.close();
    }
}