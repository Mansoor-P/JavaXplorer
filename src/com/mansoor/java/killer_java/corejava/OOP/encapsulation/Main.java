package com.mansoor.java.killer_java.corejava.OOP.encapsulation;

public class Main {
    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount account = new BankAccount(1000.0);

        // Display initial balance
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit money
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Attempt to withdraw money
        account.withdraw(300.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Attempt to withdraw more money than the current balance
        account.withdraw(1500.0); // This should not change the balance
        System.out.println("Balance after attempting to withdraw too much: " + account.getBalance());
    }
}

