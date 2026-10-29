import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco = sc.nextDouble();
        boolean ruim = false;
        System.out.println("Valor: "+ preco);
        String mensagem = """
                 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
                
                 2 - À Vista no cartão de crédito, recebe 10% de desconto
                
                 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
                
                 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
                """;
        System.out.println(mensagem);
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1 -> preco -= preco * 0.15;
            case 2 -> preco -= preco * 0.10;
            case 3 -> preco = preco;
            case 4 -> preco += preco * 0.10;
            default -> ruim = true;
        }
        if(!ruim) System.out.println("O preco ficou R$" + preco);
        else System.out.println("Voce digitou uma opcao invalida");

        sc.close();
    }
}
