public class Desafio07 {
    public static void main(String[] args){
        double precoOriginal = 32.99;
        double percentualDesconto = 15;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;
        System.out.println("Preço Original: " + precoOriginal);
        System.out.println("Desconto: " + valorDesconto);
        System.out.println("Preço com Desconto: " + novoPreco);
    }
}
