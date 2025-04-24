public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito de R$: " + valor + " realizado");
    }

    public void sacar(double valor) {
        if (valor <= saldo ) {
            saldo -= valor;
            System.out.println("Saque de R$: " + valor + " realizado");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo Atual R$: " + saldo);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }
}
