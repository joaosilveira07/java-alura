import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

import models.Compras;
import models.CartaoCredito;

public class Main{
    public static void main(String[] args) {
        double limiteInformado;
        double valorCompra;
        int op = 1;
        int cont = 0;
        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o limite do seu cartão: ");
        limiteInformado = sc.nextDouble();
        while (limiteInformado <= 0){
            System.out.println("O limite deve ser maior que zero. Por favor, tente novamente!");
            System.out.println("Digite o limite do seu cartão: ");
            limiteInformado = sc.nextDouble();
        }
        CartaoCredito cartao1 = new CartaoCredito(limiteInformado);
        while (op != 0 || limiteInformado <= cartao1.getSaldo()){
            System.out.println("Digite o valor da compra: ");
            valorCompra = sc.nextDouble();

            System.out.println("Digite o nome do produto: ");
            nome = sc.nextLine();
            
            Compras compra = new Compras(nome, valorCompra); 
            boolean compraRealizada = cartao1.transacao(compra);
            
            if (compraRealizada){ 
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Saldo restante: " + cartao1.getSaldo());
                System.out.println("Digite 0 se deseja sair ou digite qualquer número para continuar.");
                op = sc.nextInt();
                
                cont++;
            } else{
                System.out.println("Não é possível fazer uma compra maior que o limite/saldo da conta.");
                op = 1;
            }
        }
        sc.close();
        System.out.printf("Finalizado! Você fez %d compras. %n", cont);
        System.out.println("""
                ===========================
                    Compras Realizadas:
                \n""");

        Collections.sort(cartao1.getCompras());
        for (Compras compra : cartao1.getCompras()){
            System.out.println(compra.getDescricao() + " - " + compra.getValor());
        }
        System.out.println("""
                ===========================
                """);
        System.out.println("Saldo do cartão: " + cartao1.getSaldo());
    }
}
