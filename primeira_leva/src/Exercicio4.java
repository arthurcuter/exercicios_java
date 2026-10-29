import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int a = sc.nextInt();
        System.out.println("Sucessor = " + (a+1) + " !! Antecessor = " + (a-1));
    }
}
