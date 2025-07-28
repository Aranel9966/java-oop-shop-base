package org.lessons.java.shop;

import java.util.Random;

public class main {

    public static void main(String[] args) {
        int id= 0;
        Random randomNumber = new Random();
        id = randomNumber.nextInt(50);
        Prodotto scarpa = new Prodotto(id, "jordan", "scarpe belle", 70, 20);
        
        // System.out.println("prezzo:"+ scarpa.prezzo + " euro");
        scarpa.printPrezzo();
        scarpa.printCodName();
        scarpa.printPrezzoIva();;
        
    }
}
