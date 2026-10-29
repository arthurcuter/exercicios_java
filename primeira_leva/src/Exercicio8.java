import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b && a > c) {
            System.out.println(a + " ");
            if(b > c) {
                System.out.println(b + " " + c);
            } else {
                System.out.println(c + " " + b);
            }
        } else if (c > b && c > a) {
            System.out.println(c + " ");
            if(b > a) {
                System.out.println(b + " " + a);
            } else {
                System.out.println(a + " " + b);
            }
        } else {
            System.out.println(b + " ");
            if(a > c) System.out.println(a + " " + c);
            else System.out.println(c + " " + a);
        }
        sc.close();
    }
}
