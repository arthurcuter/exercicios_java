import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int temp = v1;
        v1 = v2;
        v2 = temp;
        System.out.println(v1 + " " + v2);
        sc.close();
    }
}
