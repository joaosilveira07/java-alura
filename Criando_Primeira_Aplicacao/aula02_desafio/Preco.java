package Criando_Primeira_Aplicacao.aula02_desafio;

public class Preco {
    public static void main(String[] args) {
        double precoProduto = 12.99;
        int qtd = 5;
        double valorTotal = precoProduto * qtd;
        System.out.println(String.format("Preço total: %.2f", valorTotal));
    }
}
