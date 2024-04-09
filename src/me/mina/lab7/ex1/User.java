package me.mina.lab7.ex1;

import java.util.Objects;

public class User {

    private String nume, prenume, iban;

    public User(String nume, String prenume, String iban) {
        this.nume = nume;
        this.prenume = prenume;
        this.iban = iban;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getIban() {
        return iban;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "User [nume=" + nume + ", prenume=" + prenume + ", iban=" + iban + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(nume, user.nume) && Objects.equals(prenume, user.prenume) && Objects.equals(iban, user.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume, iban);
    }
}
