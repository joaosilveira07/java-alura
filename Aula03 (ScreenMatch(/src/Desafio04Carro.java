public class Desafio04Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFicha(){
        System.out.printf("Ficha técnica do carro:%nModelo: %s%nAno: %d%nCor: %s%n", modelo, ano, cor);
    }

    int calculaIdade(int anoAtual){
       return anoAtual / ano;
    }
}
