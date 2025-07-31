package org.lessons.java.shop;

import java.util.Random;

public class main {

    public static void main(String[] args) {
        // int id = 0;
        // Random randomNumber = new Random();
        // id = randomNumber.nextInt(50);
        Prodotto scarpa = new Prodotto("Jordan", "scarpe belle", 70, 20);

        System.out.println(scarpa.getNome());
        System.out.println(scarpa.getMarca());
        System.out.println(scarpa.getCodice());
        System.out.println(scarpa.getCodName());
        System.out.println(scarpa.getPrezzo());
        System.out.println(scarpa.getPrezzoIva());

        scarpa.setNome("Super");
        System.out.println(scarpa.getNome());
        scarpa.setMarca("scarpe burtte");
        System.out.println(scarpa.getMarca());
        scarpa.setPrezzo(120.32);
        System.out.println(scarpa.getPrezzo());
        scarpa.setIva(30);
        System.out.println(scarpa.getIva());

        Cuffie cuffieSm = new Cuffie("cuffieSm", "samsung", 123.0, 20, "nere", true);
        System.out.println(String.format("prodotto: %s", cuffieSm.getCodName()));
        Smartphone s25 = new Smartphone("s25", "samsung", 723.0, 20, "st342", 123);
        System.out.println(String.format("prodotto: %s", s25.getCodName()));
    }
}
