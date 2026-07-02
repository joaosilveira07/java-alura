import java.util.Scanner;

public class Pratica02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("Os números são iguais!");
        }
        else {
            System.out.println("Os números são diferentes!");
            if (num1 > num2){
                System.out.println("O primeiro número é maior!");
            }
            else {
                System.out.println("O segundo número é maior!");
            }
        }

    }
}
