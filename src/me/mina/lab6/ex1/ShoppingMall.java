package me.mina.lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShoppingMall {

    private List<Magazin> magazine;

    public ShoppingMall() {
        magazine = new ArrayList<>();
    }

    public ShoppingMall(List<Magazin> magazine) {
        this.magazine = magazine;
    }

    public List<Magazin> getMagazine() {
        return magazine;
    }

    public void setMagazine(List<Magazin> magazine) {
        this.magazine = magazine;
    }

    public void addMagazin(Magazin magazin) {
        magazine.add(magazin);
    }


    //lista de magazine sortata dupa: nume proprietar, prenume proprietar, chiria platita. Se foloseste Comparator.
    public List<Magazin> sortMagazine() {
        magazine.sort(
                Comparator.comparing(Magazin::getProprietar, Comparator.comparing(Proprietar::getNume))
                .thenComparing(Magazin::getProprietar, Comparator.comparing(Proprietar::getPrenume))
                .thenComparing(Magazin::getChirie));

        return magazine;
    }

    //lista de magazine ale unui proprietar, afisare sortata dupa numeMagazin, venit, chirie, suprafata. Se foloseste Comparator.
    public List<Magazin> sortMagazineProprietar(Proprietar proprietar) {
        List<Magazin> magazineProprietar = new ArrayList<>();
        for (Magazin magazin : magazine) {
            if (magazin.getProprietar().equals(proprietar)) {
                magazineProprietar.add(magazin);
            }
        }
        magazineProprietar.sort(
                Comparator.comparing(Magazin::getNumeMagazin)
                .thenComparing(Magazin::getVenit)
                .thenComparing(Magazin::getChirie)
                .thenComparing(Magazin::getSuprafata));

        return magazineProprietar;
    }

    //venitul total obtinut de un proprietar
    public int venitTotalProprietar(Proprietar proprietar) {
        return magazine.stream()
                .filter(magazin -> magazin.getProprietar().equals(proprietar))
                .mapToInt(Magazin::getVenit)
                .sum();
    }

    //chiria totala platita de un proprietar
    public int chirieTotalaProprietar(Proprietar proprietar) {
        return magazine.stream()
                .filter(magazin -> magazin.getProprietar().equals(proprietar))
                .mapToInt(Magazin::getChirie)
                .sum();
    }
}
