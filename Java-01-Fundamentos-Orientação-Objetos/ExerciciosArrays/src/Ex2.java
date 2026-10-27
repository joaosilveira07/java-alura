import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int[][] cinema = new int[3][4];
        int maior = 0, menor = 0, soma = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < cinema[i].length; i++){
            for (int j = 0; j < cinema[j].length; j++){
                System.out.println("Quantos ingressos foram vendidos na sessão " + (j + 1) + ": ");
                cinema[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < cinema[i].length; i++) {
            for (int j = 0; j < cinema[j].length; j++){
                System.out.println("Sala: " + (i + 1) + "- Sessão: " + (j + 1) + ": " + cinema[i][j]);
            }
        }

        for (int i = 0; i < cinema[i].length; i++) {
            for (int j = 0; j < cinema[j].length; j++){
                if ((i == 0 && j == 0) || cinema[i][j] > maior) {
                    maior = cinema[i][j];
                }
                if ((i == 0 && j == 0) || cinema[i][j] < menor) {
                    menor = cinema[i][j];
                }
                // Concluir o resto do exercicio
            }
        }
    }
}
