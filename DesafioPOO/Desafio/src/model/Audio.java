package model;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public void curtir(){
        this.totalCurtidas += 1;
    }

    public void reproduzir(){
        this.totalReproducoes += 1;
    }
    
    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public double getDuracao(){
        return this.duracao;
    }

    public int getTotalReproducoes(){
        return this.totalReproducoes;
    }

    public int getCurtidas(){
        return this.totalCurtidas;
    }

}
