import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorHora = sc.nextDouble();
        int numeroAulas = sc.nextInt();
        double percentualDesc = sc.nextDouble();
        double salarioSDesc = valorHora * numeroAulas;
        System.out.println(salarioSDesc - (salarioSDesc * (percentualDesc / 100))) ;
        sc.close();
    }
}
