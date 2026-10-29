import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double salarioMinimo = 1293.20;
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        System.out.println(salario / salarioMinimo);
    }
}
