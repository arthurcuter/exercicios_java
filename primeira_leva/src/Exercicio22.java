import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b == 0) {
            System.out.println("nao pode dividir por 0");
        } else {

            System.out.println(a / b);
            System.out.println(a % b);
        }
        sc.close();
    }
}
