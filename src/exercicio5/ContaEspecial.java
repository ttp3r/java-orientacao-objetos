package exercicio5;

public class ContaEspecial extends Conta {

    public ContaEspecial(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void creditar(double valor) {

        double bonus = valor * 0.01;

        saldo += valor + bonus;
    }
}