package alura.desafio04;

import java.util.Scanner;

public class ContaCorrente extends ContaBancaria{
    private double tarifa;

    Scanner sc = new Scanner(System.in);

    public void setTarifa(){
        System.out.println("Qual o valor da tarifa? ");
        this.tarifa = sc.nextDouble();
    }

    public void cobrarTarifaMensal(){
        System.out.printf("Cobrando tarifa mensal no valor de R$%.2f %n", tarifa);
        aplicarDebito(tarifa);
    }
}
