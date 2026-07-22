package alura.desafio.aula3.javaPOO;

public class Ex3 {
    private String nome;
    private double preco;

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual){
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }
}
