package Desafios_Aula03;

public class ContaBancaria {
    private int numero;
    private double saldo;

    public ContaBancaria(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }
}
