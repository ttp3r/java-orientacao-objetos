package exercicio8;

import java.util.ArrayList;

public class Revista {

    private String nome;
    private ArrayList<Artigo> artigos;

    public Revista(String nome) {
        this.nome = nome;
        this.artigos = new ArrayList<>();
    }

    public void criarArtigo(String titulo) {

        Artigo artigo = new Artigo(titulo);

        artigos.add(artigo);
    }

    public void listarArtigos() {

        System.out.println("Revista: " + nome);

        for (Artigo artigo : artigos) {
            System.out.println("Artigo: " + artigo.getTitulo());
        }
    }
}