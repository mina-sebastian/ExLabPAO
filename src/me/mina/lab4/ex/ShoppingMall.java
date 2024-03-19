package me.mina.lab4.ex;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard){
        this.bankCard = bankCard;
    }

    public void achizitie(double amount){
        bankCard.doTransaction(amount);
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }
}
