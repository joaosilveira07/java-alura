import java.util.Scanner;

public class Pratica01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if (num > 0){
            System.out.println("Este número é positivo.");
        }
        else if (num < 0) {
            System.out.println("Este número é negativo.");
        }
        else {
            System.out.println("Este número é 0.");
        }
    }
}
