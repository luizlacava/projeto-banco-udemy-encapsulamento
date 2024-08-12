package utilities;

public class Account {

    private int conta;
    private String titular;
    private double saldo;

    public Account(int conta, String titular, double saldo) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Account(int conta, String titular) {
        this.conta = conta;
        this.titular = titular;
    }

    public int getConta() {
        return conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double quantia) {
        saldo += quantia;
    }

    public void sacar(double quantia) {
        saldo -= quantia + 5.00;
    }


    @Override
    public String toString() {
        return "Account "
                + conta
                + ", Titular: "
                + titular
                + ", Saldo: $ "
                + saldo;
    }
}
