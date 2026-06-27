public class Desafio05 {
    public static void main(String[] args){
        double precoProduto = 15.99;
        int quantidade = 52;
        double precoTotal = precoProduto * quantidade;
        System.out.println(String.format("O preço do produto é: %.2f", precoTotal));
    }
}
