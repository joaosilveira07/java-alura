public class App {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao ScreenMatch!");
        System.out.println("Filme: Top Gun: Maverick");

        // tipos primitivos
        int anoLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        
        // media calculada pelas 3 notas 
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        // text block
        String sinopse = """
        Filme top gun
        Filme de aventura com galã dos anos 80.
        Muito bom!
        Ano de lançamento
         """ + anoLancamento;
        System.out.println(sinopse);

        // casting
        int classificacao = (int) media / 2;
        System.out.println(classificacao); 
    }
}
