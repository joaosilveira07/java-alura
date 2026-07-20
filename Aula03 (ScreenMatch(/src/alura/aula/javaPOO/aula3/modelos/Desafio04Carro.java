package alura.aula.javaPOO.aula3.modelos;

public class Desafio04Carro {
    public String modelo;
    public int ano;
    public String cor;

    public void exibeFicha(){
        System.out.printf("Ficha técnica do carro:%nModelo: %s%nAno: %d%nCor: %s%n", modelo, ano, cor);
    }

    public int calculaIdade(int anoAtual){
       return anoAtual / ano;
    }
}
