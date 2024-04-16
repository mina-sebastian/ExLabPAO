package me.mina.lab8.ex1;

import me.mina.lab8.ex2.Persoana;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainEx1CitireChar {

//    Sa se citeasca afiseze din fisierul persoaneChar.txt toate persoanele cu acelasi nume prenume
//    aici va fi citire pe char cu BufferedReader
//    Clasa principala se va numi MainEx1CitireChar.
    public static void main(String[] args) {
        List<Persoana> persoane = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("persoaneChar.txt"))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                persoane.add(new Persoana(parts[0], parts[1], Integer.parseInt(parts[2]), Double.parseDouble(parts[3]), parts[4]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < persoane.size(); i++) {
            for(int j = 0; j < persoane.size(); j++) {
                if(i != j && persoane.get(i).getNume().equals(persoane.get(j).getNume()) && persoane.get(i).getPrenume().equals(persoane.get(j).getPrenume())) {
                    System.out.println(persoane.get(i));
                }
            }
        }
    }

}
