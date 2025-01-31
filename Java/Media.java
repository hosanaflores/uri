package Java;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double soma = (a * 3.5) + (b * 7.5);
        double MEDIA = soma / 11.0;

        System.out.printf("MEDIA = %.5f\n",MEDIA);

        scanner.close();
    }
}