import java.util.Scanner;

public class Loop {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double notaFilme = 0;

        for (int i = 0; i < 3; i++){
            System.out.println("Qual nota você dá para este filme? (0 a 10)");
            notaFilme = leitura.nextDouble();
            mediaAvaliacao += notaFilme;
        }
        System.out.printf("Média das avaliações: %.2f", mediaAvaliacao/3);
        int d;
        for (d = 0; d < 6; d++){
            System.out.println(d);
        }
    }
}
