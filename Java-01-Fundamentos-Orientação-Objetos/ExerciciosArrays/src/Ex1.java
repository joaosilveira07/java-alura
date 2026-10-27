import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double[] notas;
        notas = new double[5];
        double soma = 0;
        double media;
        double maior = 0;
        double menor = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Elementos presentes no array: " + notas.length);

        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota: ");
            notas[i] = sc.nextDouble();
            System.out.println("Índice: " + i);
            System.out.println("Nota: " + notas[i]);
            soma += notas[i];
            if (i == 0 || maior < notas[i]){
                maior = notas[i];
            }
            if (i == 0 || menor > notas[i]) {
                menor = notas[i];
            }
        }
        sc.close();

        media = soma / notas.length;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);

        String[] nomes = {
            "Prova 1", "Prova 2", "Trabalho", "Projeto", "Prova final"
        };

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + ": " + notas[i]);
        }
    }
}
