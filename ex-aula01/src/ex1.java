public class ex1 {
    public static void main(String[] args) {
        int anoLancamento = 2009;
        System.out.println("Esse é o ScreenMatch");
        System.out.println("Filme: 'Bolt: O Supercão' (" + anoLancamento + ")");
        boolean incluidoNoPlano = true;
        double notaFilme = 7.2;

        double media = (7.2 + 8.5) / 2;
        System.out.println(media);
        String sinopse = "Filme do supercão";
        System.out.println("""
                Filme: 'Bolt: O Supercão'
                Filme do supercão
                Ano de Lançamento:
                """ + anoLancamento);

        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }
    }
}
