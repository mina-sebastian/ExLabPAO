package me.mina.lab8.ex2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainEx2CitireOcteti {

    public static void main(String[] args) {

        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream("persoaneOcteti.txt"))) {
            Persoana persoana;
            while (true) {
                try {
                    persoana = (Persoana) reader.readObject();
                    if (persoana.nume.equals(persoana.prenume)) {
                        System.out.println(persoana.nume + " " + persoana.prenume + " " + persoana.varsta + " " + persoana.suma + " " + persoana.valuta);
                    }
                } catch (EOFException e) {
                    // End of file reached
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
