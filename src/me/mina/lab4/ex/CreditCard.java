package me.mina.lab4.ex;

public record CreditCard(String utilizator) implements BankCard{

    private static double spentAmount;

    @Override
    public void doTransaction(double amount) {
        spentAmount += amount;
        System.out.println("Utilizator " + utilizator + " a cheltuit " + amount);
        System.out.println("Suma totala cheltuita cu carduri de credit este " + spentAmount);

    }
}
