package alura.aula.javaPOO.aula3.modelos;

public class Titulo {
    private String titulo;
    private int anoLancamento;
    private boolean incluidoPlano;
    private String genero;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public String getGenero() {
        return genero;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
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
