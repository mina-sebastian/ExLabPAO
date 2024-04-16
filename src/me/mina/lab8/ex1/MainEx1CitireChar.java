package me.mina.lab8.ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainEx1CitireChar {

//    Sa se citeasca afiseze din fisierul persoaneChar.txt toate persoanele cu acelasi nume prenume
//    aici va fi citire pe char cu BufferedReader
//    Clasa principala se va numi MainEx1CitireChar.
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("persoaneChar.txt"))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if(parts[0].equals(parts[1])) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
