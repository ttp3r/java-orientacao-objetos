package exercicio10;

public class Gerente extends Empregado {

    private double bonus;

    public Gerente(
            String nome,
            double salarioBase,
            double bonus
    ) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}