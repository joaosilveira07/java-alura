import java.util.Scanner;

public class Pratica03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double lado;
        double raio;
        double area;

        System.out.println("1. Calcular área do quadrado.");
        System.out.println("2. Calcular área do círculo.");
        opcao = sc.nextInt();

        if (opcao == 1){
            System.out.println("Digite o valor do lado do quadrado: ");
            lado = sc.nextDouble();
            area = lado * lado;
            System.out.printf("A área do quadrado é: %.2f", area);
        }
        else if (opcao == 2){
            System.out.println("Digite o valor do raio do círculo: ");
            raio = sc.nextDouble();
            area = 3.14 * (raio * raio);
            System.out.printf("A área do círculo é: %.2f", area);
        }
        else {
            System.out.println("Essa opção não é válida!");
        }
    }
}
