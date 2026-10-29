import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Digite o valor A: ");
        a = sc.nextInt();
        System.out.print("Digite o valor B: ");
        b = sc.nextInt();
        System.out.print("Digite o valor C: ");
        c = sc.nextInt();

        System.out.println(a + b);
        if((a + b) < c) {
            System.out.println(a + " + " + b + " é menor que " + c);
        }


        sc.close();
    }
}
