package Java;
import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String nome = in.nextLine();
        double salario = in.nextDouble();
        double vendas = in.nextDouble();

        double salarioFinal =  salario + ( 0.15 * vendas); 
        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);

        in.close();
    }

}