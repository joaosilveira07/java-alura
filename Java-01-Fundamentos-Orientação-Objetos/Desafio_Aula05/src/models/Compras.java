package models;

public class Compras implements Comparable<Compras>{
    private String descricao;
    private double valor;

    public Compras (String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public double getValor(){
        return this.valor;
    }

    @Override
    public String toString() {
        return """
                ==================
                      COMPRAS
                ==================
                """ + "Descrição: " + descricao + 
                 "Valor: " + valor;
    }

    @Override
    public int compareTo(Compras outraCompras) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompras.valor));
    }
}
