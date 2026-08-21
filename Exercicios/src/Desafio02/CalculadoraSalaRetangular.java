package Desafio02;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    double area;
    double perimetro;
    
    @Override
    public double calcularArea(double base, double altura){
        double area = base * altura;

        return area;
    }

    @Override
    public double calcularPerimetro(double base, double altura){
        double perimetro = (base * 2) + (altura * 2);

        return perimetro;
    }
}
