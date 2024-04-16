package me.mina.lab8.ex2;

import java.io.Serializable;

public class Persoana implements Serializable {

    String nume;
    String prenume;
    int varsta;
    double suma;
    String valuta;

    public Persoana(String nume, String prenume, int varsta, double suma, String valuta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.suma = suma;
        this.valuta = valuta;
    }

}
