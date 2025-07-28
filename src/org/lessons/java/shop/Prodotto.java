package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    int codice;
    String nome;
    String descrizione;
    double prezzo;
    int iva;
    // consturttore con parametro 
    Prodotto(int codice, String nome, String descrizione, double prezzo, int iva){
        this.codice= codice;
        this.descrizione=descrizione;
        this.nome= nome;
        this.prezzo=prezzo;
        this.iva=iva;

        
    };

    public void printPrezzo(){
        System.out.println("prezzo: "+ prezzo + " euro");
    }

    public void printCodName(){
        System.out.println("codice competo prodotto: " + codice+"-"+nome);
    }

    public void printPrezzoIva(){
        double prezzoIva = prezzo * (1 + iva / 100);
        System.out.println("prezzo compreso di iva: " + prezzoIva + " euro");
    }
}

