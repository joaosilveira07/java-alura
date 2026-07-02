import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento deste filme? ");
        int anoLancamento = leitura.nextInt();
        System.out.println("Qual nota você dá para este filme? (0 a 10)");
        double notaFilme = leitura.nextDouble();
        leitura.close();

        System.out.printf("Seu filme favorito é: %s %n", filme);
        System.out.printf("O ano de laçamento deste filme é: %d %n", anoLancamento);
        System.out.printf("Sua nota para este filme é: %.2f %n", notaFilme);
    }
}
