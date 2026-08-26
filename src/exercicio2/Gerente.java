package exercicio2;

public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes()
                + ", Departamento: " + departamento;
    }
}