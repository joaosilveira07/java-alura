package alura.desafio.aula3.javaPOO;

public class Ex2 {
    private int idade;
    private String nome;

    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void verificarIdade(int idade){
        if (idade >= 18){
            System.out.printf("O %s têm %d anos e portanto é maior de idade. %n", getNome(), getIdade());
        }
        else {
            System.out.printf("O %s têm %d anos e portanto é menor de idade. %n", getNome(), getIdade());
        }
    }
}
