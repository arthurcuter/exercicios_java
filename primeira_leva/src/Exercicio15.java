import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano = sc.nextInt();
        LocalDate pessoa = LocalDate.of(ano, 1, 2);
        LocalDate agora = LocalDate.now();
        int anos = (agora.getYear() - pessoa.getYear());
        int meses = agora.getMonthValue();
        int dias = agora.getDayOfMonth();
        System.out.println("Voce viveu " + anos + " anos, " + meses + " meses e "+ dias + " dias");
        sc.close();
    }
}
