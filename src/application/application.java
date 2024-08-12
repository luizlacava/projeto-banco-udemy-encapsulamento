package application;

import utilities.Account;

import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Account acc;

        System.out.print("Enter account number: ");
        int conta = scanner.nextInt();
        System.out.print("Enter account holder: ");
        String titular = scanner.next();
        System.out.print("Is there an initial deposit (y/n)? ");
        char option = scanner.next().charAt(0);
        if (option == 'y') {
            System.out.print("Enter initial deposit value: ");
            double depositoInicial = scanner.nextDouble();
            acc = new Account(conta, titular, depositoInicial);
        } else {
            acc = new Account(conta, titular);
        }

        System.out.println("Account data:");
        System.out.println(acc);

        System.out.print("Enter a deposit value: ");
        double valorDeposito = scanner.nextDouble();
        acc.depositar(valorDeposito);
        System.out.println("Updated account data:");
        System.out.println(acc);

        System.out.print("Enter a withdraw value: ");
        double valorSaque = scanner.nextDouble();
        acc.sacar(valorSaque);
        System.out.println("Updated account data:");
        System.out.println(acc);

        scanner.close();
    }
}
