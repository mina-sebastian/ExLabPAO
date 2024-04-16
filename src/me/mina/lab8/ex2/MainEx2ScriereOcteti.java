package me.mina.lab8.ex2;

import me.mina.lab8.ex1.NumarMareException;

import java.io.*;
import java.util.Scanner;

public class MainEx2ScriereOcteti {

//    Cititi din streamul de intrare:
//    nume
//    prenume
//    varsta
//    suma
//    valuta
//
//    Daca suma > 2000 , se arunca exceptie custom si reia citirea de la capat (nu se iese din program).
//
//    Campurile de mai sus se vor scrie intr un fisier numit persoaneOcteti.txt.
//    Se va folosi scriere pe octeti (cu stream) si mapare in obiect (vezi serialization).
//
//    Clasa principala se va numi MainEx2ScriereOcteti.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("persoaneOcteti.txt"))) {
            for(int i = 0; i < 3; i++) {
                try {
                    System.out.println("Introduceti datele persoanei " + (i + 1));
                    System.out.println("Introduceti numele");
                    String nume = scanner.nextLine();
                    System.out.println("Introduceti prenumele");
                    String prenume = scanner.nextLine();
                    System.out.println("Introduceti varsta");
                    int varsta = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introduceti suma");
                    double suma = scanner.nextDouble();
                    scanner.nextLine();

                    if (suma > 2000) {
                        throw new NumarMareException();
                    }

                    System.out.println("Introduceti valuta");
                    String valuta = scanner.nextLine();

                    Persoana persoana = new Persoana(nume, prenume, varsta, suma, valuta);

                    writer.writeObject(persoana);
                    writer.flush();
                } catch (NumarMareException e) {
                    System.out.println(e.getMessage());
                    i--;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
