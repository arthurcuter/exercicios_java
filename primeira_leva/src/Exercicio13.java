import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        int idade = sc.nextInt();
        double peso = sc.nextDouble();
        System.out.print("Seu nome eh " + nome + " e voce eh ");
        if(idade > 17) System.out.println("maior de idade!");
        else System.out.println("menor de idade!");

        sc.close();

    }
}
