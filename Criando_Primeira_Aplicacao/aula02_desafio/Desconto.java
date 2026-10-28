package Criando_Primeira_Aplicacao.aula02_desafio;

public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 99.90;
        double percentualDesconto = 10.0;
        double novoPreco = precoOriginal * (1 - (percentualDesconto / 100));
        System.out.println("Preço original: " + precoOriginal);
        System.out.println("Preço com desconto: " + novoPreco);

        double percentualDesconto2 = 10.0;
        double valorDesconto = (percentualDesconto2 / 100.0) * precoOriginal;
        double novoPreco2 = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco2);
    }
}
