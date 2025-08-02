package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private String nome;
    private int codice;
    private String marca;
    private double prezzo;
    private int iva;

    // consturttore con parametro
    public Prodotto(String nome, String marca, double prezzo, int iva) {
        Random randomNumber = new Random();
        this.codice = randomNumber.nextInt(50);
        this.marca = marca;
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;

    };

    public String getNome() {
        return this.nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getCodice() {
        return this.codice;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public String getCodName() {
        return String.format("codProdotto: %s-%s ", codice, nome);
    }

    public String getPrezzoIva() {
        String prezzoIva = "prezzo compreso di iva: " + (((prezzo * iva) / 100) + prezzo) + " euro";
        return prezzoIva;
    }

    public int getIva() {
        return iva;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return String.format(" %s %s %.2f %d", this.getNome(), this.getMarca(),
                this.getPrezzo(), this.getIva());
    }
}
