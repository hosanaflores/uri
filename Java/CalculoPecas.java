package Java;

import java.util.Scanner;

public class CalculoPecas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo1 = scanner.nextInt();
        int quantidade1 = scanner.nextInt();
        double valor1 = scanner.nextDouble();

        int codigo2 = scanner.nextInt();
        int quantidade2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();

        double custo1 = quantidade1 * valor1;
        double custo2 = quantidade2 * valor2;
        double custoFinal = custo1 + custo2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", custoFinal);

        scanner.close();
    }
    
}
