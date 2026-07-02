import java.util.Scanner;

public class Pratica05 {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        int numDigitado;
        System.out.println("Digite um número inteiro: ");
        numDigitado = leitor.nextInt();
        if (numDigitado % 2 == 0){
            System.out.printf("O número %d é par.", numDigitado);
        }
        else {
            System.out.printf("O número %d é ímpar.", numDigitado);
        }
    }
}
