package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    // consturttore con parametro
    Prodotto(int codice, String nome, String descrizione, double prezzo, int iva) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;

    };

    public String getNome() {
        return this.nome;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public int getCodice() {
        return this.codice;
    }

    public String getPrezzo() {
        String prezzoCompeto = "prezzo: " + prezzo + " euro";
        return prezzoCompeto;
    }

    public String getCodName() {
        String codName = "codice competo prodotto: " + codice + "-" + nome;
        return codName;
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

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

}
