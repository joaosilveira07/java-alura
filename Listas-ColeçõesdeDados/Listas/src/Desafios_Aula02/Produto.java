package Desafios_Aula02;

import java.util.concurrent.ArrayBlockingQueue;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }


    @Override
    public String toString() {
        return "Produto: " + getNome() + ", Preço: " + getPreco() + ", Quantidade: " + getQuantidade();
    }
}
