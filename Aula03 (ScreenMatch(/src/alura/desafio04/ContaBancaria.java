package alura.desafio04;

import java.util.Scanner;

public class ContaBancaria {
    private double saldo;
    private String nome;

    Scanner sc = new Scanner(System.in);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo() {
        System.out.println("Qual o saldo que você tem em conta? ");
        this.saldo = sc.nextDouble();
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        System.out.println("Qual seu nome? ");
        this.nome = sc.nextLine();
    }

    public void depositar(){
        System.out.println("Qual o valor que você quer depositar? ");
        double valorDeposito = sc.nextDouble();
        saldo += valorDeposito;
        System.out.printf("Saldo atualizado: %.2f %n", saldo);
    }

    public void sacar(){
        System.out.println("Qual valor que você quer sacar? ");
        double valorSaque = sc.nextDouble();
        if (valorSaque > saldo){
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valorSaque;
            System.out.printf("Saldo atualizado: %.2f %n", saldo);
        }
    }

    public void exibeSaldo(){
        System.out.printf("Saldo atual: %.2f %n", saldo);
    }

    public void aplicarDebito(double valor) {
        this.saldo -= valor;
    }
}
