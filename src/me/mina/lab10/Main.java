package me.mina.lab10;

//   1.Sa se defineasca un array de Integers.
//  Sa se sorteze descrescator folosind lambda expression
//  Sa se calculeze suma intregilor folosind reduce
//  Sa se calculeze suma intregilor folosind summingInt
//  Sa se calculeze media folosind lambda averagingInt
//  Sa se afiseze min folosind lambda.
//  Sa se afiseze max folosind lambda
//  Sa se afiseze intregii mai mari de o anumita valoare folosind filter



//2. Se defineste un array de primitive int
//        sa se sorteze crescator
//        Sa se sorteze descrescator -> se foloseste stream
//        Lista cu elementele ar2 ridicate la patrat (map)



//3. Se defineste o lista de obiecte Magazin
//        Magazin are: numeMagazin, numarAngajati
//
//        sa se afiseze magazinele grupate by numarAngajati
//        sa se afiseze suma angajatilor din toate magazinele

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class Main {
    public static void ex1(){
        Integer[] integers = {45, 21, 3, 4, 52, 6, 17, 8, 9, 100};

        // Sortare descrescatoare
        System.out.println("Sortare descrescatoare:");
        Arrays.sort(integers, (o1, o2) -> o1 > o2 ? -1 : 1);
        Arrays.stream(integers).forEach(System.out::println);

        // Suma intregilor folosind reduce
        System.out.println("Suma intregilor folosind reduce:");
        int suma = 0;
        suma = Arrays.stream(integers).reduce(0, Integer::sum);
        System.out.println(suma);

        // Suma intregilor folosind summingInt
        System.out.println("Suma intregilor folosind summingInt:");
        suma = Arrays.stream(integers).collect(summingInt(Integer::intValue));
        System.out.println(suma);

        // Media folosind lambda averagingInt
        System.out.println("Media folosind lambda averagingInt:");
        double media = Arrays.stream(integers).collect(averagingInt(Integer::intValue));
        System.out.println(media);

        // Min folosind lambda
        System.out.println("Min folosind lambda:");
        int min = Arrays.stream(integers).min((o1, o2) -> o1 > o2 ? 1 : -1).get();
        System.out.println(min);

        // Max folosind lambda
        System.out.println("Max folosind lambda:");
        int max = Arrays.stream(integers).min((o1, o2) -> o1 > o2 ? -1 : 1).get();
        System.out.println(max);

        // Intregii mai mari de o anumita valoare folosind filter
        System.out.println("Intregii mai mari de o anumita valoare folosind filter:");
        int valoare = 40;
        Arrays.stream(integers).filter(i -> i > valoare).forEach(System.out::println);
    }

    public static void ex2(){
        int[] ar2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Sortare crescatoare
        System.out.println("Sortare crescatoare:");
        Arrays.sort(ar2);
        Arrays.stream(ar2).forEach(System.out::println);

        // Sortare descrescatoare
        System.out.println("Sortare descrescatoare:");
        Arrays.stream(ar2)
                .boxed()
                .sorted((o1, o2) -> o1 > o2 ? -1 : 1)
                .forEach(System.out::println);

        // Ridicarea la patrat
        System.out.println("Ridicarea la patrat:");
        Arrays.stream(ar2).map(i -> i * i).forEach(System.out::println);
    }

    public static void ex3(){
        Magazin[] magazine = {
                new Magazin("Magazin1", 10),
                new Magazin("Magazin2", 20),
                new Magazin("Magazin3", 30),
                new Magazin("Magazin4", 40),
                new Magazin("Magazin5", 50),
                new Magazin("Magazin6", 60),
                new Magazin("Magazin7", 70),
                new Magazin("Magazin8", 80),
                new Magazin("Magazin9", 100),
                new Magazin("Magazin10", 100)
        };

        // Magazinele grupate dupa numarAngajati
        System.out.println("Magazinele grupate by numarAngajati:");
        Arrays.stream(magazine).collect(groupingBy(Magazin::getNumarAngajati))
                .forEach((nrAng, listaMagazine) -> System.out.println(nrAng + " -> " + listaMagazine));

        // Suma angajatilor din toate magazinele
        System.out.println("Suma angajatilor din toate magazinele:");
        int suma = Arrays.stream(magazine).map(Magazin::getNumarAngajati).reduce(0, Integer::sum);
        System.out.println(suma);
    }

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }
}
