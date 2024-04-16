package me.mina.lab8.ex2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class MainEx2CitireOcteti {

    public static void main(String[] args) {
        List<Persoana> persoane = new ArrayList<>();
        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream("persoaneOcteti.txt"))) {
            Persoana persoana;
            while (true) {
                try {
                    persoana = (Persoana) reader.readObject();
                    persoane.add(persoana);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < persoane.size(); i++) {
            for (int j = 0; j < persoane.size(); j++) {
                if(i != j && persoane.get(i).getNume().equals(persoane.get(j).getNume()) && persoane.get(i).getPrenume().equals(persoane.get(j).getPrenume())) {
                    System.out.println(persoane.get(i));
                }
            }
        }

    }
}
