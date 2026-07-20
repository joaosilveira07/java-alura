package alura.aula.javaPOO.aula3.modelos;

public class Filme {
    private String titulo;
    private int anoLancamento;
    private boolean incluidoPlano;
    private String genero;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private String diretor;
    private int duracaoMinutos;

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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
