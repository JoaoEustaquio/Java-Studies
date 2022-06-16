package org.example;

public class AccountingQuarter {

    public static void main(String[] args) {

        int January = 15000;
        int February = 23000;
        int March = 17000;

        int firstQuarter = January + February + March;

        System.out.println("Total expenses for the first quarter were: " + firstQuarter);
    }
}