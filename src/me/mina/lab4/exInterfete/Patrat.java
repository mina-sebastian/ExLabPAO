package me.mina.lab4.exInterfete;

public class Patrat implements Calcul{
    private double ln;
    public Patrat(double ln){
        this.ln = ln;
    }
    @Override
    public double calculPerimetru() {
        return (2*ln)+(2*ln);
    }
}
