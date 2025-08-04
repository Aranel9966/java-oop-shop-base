package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Prodotto[] carrello = new Prodotto[0];
        System.out.println("Carrello inizializzato con " + carrello.length + " prodotti.");
        Scanner scan = new Scanner(System.in);
        // Prodotto newProdotto = null;
        boolean add = true;
        while (add) {
            Prodotto[] newCarrello = new Prodotto[carrello.length + 1];
            String input = "";
            System.out.println("Inserisci il tipo di prodotto da aggiungere (telefono, televisore, cuffie) o (stop):");
            input = scan.nextLine();
            String nome = null;
            String codice = null;
            String marca = null;
            Double prezzo = null;
            int iva = 0;
            boolean tessera = true;
            if (input.equalsIgnoreCase("stop")) {
                if (carrello.length == 0) {
                    System.out.println("il carrello é vuoto.");
                } else {
                    System.out.println("nel carrello c'é:");
                    for (int i = 0; i < carrello.length; i++) {
                        System.out.println(String.format("- %s", carrello[i]));
                    }
                }
            } else {

                System.out.println("Inserisci il nome");
                nome = scan.nextLine();
                System.out.println("Inserisci il codice");
                codice = scan.nextLine();
                System.out.println("Inserisci il prezzo");
                prezzo = scan.nextDouble();
                scan.nextLine();
                System.out.println("Inserisci il marca");
                marca = scan.nextLine();
                System.out.println("Inserisci il iva");
                iva = scan.nextInt();
                scan.nextLine();
                System.out.println("hai la tessera?");
                tessera = scan.nextBoolean();
                scan.nextLine();
            }

            // tel
            switch (input) {

                case "telefono":
                    for (int i = 0; i < carrello.length; i++) {
                        newCarrello[i] = carrello[i];
                    }
                    System.out.println("Inserisci il codIMEI");
                    String codIMEI = scan.nextLine();
                    System.out.println("Inserisci la memoria");
                    int memoria = scan.nextInt();
                    scan.nextLine();
                    Smartphone telefono = new Smartphone(nome, marca, prezzo, iva, tessera, codIMEI, memoria);
                    // Smartphone s25 = new Smartphone("s25", "samsung", 723.0, 20, "st342", 123);
                    newCarrello[newCarrello.length - 1] = telefono;
                    carrello = newCarrello;

                    break;
                case "televisore":

                    break;
                case "cuffie":

                    break;

                default:
                    // for (int i = 0; i < carrello.length; i++) {
                    // System.out.println(String.format("- %s", carrello[i]));
                    // }
                    add = false;

                    break;
            }

        }

        scan.close();
    };
}
