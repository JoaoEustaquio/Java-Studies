package org.example;

public class Account {
        String name;
        int number;
        String agency;
        double balance;
        String openIn;

        void withdraw(double quantity) {
            double newBalance =  this.balance - quantity;
            this.balance = newBalance;
        }

        void deposit(double quantity) {
            this.balance	+=	quantity;
        }
}

