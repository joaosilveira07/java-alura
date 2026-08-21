package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import Desafios_Aula04.TituloDesafio;
import models.Filme;
import models.Serie;
import models.Titulo;

public class MainComListas {
    public static void main(String[] args){
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("Dog Ville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000, 9);

        Filme s1 = filmeDoPaulo;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Paulo");
        buscarPorArtista.add("Jaqueline");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscarPorArtista);

        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

        // Desafio Aula04
        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(5);
        listaInteiros.add(3);
        listaInteiros.add(8);
        listaInteiros.add(10);

        System.out.println(listaInteiros);
        Collections.sort(listaInteiros);
        System.out.println(listaInteiros);

        TituloDesafio td1 = new TituloDesafio("José");
        TituloDesafio td2 = new TituloDesafio("Maria");
        TituloDesafio td3 = new TituloDesafio("Wellington");
        TituloDesafio td4 = new TituloDesafio("André");
        List<TituloDesafio> listaDesafios = new ArrayList<>();
        listaDesafios.add(td1);
        listaDesafios.add(td2);
        listaDesafios.add(td3);
        listaDesafios.add(td4);

        System.out.println(listaDesafios);
        Collections.sort(listaDesafios);
        System.out.println(listaDesafios);

        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);

        List<String> listaPolimorfica;
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
