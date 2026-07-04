public class Main {
    public static void main(String[] args) {
        // -* Aula *-
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

        // *- Desafio03 -*
        Desafio03Musica musica1 = new Desafio03Musica();
        musica1.artista = "Luan Santana";
        musica1.titulo = "Meteoro da Paixão";
        musica1.anoLancamento = 2014;

        musica1.exibeFicha();
        musica1.avaliar(9.3);
        musica1.avaliar(5.6);
        musica1.avaliar(8.5);
        double mediaMusica = musica1.calculaMediaAvaliacoes();
        System.out.printf("A média das avaliações é: %.2f%n", mediaMusica);

        // *- Desafio04 -*
        Desafio04Carro carro1 = new Desafio04Carro();
        carro1.ano = 2007;
        carro1.modelo = "Celta";
        carro1.cor = "Cinza";

        carro1.exibeFicha();
        int idadeCarro = carro1.calculaIdade(2026);
        System.out.printf("A idade atual do Carro é: %d%n", idadeCarro);

        // *- Desafio05 -*
        Desafio05Aluno aluno1 = new Desafio05Aluno();
        aluno1.nome = "João";
        aluno1.idade = 18;
        aluno1.exibeInfos();
    }
}
