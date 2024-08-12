package application;

import utilities.Account;

import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int conta = scanner.nextInt();
        System.out.print("Enter account holder: ");
        String titular = scanner.next();
        System.out.print("Is there an initial deposit (y/n)? ");
        char option = scanner.next().charAt(0);

        Account acc = new Account(conta, titular);


        double quantia;

        if (option == 'y') {
            System.out.print("Enter initial deposit value: ");
            quantia = scanner.nextDouble();
            acc.depositar(quantia);
        } else {
            quantia = 0.00;
        }

        System.out.println("Account data:");
        System.out.println(acc);

        System.out.print("Enter a deposit value: ");
        quantia = scanner.nextDouble();
        acc.depositar(quantia);
        System.out.println("Updated account data:");
        System.out.println(acc);

        System.out.print("Enter a withdraw value: ");
        quantia = scanner.nextDouble();
        acc.sacar(quantia);
        System.out.println("Updated account data:");
        System.out.println(acc);

        scanner.close();
    }
}
