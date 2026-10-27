package models;

import java.util.ArrayList;
import java.util.List;

public class PlanoDeDados {
    private int limiteDoPlano;
    private int saldo;
    private List<Consumo> consumos;

    public PlanoDeDados(int limiteDoPlano){
        this.limiteDoPlano = limiteDoPlano;
        this.saldo = limiteDoPlano;
        this.consumos = new ArrayList<>();
    }

    public boolean consumir(Consumo consumo){
        if (this.saldo >= consumo.getMbConsumido()){
            this.saldo -= consumo.getMbConsumido();
            this.consumos.add(consumo);
            return true;
        }

        return false;
    }

    public int getSaldo(){
        return this.saldo;
    }

    public int getLimiteDoPlano(){
        return this.limiteDoPlano;
    }

    public List<Consumo> getConsumos(){
        return consumos;
    }
}
