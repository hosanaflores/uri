package Java;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numeroFuncionario = in.nextInt();
        int horasTrabalhadas = in.nextInt();
        double valorHora = in.nextDouble();
        double salario = valorHora * horasTrabalhadas;

        System.out.println("NUMBER = "+numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);

        in.close();

    }
    
}
