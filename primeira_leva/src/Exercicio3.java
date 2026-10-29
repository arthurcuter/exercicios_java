import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Digite o valor A: ");
        a = sc.nextInt();
        System.out.print("Digite o valor B: ");
        b = sc.nextInt();

        if(a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println(c);


        sc.close();
    }
}
