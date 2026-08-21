package Desafio02;

public class Main {
    public static void main(String[] args){
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.area = calculadora.calcularArea(5, 10);
        calculadora.calcularPerimetro(5, 10);
        System.out.println(calculadora.area);
        System.out.println(calculadora.perimetro);
    }
}
