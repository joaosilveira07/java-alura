package alura.aula.javaPOO.aula3.modelos;

import alura.aula.javaPOO.aula3.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) obterMediaAvaliacoes() / 2;
    }
}
