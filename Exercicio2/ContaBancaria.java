package Exercicio2;

public class ContaBancaria {

    int numero;
    String titular;
    double saldo;
    int totalSaques;

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 50.00;
        this.totalSaques = 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito!");
        } else {
            saldo += valor;
            System.out.println("Depósito feito com sucesso!");
        }
    }

    public void sacar(double valor) {
        if (totalSaques >= 3) {
            System.out.println("Limite de saques diários atingido");
        } else if (valor <= 0) {
            System.out.println("Valor inválido!");
        } else if (valor > 1000.00) {
            System.out.println("Esse valor é muito alto! Máximo permitido por saque: R$ 1000,00");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            totalSaques++;
            System.out.println("Saque realizado! Novo saldo: R$ " + saldo);
        }
    }
}