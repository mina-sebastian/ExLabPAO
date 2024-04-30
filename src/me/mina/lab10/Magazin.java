package me.mina.lab10;

public class Magazin {
//    Magazin are: numeMagazin, numarAngajati

    public String numeMagazin;
    public int numarAngajati;

    public Magazin(String numeMagazin, int numarAngajati) {
        this.numeMagazin = numeMagazin;
        this.numarAngajati = numarAngajati;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public String toString() {
        return "Magazin{" +
                "numeMagazin='" + numeMagazin + '\'' +
                ", numarAngajati=" + numarAngajati +
                '}';
    }

}
