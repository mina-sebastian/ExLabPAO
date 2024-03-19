package me.mina.lab4.exInterfete;

public class Application {

    public static void main(String[] args) {
        Cerc c = new Cerc(10);
        Patrat p = new Patrat(4);

        System.out.println(c.calculPerimetru());
        System.out.println(p.calculPerimetru());
    }

}
