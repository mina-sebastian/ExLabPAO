package me.mina.lab8.ex1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Cititi din streamul de intrare:
// nume
// prenume
// varsta
// suma
// valuta
//
//Daca suma > 2000 , se arunca exceptie custom si reia citirea de la capat (nu se iese din program).
//
//Campurile de mai sus se vor scrie intr un fisier numit persoaneChar.txt utilizand separatorul ; intre campuri.
//Pentru fiecare persoana se va scrie cate un rand.
//Se va folosi scriere pe caractere, cu BufferedWriter.
//
//Clasa principala se va numi MainEx1ScriereChar.

public class MainEx1ScriereChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("persoaneChar.txt", true))) {
            for(int i = 0; i < 5; i++) {
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

                writer.write(nume + ";" + prenume + ";" + varsta + ";" + suma + ";" + valuta + "\n");
            }
        } catch (NumarMareException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
