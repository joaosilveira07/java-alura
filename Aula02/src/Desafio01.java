import java.util.Random;
import java.util.Scanner;

public class Desafio01 {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numUsuario = 0;

        while (tentativas < 5){
            System.out.printf("Tentativa %d: %n", tentativas + 1);
            System.out.println("Tente adivinhar o número que o sistema gerou: ");
            numUsuario = leitor.nextInt();
            if (numUsuario == numeroGerado){
                System.out.println("Parabéns! Você acertou o número!");
                break;
            }
            else if (numUsuario > numeroGerado){
                System.out.println("Que pena! O número que você digitou é maior que o número gerado.");
            }
            else {
                System.out.println("Que pena! O número que você digitou é menor que o número gerado.");
            }
            tentativas++;
        }
        if (tentativas == 5) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }

    }
}
