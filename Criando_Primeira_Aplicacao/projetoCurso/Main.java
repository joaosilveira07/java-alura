package Criando_Primeira_Aplicacao.projetoCurso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente;
        String tipoConta;
        double saldo = 0;
        double saldoReceber;
        Scanner sc = new Scanner(System.in);
        int op = 0;

        System.out.println("Digite seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.println("Digite o tipo da sua conta: ");
        tipoConta = sc.nextLine();
        System.out.printf("""
            ======================================
                    Nome do cliente:    %s
                    Tipo da conta:      %s
                    Saldo Inicial:      %.2f 
            \n""", nomeCliente, tipoConta, saldo);

        do {
            System.out.println("\nOperações: ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");

            System.out.println("Digite a opção desejada: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.printf("O saldo atual é R$ %.2f\n", saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    saldoReceber = sc.nextDouble();
                    saldo += saldoReceber;
                    System.out.printf("Saldo atualizado: R$ %.2f\n", saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor a transferir: ");
                    saldoReceber = sc.nextDouble();
                    if (saldoReceber > saldo){
                        System.out.println("O valor da transferência é maior que o saldo atual, não é possível realizar essa transação.");
                        break;
                    }
                    saldo -= saldoReceber;
                    System.out.printf("Saldo atualizado: R$ %.2f\n", saldo);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        } while (op != 4);

        sc.close();
    }
}
