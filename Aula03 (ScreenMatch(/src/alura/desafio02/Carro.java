package alura.desafio02;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPrecoAno1(double precoAno1){
        this.precoAno1 = precoAno1;
    }

    public void setPrecoAno2(double precoAno2){
        this.precoAno2 = precoAno2;
    }

    public void setPrecoAno3(double precoAno3){
        this.precoAno3 = precoAno3;
    }

    public double calculaMenor(){
        double menorPreco = precoAno1;
        if (precoAno2 < menorPreco){
            menorPreco = precoAno2;
        }
        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    public double calculaMaior(){
        double maiorPreco = precoAno1;
        if (precoAno2 > maiorPreco){
            maiorPreco = precoAno2;
        }
        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    public void exibirInfo(){
        System.out.printf("Modelo: %s %n", modelo);
        System.out.printf("Preço ano 1: %.2f %n", precoAno1);
        System.out.printf("Preço ano 2: %.2f %n", precoAno2);
        System.out.printf("Preço ano 3: %.2f %n", precoAno3);
        System.out.printf("Maior preço: %.2f %n", calculaMaior());
        System.out.printf("Menor preço: %.2f %n", calculaMenor());
    }
}
