public class Main {
    public static void main() {
        int anoLancamento = 2026;
        boolean incluidoNoPlano = false;
        double notaFilme = 7.6;
        String tipoPlano = "plus";

        if (anoLancamento >= 2026){
            System.out.println("Filme lançamento que os clientes estão curtindo!");
        }
        else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado.");
        }
        else {
            System.out.println("Assine o plano para liberar este filme!");
        }
    }
}
