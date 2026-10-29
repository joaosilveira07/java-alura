package Criando_Primeira_Aplicacao.src;

public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 1986;
        boolean incluidoNoPlano = false;
        String tipoPlano = "plus";

        if (anoLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado para assistir!");
        } else {
            System.out.println("Deve pagar a assinatura.");
        }
    }
}
