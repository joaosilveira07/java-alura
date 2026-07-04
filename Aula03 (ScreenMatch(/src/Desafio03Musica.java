public class Desafio03Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacao;
    int numAvaliacoes;

    void exibeFicha(){
        System.out.printf("Título da música: %s%nArtista: %s%nAno de Lançamento: %d%n", titulo, artista, anoLancamento);
    }

    void avaliar(double nota){
        somaAvaliacao += nota;
        numAvaliacoes++;
    }

    double calculaMediaAvaliacoes(){
        return somaAvaliacao / numAvaliacoes;
    }
}
