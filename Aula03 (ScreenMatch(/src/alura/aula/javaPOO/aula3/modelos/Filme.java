package alura.aula.javaPOO.aula3.modelos;

public class Filme {
    public String titulo;
    int anoLancamento;
    boolean incluidoPlano;
    String genero;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    String diretor;
    int duracaoMinutos;

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.printf("Nome do filme: %s %nAno de Lançamento: %d %n", titulo, anoLancamento);
    }

    public void avaliar(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double obterMediaAvaliacoes(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
