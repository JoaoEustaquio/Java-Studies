package org.example;

public class Operation {

    public static void	main(String[] args) {
        Account myAccount1 = new Account();
        Account myAccount2 = new Account();

        myAccount1.name	=	"Joao";
        myAccount1.balance	=	3000;

        myAccount2.name	=	"Joao";
        myAccount2.balance	=	3000;

        myAccount1.withdraw(200);

        myAccount1.deposit(500);
        System.out.println("Current balance: "+ myAccount1.balance);

        System.out.println(" ");

        if (myAccount1 == myAccount2) {
            System.out.println("Contas iguais");
        } else {
            System.out.println("Diferetes");
        }
    }

}