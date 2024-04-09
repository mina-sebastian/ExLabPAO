package me.mina.lab7.ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

//Flow
//Userul va face o plata.
//Din plata se va produce o tranzactie.
//In prima faza refNmb este null.
//Userul face cateva plati. Pentru unele plati se razgandeste si vrea banii inapoi.
//Pentru asta se face stornare.
//
//Daca vrem stornam tranzactia:
//Pentru asta se va face o copie a tranzactiei (cu Cloneable),
//care va avea amount cu minus (inclusiv in plata), iar refNmb va fi id-ul tranzactiei originale.
//
//1) Facem mai multe plati si vor rezulta mai multe tranzactii. Cateva tranzactii le stornam.
//  Dupa stornare (nu inainte), afisam tranzactia initiala si tranzactia finala.
//2) Sa se afiseze lista tarilor/zonei pentru care s-au facut plati
//3) Sa se afiseze Tranzactiile facute pentru un user, amountul si valuta in care a platit initial.
//(se cauta in tranzactii deoarece e posibil ca unele plati sa nu fie finalizate cu tranzactie)

    public static List<Tranzactie> tranzactii = new ArrayList<>();
    public static void main(String[] args) {
        User u1 = new User("Popescu", "Ion", "RO123456789");
        User u2 = new User("Ionescu", "Vasile", "RO987654321");

        Payment p1 = new Payment(100, Currency.EUR, u1, "Haine");
        Payment p2 = new Payment(200, Currency.USD, u2, "Mancare");
        Payment p3 = new Payment(300, Currency.GBP, u1, "Transport");
        Payment p4 = new Payment(400, Currency.TRY, u2, "Haine");
        Payment p5 = new Payment(500, Currency.EUR, u1, "Transport");
        Payment p6 = new Payment(600, Currency.RON, u2, "Mancare");
        Payment p7 = new Payment(700, Currency.TRY, u1, "Transport");

        Tranzactie t1 = new Tranzactie(1, p1);
        Tranzactie t2 = new Tranzactie(2, p2);
        Tranzactie t3 = new Tranzactie(3, p3);
        Tranzactie t4 = new Tranzactie(4, p4);
        Tranzactie t5 = new Tranzactie(5, p5);
        Tranzactie t6 = new Tranzactie(6, p6);
        Tranzactie t7 = new Tranzactie(7, p7);

        Tranzactie t1Stornata = stornare(t1);
        Tranzactie t4Stornata = stornare(t4);
        Tranzactie t6Stornata = stornare(t6);
        Tranzactie t7Stornata = stornare(t7);

        tranzactii.add(t1);
        tranzactii.add(t2);
        tranzactii.add(t3);
        tranzactii.add(t4);
        tranzactii.add(t5);
        tranzactii.add(t6);
        tranzactii.add(t7);
        tranzactii.add(t1Stornata);
        tranzactii.add(t4Stornata);
        tranzactii.add(t6Stornata);
        tranzactii.add(t7Stornata);

        //Afisarea tranzactiilor
        System.out.println("Tranzactii:");
        for (Tranzactie t : tranzactii) {
            System.out.println(t);
        }
        System.out.println();

        //Afisarea tarilor/zonei pentru care s-au facut plati
        System.out.println("Tari/Zone:");
        tranzactii.stream()
                .map(t -> t.getPayment().getCurrency().getTara())
                .distinct()
                .forEach(System.out::println);


        //Tranzactii pentru fiecare user
        List<User> users = new ArrayList<>();
        tranzactii.stream().map(t -> t.getPayment().getUser()).forEach(u -> {
            if (!users.contains(u)) {
                users.add(u);
            }
        });
        System.out.println();

        users.forEach(u -> {
            System.out.println("User: " + u.getNume() + " " + u.getPrenume());
            tranzactii.stream().filter(t -> t.getPayment().getUser().equals(u)).forEach(t -> {
                System.out.println(t.getPayment().getAmount() + " " + t.getPayment().getCurrency());
            });
            System.out.println();
        });

    }

    public static Tranzactie stornare(Tranzactie t){
        Tranzactie tStornata = t.clone();
        tStornata.setAmount(-t.getPayment().getAmount());
        tStornata.setRefNmb(t.getId() + "");
        return tStornata;
    }

}
