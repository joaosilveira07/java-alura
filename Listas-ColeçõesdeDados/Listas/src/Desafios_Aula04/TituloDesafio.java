package Desafios_Aula04;

public class TituloDesafio implements Comparable<TituloDesafio>{
    private String nome;

    public TituloDesafio(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int compareTo(TituloDesafio outroTituloDesafio){
        return outroTituloDesafio.getNome().compareTo(this.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome();
    }
}
