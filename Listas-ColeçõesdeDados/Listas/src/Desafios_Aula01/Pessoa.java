package Desafios_Aula01;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "Essa pessoa é " + this.nome + " e tem " + this.idade + " anos";
    }

}
