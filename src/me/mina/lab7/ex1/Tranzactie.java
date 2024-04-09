package me.mina.lab7.ex1;

public class Tranzactie extends ConversieCurrencyImpl implements Cloneable{
    private int id;
    private Payment payment;
    private Currency currency;
    private double amount;
    private String refNmb;

    public Tranzactie(int id, Payment payment) {
        this.id = id;
        this.payment = payment;
        this.currency = Currency.EUR;
        this.amount = conversieValutaToEur(payment.getAmount(), payment.getCurrency());
    }

    public int getId() {
        return id;
    }

    public Payment getPayment() {
        return payment;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public String getRefNmb() {
        return refNmb;
    }

    public void setRefNmb(String refNmb) {
        this.refNmb = refNmb;
    }

    public void setAmount(double amount) {
        this.payment.setAmount(amount);
        this.amount = conversieValutaToEur(payment.getAmount(), payment.getCurrency());
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "id=" + id +
                ", payment=" + payment +
                ", currency=" + currency +
                ", amount=" + amount +
                ", refNmb='" + refNmb + '\'' +
                '}';
    }

    @Override
    public Tranzactie clone() {
        try {
            Tranzactie tranzactie = (Tranzactie) super.clone();
            tranzactie.payment = payment.clone();
            return tranzactie;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
