package Java;

import java.util.Scanner;

public class SomaSimples {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
       
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x;

        x = a + b;

        System.out.println("X = "+x);

        scanner.close();
    }
}