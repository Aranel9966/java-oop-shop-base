package org.lessons.java.shop;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean wireless;

    public Cuffie(String nome, String marca, double prezzo, int iva, boolean tessera, String colore, boolean wireless) {
        super(nome, marca, prezzo, iva, tessera);
        // TODO Auto-generated constructor stub
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return this.colore;
    }

    public boolean getWireless() {
        return this.wireless;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

}
