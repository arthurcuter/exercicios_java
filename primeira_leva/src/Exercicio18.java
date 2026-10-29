public class Exercicio18 {
    public static void main(String[] args) {
        // enunciado estranho entao troquei os valores

        double alturaF = 1.10;
        double alturaS = 1.50;
        int contador = 0;
        while(alturaS > alturaF) {
            alturaS += 0.02;
            alturaF += 0.03;
            contador++;
        }

        System.out.println("Levaram " + contador+ " anos para que Francisco ficasse maior que Sara");
    }
}
