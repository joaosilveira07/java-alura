import java.util.Scanner;

public class Pratica06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numUsuario;
        System.out.println("Digite um número inteiro: ");
        numUsuario = leitor.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numUsuario; i++){
            fatorial *= i;
        }
            System.out.printf("O fatorial deste número é: %d", fatorial);
    }
}
