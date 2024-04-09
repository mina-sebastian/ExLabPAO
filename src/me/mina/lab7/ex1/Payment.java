package me.mina.lab7.ex1;

import java.util.Objects;

public class Payment implements Cloneable{

    //amount, currency, User , purpose
    private double amount;
    private Currency currency;
    private User user;
    private String purpose;

    public Payment(double amount, Currency currency, User user, String purpose) {
        this.amount = amount;
        this.currency = currency;
        this.user = user;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Payment [amount=" + amount +
                ", currency=" + currency
                + ", user=" + user
                + ", purpose=" + purpose
                + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment payment)) return false;
        return Double.compare(payment.amount, amount) == 0 && currency == payment.currency && user.equals(payment.user) && purpose.equals(payment.purpose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency, user, purpose);
    }

    @Override
    public Payment clone() {
        try {
            return (Payment)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
