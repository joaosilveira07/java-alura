package models;

public class Consumo {
    private String nomeApp;
    private int mbConsumidos;

    public Consumo(String nomeApp, int mbConsumidos){
        this.nomeApp = nomeApp;
        this.mbConsumidos = mbConsumidos;
    }
    
    public int getMbConsumido(){
        return this.mbConsumidos;
    }

    public String getNomeApp(){
        return this.nomeApp;
    }
}
