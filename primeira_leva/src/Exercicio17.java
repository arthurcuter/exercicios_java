import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tempF = sc.nextDouble();
        double tempC = 5 * (tempF -32) / 9;

        System.out.println("Celsius: " + tempC + " - Faren: " + tempF);
        sc.close();
    }
}
