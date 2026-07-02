import java.util.Scanner;

public class While {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double notaFilme = 0;
        int cont = 0;

        while (notaFilme != -1){
            System.out.println("Quando desejar para digite -1.");
            System.out.println("Qual nota você dá para este filme? (0 a 10): ");
            notaFilme = leitura.nextDouble();
            if (notaFilme != -1){
                mediaAvaliacao += notaFilme;
                cont++;
            }
        }
        System.out.printf("Média das avaliações: %.2f", mediaAvaliacao / cont);
    }
}
