package me.mina.lab7.ex1;

public enum Currency {

    USD("Statele Unite ale Americii", "USA"),
    RON("Romania", "RO"),
    EUR("Uniunea Europeana", "UE"),
    GBP("Marea Britanie", "GB"),
    TRY("Turcia", "TR");


    private final String tara;
    private final String simbol;

    Currency(String tara, String simbol) {
        this.tara = tara;
        this.simbol = simbol;
    }

    public String getTara() {
        return tara;
    }

    public String getSimbol() {
        return simbol;
    }

}
