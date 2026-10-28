package Criando_Primeira_Aplicacao.aula02_desafio;


public class Conversor {
    public static void main(String[] args) {
        int grausCelsius = 32;
        int grausFahrenheit = (int) (grausCelsius * 1.8) + 32;
        System.out.println("Graus celsius: " + grausCelsius);
        System.out.println("Graus Fahrenheint: " + grausFahrenheit);
    }
}
