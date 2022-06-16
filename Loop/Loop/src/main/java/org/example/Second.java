package org.example;

public class Second {
    public static void main(String[] args) {

        int soma = 0;

        System.out.print("A soma dos 1000 primeiros numeros é: ");
        for(int i = 1; i<=1000; i++) {
            soma += i;
        }
        System.out.println(soma);

    }
}
