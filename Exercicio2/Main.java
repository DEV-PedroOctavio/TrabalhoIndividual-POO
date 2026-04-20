package Exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria minhaConta = new ContaBancaria(1234, "Pedro Octavio");

        System.out.println("Conta criada para: " + minhaConta.titular);
        System.out.println("Bônus de boas-vindas garantido!");

        int opcao;

        do {
            System.out.println("\n--- Banco NuLiso ---");
            System.out.println("Caixa Eletrônico");
            System.out.println("O que deseja:");
            System.out.println("1 - Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Eu quero: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + minhaConta.saldo);
                    break;
                case 2:
                    System.out.print("Quanto deseja depositar? R$ ");
                    double valorDeposito = sc.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Quanto deseja sacar? R$ ");
                    double valorSaque = sc.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}