package me.mina.lab7.ex1;

public class ConversieCurrencyImpl implements ConversieCalcul{

    @Override
    public double conversieValutaToEur(double valoare, Currency currency) {
        return switch (currency) {
            case EUR -> valoare;
            case USD -> valoare * 0.85;
            case RON -> valoare * 0.21;
            case GBP -> valoare * 1.17;
            case TRY -> valoare * 0.11;
        };
    }

    @Override
    public double calculRata(double valoare, int perioada) {
        return 0;
    }
}
