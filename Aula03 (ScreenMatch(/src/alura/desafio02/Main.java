package alura.desafio02;

public class Main {
    public static void main(String[] args){
        ModeloCarro carro1 = new ModeloCarro();
        carro1.setModelo("Hatch");
        carro1.setPrecoAno1(65000);
        carro1.setPrecoAno2(75000);
        carro1.setPrecoAno3(85000);
        carro1.setAnoDoCarro(2016);
        carro1.setCor("Azul");
        carro1.exibirInfo();
    }
}
