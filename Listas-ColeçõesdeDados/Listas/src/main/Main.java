package main;
import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;
import java.util.ArrayList;
import models.Episodio;
import models.Filme;
import models.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        //meuFilme.setNome("O poderoso chefão");
        //meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000, 9);
        //lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        //outroFilme.setNome("Avatar");
        //outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Dog Ville", 2003);
        // filmeDoPaulo.setNome("Dog Ville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        //filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());
        
        




        // Desafios Aula01
        // Pessoa p1 = new Pessoa("Joãozinho", 12);
        // Pessoa p2 = new Pessoa("Pedrinho", 18);
        // Pessoa p3 = new Pessoa("José", 32);
        
        // ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        // listaDePessoas.add(p1);
        // listaDePessoas.add(p2);
        // listaDePessoas.add(p3);
        // System.out.printf("Tamanho da lista: %d %n", listaDePessoas.size());
        // System.out.printf("Primeira pessoa da lista: %s %n", listaDePessoas.get(0));
        // System.out.println(listaDePessoas);

        // Desafios Aula02
        // Produto p1 = new Produto("Shampoo", 34.99, 6);
        // Produto p2 = new Produto("Kit Desodorante", 50, 7);
        // Produto p3 = new Produto("Box Livros", 99.89, 8);

        // ArrayList<Produto> listaProdutos = new ArrayList<>();
        // listaProdutos.add(p1);
        // listaProdutos.add(p2);
        // listaProdutos.add(p3);
        // System.out.println("Tamanho da lista: " + listaProdutos.size());
        // System.out.println("Produto do índice 1: " + listaProdutos.get(1).getNome());
        // System.out.println("toString do produto " + listaProdutos.toString());
        // System.out.println(p1);

        // ProdutoPerecivel pp1 = new ProdutoPerecivel("Arroz", 21.99, 5, "10/09/2026");
        // System.out.println(pp1);

        // Desafios Aula03
        // ArrayList<Object> listaStrings = new ArrayList<>();
        // listaStrings.add("Java");
        // listaStrings.add("C++");
        // listaStrings.add("C#");
        // listaStrings.add(42);

        // for (Object object : listaStrings){
        //     System.out.println(object);
        // }

        // Animal animal = new Animal();
        // Cachorro cachorro1 = new Cachorro();
        // cachorro1.emitirSom();
        // Animal animal1 = (Animal) cachorro1;
        // animal1.emitirSom();

        // if (animal instanceof Cachorro){
        //     Cachorro cachorro = (Cachorro) animal;
        // }
        // else{
        //     System.out.println("O objeto não é um cachorro.");
        // }

        // Produtos p1 = new Produtos("Shampoo", 24.99);
        // Produtos p2 = new Produtos("Shampoo", 35.99);
        // Produtos p3 = new Produtos("Shampoo", 12.99);
        // Produtos p4 = new Produtos("Shampoo", 40.99);

        // ArrayList<Produtos> listaDeProdutos = new ArrayList<>();
        // listaDeProdutos.add(p1);
        // listaDeProdutos.add(p2);
        // listaDeProdutos.add(p3);
        // listaDeProdutos.add(p4);

        // double somaPreco = 0;
        // for (Produtos produto : listaDeProdutos){
        //     somaPreco += produto.getPreco();
        // }
        // double precoMedio = somaPreco / listaDeProdutos.size();
        // System.out.printf("O preço médio dos produtos é: %.2f %n", precoMedio);

        // System.out.printf("Preço: %.2f %n", Produtos.calculaPrecoMedio(listaDeProdutos));

        // Circulo c1 = new Circulo(7.5);
        // Quadrado q1 = new Quadrado(5);
        // ArrayList<Forma> listaDeFormas = new ArrayList<>();
        // listaDeFormas.add(c1);
        // listaDeFormas.add(q1);
        // double area;
        // for (Forma f : listaDeFormas){
        //     area = f.calcularArea();
        //     System.out.println("Área: "+ area);
        // }

        // ContaBancaria conta1 = new ContaBancaria(0001, 149.99);
        // ContaBancaria conta2 = new ContaBancaria(0002, 15000.00);
        // ContaBancaria conta3 = new ContaBancaria(0003, 29.90);
        // ArrayList<ContaBancaria> listaDeContaBancarias = new ArrayList<>();
        // listaDeContaBancarias.add(conta1);
        // listaDeContaBancarias.add(conta2);
        // listaDeContaBancarias.add(conta3);
        // ContaBancaria maiorSaldo = listaDeContaBancarias.get(0);
        // for (ContaBancaria conta : listaDeContaBancarias){
        //     if (conta.getSaldo() > maiorSaldo.getSaldo()){
        //         maiorSaldo = conta;
        //     }
        // }
        // System.out.printf("Conta com o maior saldo - Número: %d %nSaldo: %.2f", maiorSaldo.getNumero(), maiorSaldo.getSaldo());
    }
}