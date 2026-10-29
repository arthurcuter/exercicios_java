import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        sc.nextLine();
        String nome = sc.nextLine();

        if(media >= 7) {
            System.out.println(nome + " aprovado!");
        } else {
            System.out.println(nome + " reprovado!");
        }
    }
}
