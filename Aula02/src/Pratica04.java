import java.util.Scanner;

public class Pratica04 {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        int numDigitado;
        System.out.println("Digite um número: ");
        numDigitado = leitor.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(numDigitado + " x " + i + " = " + (numDigitado * i));
        }
    }
}
