package exercicio2;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getDetalhes() {
        return "Nome: " + nome + ", Salário: R$ " + salario;
    }
}