package Java;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int PROD = a * b;

        System.out.println("PROD = "+PROD);

        scanner.close();
    }
    
}
