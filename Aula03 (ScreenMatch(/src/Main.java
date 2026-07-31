import alura.aula.javaPOO.aula3.calculos.CalculadoraDeTempo;
import alura.aula.javaPOO.aula3.modelos.Desafio03Musica;
import alura.aula.javaPOO.aula3.modelos.Desafio04Carro;
import alura.aula.javaPOO.aula3.modelos.Desafio05Aluno;
import alura.aula.javaPOO.aula3.modelos.Filme;
import alura.aula.javaPOO.aula3.modelos.Series;

public class Main {
    public static void main(String[] args) {

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


        // -* Aula *-
        Filme filme1 = new Filme();
        filme1.setTitulo("Vingadores: Ultimato");
        filme1.setAnoLancamento(2019);
        filme1.setDuracaoMinutos(152);

        filme1.exibeFichaTecnica();
        filme1.avaliar(8);
        filme1.avaliar(5.3);
        filme1.avaliar(7.5);
        System.out.println("Total de avaliações: " + filme1.getTotalAvaliacoes());
        System.out.printf("Média das avaliações do filme: %.2f %n", filme1.obterMediaAvaliacoes());
        // filme1.somaAvaliacoes = 10; ISTO NÃO PODE OCORRER
        // filme1.totalAvaliacoes = 1; ISTO NÃO PODE OCORRER
        // System.out.println(filme1.obterMediaAvaliacoes());
        System.out.printf("Duração do filme: %d %n", filme1.getDuracaoMinutos());

        // -* Continuação da Aula *-
        Series lost = new Series();
        lost.setTitulo("Lost");
        lost.setAnoLancamento(2001);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(12);
        lost.setMinutosPorEpisodio(50);
        System.out.printf("Duração para maratonar %s: %d %n", lost.getTitulo(), lost.getDuracaoMinutos());

        Filme filme2 = new Filme();
        filme2.setTitulo("Bob Esponja");
        filme2.setAnoLancamento(2016);
        filme2.setDuracaoMinutos(98);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        System.out.println(calculadora.getTempoTotal());

        
    }
}
