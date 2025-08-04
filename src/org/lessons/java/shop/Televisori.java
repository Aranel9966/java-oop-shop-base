package org.lessons.java.shop;

public class Televisori extends Prodotto {
    private double dimensione;
    private boolean smart;

    public Televisori(String nome, String marca, double prezzo, int iva, boolean tessera, double dimensione,
            boolean smart) {
        super(nome, marca, prezzo, iva, tessera);
        // TODO Auto-generated constructor stub
    }

    public double getDimensione() {
        return this.dimensione;
    }

    public boolean getSmart() {
        return this.smart;
    }

    public void setDimensione(double dimensione) {
        this.dimensione = dimensione;

    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
