package me.mina.lab6.ex1;

public class Main {

    public static void main(String[] args) {
        Proprietar p = new Proprietar("Popescu", "Ion", 40);
        Proprietar p2 = new Proprietar("Ionescu", "Vasile", 50);

        Magazin mhp = new Magazin(100, "Magazin Haine", p, 50, 10);
        Magazin mhp_2 = new Magazin(103, "Magazin Haine", p, 900, 80);
        Magazin mcp2 = new Magazin(104, "Magazin Chimicale", p2, 100, 20);
        Magazin mcp2_2 = new Magazin(105, "Magazin Chimicale", p2, 300, 40);
        Magazin map = new Magazin(106, "Magazin Alimentar", p, 200, 30);

        mhp.setChirie(new MagazinHaine());
        mhp_2.setChirie(new MagazinHaine());
        mcp2.setChirie(new MagazinChimicale());
        mcp2_2.setChirie(new MagazinChimicale());
        map.setChirie(new MagazinAlimentar());

        ShoppingMall sm = new ShoppingMall();
        sm.addMagazin(mhp);
        sm.addMagazin(mcp2);
        sm.addMagazin(map);
        sm.addMagazin(mhp_2);
        sm.addMagazin(mcp2_2);


        System.out.println("Magazine sortate dupa nume proprietar, prenume proprietar, chiria platita");
        System.out.println(sm.sortMagazine());
        System.out.println();

        System.out.println("Magazinele proprietarului p sortate dupa numeMagazin, venit, chirie, suprafata");
        System.out.println(sm.sortMagazineProprietar(p));
        System.out.println();

        System.out.println("Magazinele proprietarului p2 sortate dupa numeMagazin, venit, chirie, suprafata");
        System.out.println(sm.sortMagazineProprietar(p2));
        System.out.println();

        System.out.println("Venit total proprietar p");
        System.out.println(sm.venitTotalProprietar(p));
        System.out.println();

        System.out.println("Venit total proprietar p2");
        System.out.println(sm.venitTotalProprietar(p2));
        System.out.println();

        System.out.println("Chirie totala proprietar p");
        System.out.println(sm.chirieTotalaProprietar(p));
        System.out.println();

        System.out.println("Chirie totala proprietar p2");
        System.out.println(sm.chirieTotalaProprietar(p2));
        System.out.println();

    }

}
