import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcaoUsuario = 0;
        double saldo;
        String nomeUsuario;
        String tipoConta;
        System.out.println("Vamos começar com suas informações iniciais!");
        System.out.println("Me diga seu nome: ");
        nomeUsuario = sc.nextLine();
        System.out.println("Boa! Agora me diga qual o tipo da sua conta (corrente ou salário): ");
        tipoConta = sc.nextLine();
        System.out.printf("Perfeito, %s! Agora me diga qual seu saldo inicial: %n", nomeUsuario);
        saldo = sc.nextDouble();
        while (saldo < 0){
            System.out.println("O saldo inicial não pode ser negativo!");
            System.out.println("Digite o saldo inicial novamente: ");
            saldo = sc.nextDouble();
        }

        System.out.println("=================================\n");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.printf("Nome: %s %n", nomeUsuario);
        System.out.printf("Tipo conta: %s %n", tipoConta);
        System.out.printf("Saldo inicial: %.2f %n", saldo);
        System.out.println("\n=================================\n");

        String menu = """
                ======================
                1. Consultar saldo.
                2. Receber valor.
                3. Transferir valor.
                4. Sair.
                ======================
                Escolha uma opção:
                """;
        while (opcaoUsuario != 4){
            System.out.println(menu);
            opcaoUsuario = sc.nextInt();

            if (opcaoUsuario == 4) {
                System.out.println("Saindo...");
            }
            else if (opcaoUsuario == 1) {
                System.out.printf("Saldo Atual: %.2f %n", saldo);
            }
            else if (opcaoUsuario == 2) {
                double valorReceber;
                System.out.println("Digite o valor que você irá receber: ");
                valorReceber = sc.nextDouble();
                saldo += valorReceber;
                System.out.printf("O saldo foi atualizado! Agora é de: %.2f %n", saldo);
            }
            else if (opcaoUsuario == 3) {
                double valorTransferencia;
                System.out.println("Digite o valor que você irá transferir: ");
                valorTransferencia = sc.nextDouble();

                if (valorTransferencia > saldo) {
                    System.out.println("Você não pode transferir um valor maior do que você tem em conta!");
                }
                else {
                    saldo -= valorTransferencia;
                    System.out.printf("O saldo foi atualizado! Agora é de: %.2f %n", saldo);
                }
            }
        }
    }
}
