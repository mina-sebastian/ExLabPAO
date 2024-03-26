package me.mina.lab5.ex2;

import java.util.Arrays;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
        String str = "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";

        System.out.println("Lungimea sirului: "+str.length());
        System.out.println("Doar litere mari si litere mici: "+str.replaceAll("[. ]*","").matches("[a-zA-Z]*"));

        String[] splits = str.split(" ");
        System.out.println("Cuvintele din mijloc: "+splits[splits.length/2-1]+" "+splits[splits.length/2]);

        StringBuilder sb = new StringBuilder(str);
        System.out.println("Sirul inversat: "+sb.reverse());
    }
}
