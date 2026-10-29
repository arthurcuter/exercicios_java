import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kmsPorLitro = 12;
        int tempoGasto = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        int distanciaPercorrida = tempoGasto * velocidadeMedia;
        int qtdCombustivelUtilizada = distanciaPercorrida / kmsPorLitro;

        System.out.println("gastou " + qtdCombustivelUtilizada + " litros");

        sc.close();
    }
}
