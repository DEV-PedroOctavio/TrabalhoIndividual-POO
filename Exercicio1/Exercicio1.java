package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 0;//saldo atual
        int totalSaques = 0;
        int opcao;

        do {
            System.out.println("\nBanco NuLiso");
            System.out.println("Caixa Eletronico");
            System.out.println("Oque deseja:");
            System.out.println("1 - Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Eu quero: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                case 2:
                    System.out.print("Quanto deseja depositar? R$ ");
                    double deposito = sc.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("Valor inválido!");
                    } else {
                        saldo += deposito;
                        System.out.println("Depósito feito com sucesso!");
                    }
                    break;
                case 3:
                    if (totalSaques >= 3) {
                        System.out.println("Limite de saques diários atingido");
                        break;
                    }
                    System.out.print("Quanto deseja sacar? R$ ");
                    double saque = sc.nextDouble();

                    if (saque <= 0) {
                        System.out.println("Valor inválido!");
                    } else if (saque > 1000.00) {
                        System.out.println("Esse valor é muito alto! Máximo permitido por saque: R$ 1000,00");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= saque;
                        totalSaques++;
                        System.out.println("Saque realizado! Novo saldo: R$ " + saldo);
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}