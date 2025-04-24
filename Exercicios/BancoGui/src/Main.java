import javax.swing.*;

class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            JOptionPane.showMessageDialog(null, "Deposito de R$" + valor + " realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido para depósito!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Sague de R$: " + valor + "realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque ou valor invalido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
}

public class BancoGUI extends JFrame {
    private ContaBancaria conta;
    private JLabel saldoLabel;

    public BancoGUI(ContaBancaria conta) {
        this.conta = conta;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}