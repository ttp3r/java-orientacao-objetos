package exercicio7;

import java.util.ArrayList;

public class Time {

    private String nome;
    private ArrayList<Jogador> jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void listarJogadores() {

        System.out.println("Time: " + nome);

        for (Jogador jogador : jogadores) {
            System.out.println("Jogador: " + jogador.getNome());
        }
    }
}