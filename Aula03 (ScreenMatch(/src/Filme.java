public class Filme {
    String titulo;
    int anoLancamento;
    boolean incluidoPlano;
    String genero;
    double somaAvaliacoes;
    int totalAvaliacoes;
    String diretor;
    int duracaoMinutos;

    void exibeFichaTecnica(){
        System.out.printf("Nome do filme: %s %nAno de Lançamento: %d %n", titulo, anoLancamento);
    }

    void avaliar(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double obterMediaAvaliacoes(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
