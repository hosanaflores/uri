package Java;
import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        double pi = 3.14159;
        double formula = 4.0 / 3;
        double resultado = r * formula * pi * r * r;

        System.out.printf("VOLUME = %.3f\n", resultado);

    }
    
}
