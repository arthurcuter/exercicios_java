import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        System.out.print("O valor é ");
        if(valor % 2 == 0) {
            System.out.print("par e ");
        } else {
            System.out.print("impar e " );
        }
        if(valor < 0) {
            System.out.println("negativo!");
        } else {
            System.out.println("positivo");
        }

        sc.close();
    }
}
