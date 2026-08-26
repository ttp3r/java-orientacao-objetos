package exercicio1;

/*Crie uma classe Pessoa com atributos privados nome e idade.
Em seguida, crie uma classe Aluno que herde de Pessoa e adicione o atributo curso.
Implemente construtores, getters e setters.	*/

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

