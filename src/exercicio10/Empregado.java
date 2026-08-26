package exercicio10;

public abstract class Empregado {

    protected String nome;
    protected double salarioBase;

    public Empregado(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}