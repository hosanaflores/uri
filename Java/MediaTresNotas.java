import java.util.Scanner;

public class MediaTresNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double soma = (a * 2.0) + (b * 3.0) + (c * 5.0);
        double MEDIA = soma / 10;

        System.out.printf("MEDIA = %.1f\n",MEDIA);

        scanner.close();

    }
    
}
