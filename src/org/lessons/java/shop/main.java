package org.lessons.java.shop;

import java.util.Random;

public class main {

    public static void main(String[] args) {
        int id = 0;
        Random randomNumber = new Random();
        id = randomNumber.nextInt(50);
        Prodotto scarpa = new Prodotto(id, "Jordan", "scarpe belle", 70, 20);

        System.out.println(scarpa.getNome());
        System.out.println(scarpa.getDescrizione());
        System.out.println(scarpa.getCodice());
        System.out.println(scarpa.getCodName());
        System.out.println(scarpa.getPrezzo());
        System.out.println(scarpa.getPrezzoIva());

        scarpa.setNome("Super");
        System.out.println(scarpa.getNome());
        scarpa.setDescrizione("scarpe burtte");
        System.out.println(scarpa.getDescrizione());
        scarpa.setPrezzo(120.32);
        System.out.println(scarpa.getPrezzo());
        scarpa.setIva(30);
        System.out.println(scarpa.getIva());

    }
}
