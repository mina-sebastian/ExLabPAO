package me.mina.lab4.ex;

public class Application {

    public static void main(String[] args) {

        DebitCard debitCard = new DebitCard("Mina", 100);
        CreditCard creditCard = new CreditCard("Andrei");
        DebitCard debitCard2 = new DebitCard("Mina2", 100);

        ShoppingMall shoppingMall = new ShoppingMall(debitCard);

        shoppingMall.achizitie(150);
        shoppingMall.achizitie(100);

        System.out.println();
        shoppingMall.setBankCard(creditCard);
        shoppingMall.achizitie(150);
        shoppingMall.achizitie(100);

        System.out.println();
        shoppingMall.setBankCard(debitCard2);
        shoppingMall.achizitie(150);
        shoppingMall.achizitie(100);
    }

}
