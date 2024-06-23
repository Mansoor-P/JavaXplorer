package com.mansoor.java.killer_java.corejava.OOP.encapsulation;

public class BankAccount {
    // Private data member
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    // Public method to get the balance
    public double getBalance() {
        return this.balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0.0) {
            this.balance += amount;
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0.0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }
}
