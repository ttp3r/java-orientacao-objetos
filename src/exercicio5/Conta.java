package exercicio5;

public class Conta {

    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}