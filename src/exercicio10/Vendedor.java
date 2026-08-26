package exercicio10;

public class Vendedor extends Empregado {

    private double comissao;

    public Vendedor(
            String nome,
            double salarioBase,
            double comissao
    ) {

        super(nome, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
}