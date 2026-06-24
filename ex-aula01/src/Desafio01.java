public class Desafio01 {
    public static void main (String[] args){
        double tempC = 31.01;
        double tempF = (tempC * 1.8) + 32;

        String mensagem = String.format("A temperatura em Celsius é: %.2f e a temperatura em Fahrenheint é: %.2f", tempC, tempF);
        System.out.println(mensagem);

        int fah = (int) tempF;
        System.out.println(String.format("A temperatura inteira em Fahrenheit é: %d", fah));
    }
}
