package Desafio01;

import java.util.Scanner;

public class ConversorMoeda implements ConversaoFinanceira {
    Scanner sc = new Scanner(System.in);

    @Override
    public double converterDolarParaReal(double dolar){
        System.out.println("Digite o valor em dólar: ");
        double valorDolar = sc.nextDouble();
        double valorReal = valorDolar / 5.4;
        
        return valorReal;
    }
}
