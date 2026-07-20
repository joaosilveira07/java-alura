package alura.aula.javaPOO.aula3.modelos;

public class Desafio03Musica {
    public String titulo;
    public String artista;
    public int anoLancamento;
    double somaAvaliacao;
    int numAvaliacoes;

    public void exibeFicha(){
        System.out.printf("Título da música: %s%nArtista: %s%nAno de Lançamento: %d%n", titulo, artista, anoLancamento);
    }

    public void avaliar(double nota){
        somaAvaliacao += nota;
        numAvaliacoes++;
    }

    public double calculaMediaAvaliacoes(){
        return somaAvaliacao / numAvaliacoes;
    }
}
