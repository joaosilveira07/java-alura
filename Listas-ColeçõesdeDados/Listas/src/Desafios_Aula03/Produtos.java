package Desafios_Aula03;

import java.util.ArrayList;

public class Produtos {
    private double preco;
    private String nome;

    public Produtos(String nome, double preco){
        this.preco = preco;
        this.nome = nome;
    }

    public static double calculaPrecoMedio(ArrayList<Produtos> produtos){
        if (produtos == null || produtos.isEmpty()){
            return 0;
        }
        double soma = 0;
        for (Produtos produto : produtos){
            soma += produto.getPreco();
        }
        return soma / produtos.size();
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }
}
