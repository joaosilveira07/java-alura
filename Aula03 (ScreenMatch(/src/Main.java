public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.titulo = "Vingadores: Ultimato";
        filme1.anoLancamento = 2019;
        filme1.duracaoMinutos = 152;

        filme1.exibeFichaTecnica();
        filme1.avaliar(8);
        filme1.avaliar(5.3);
        filme1.avaliar(7.5);
        System.out.println(filme1.somaAvaliacoes);
        System.out.println(filme1.totalAvaliacoes);
        System.out.printf("Média das avaliações do filme: %.2f %n", filme1.obterMediaAvaliacoes());
    }
}
