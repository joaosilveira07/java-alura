package main;

import model.MinhasPreferidas;
import model.Musica;
import model.Podcast;

public class Main{
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Forever");
        musica1.setCantor("Kiss");

        for (int i = 0; i < 1000; i++){
            musica1.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curtir();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Bolha Dev!");
        podcast1.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.incluir(podcast1);
        preferidas.incluir(musica1);
    }
}
