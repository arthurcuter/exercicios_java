import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();

        if(valor1 <= 0 || valor2 <= 0 || valor3 <= 0) {
            System.out.println("Nao pode valor negativo");
            return;
        }

        if(!((valor1 + valor2) > valor3 && (valor2 + valor3) > valor1 && (valor1 + valor3) > valor2)) {
            System.out.println("Triangulo invalido");
        } else {

            if (valor1 == valor2 && valor1 == valor3) {
                System.out.println("Equilátero");
            } else if (valor1 == valor2 || valor1 == valor3 || valor3 == valor2) {
                System.out.println("Isòsceles");
            } else {
                System.out.println("Escaleno");
            }
        }
        sc.close();
    }
}
