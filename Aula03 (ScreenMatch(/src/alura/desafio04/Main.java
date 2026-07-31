package alura.desafio04;

public class Main {
    public static void main(String[] args){
        ContaBancaria contaBan = new ContaBancaria();
        contaBan.setNome();
        contaBan.setSaldo();
        contaBan.exibeSaldo();

        ContaCorrente contaCor = new ContaCorrente();
        contaCor.depositar();
        contaCor.exibeSaldo();
        contaCor.sacar();
        contaCor.exibeSaldo();
        contaCor.setTarifa();
        contaCor.cobrarTarifaMensal();
        contaCor.exibeSaldo();
    }
}
