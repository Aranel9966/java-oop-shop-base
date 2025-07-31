package org.lessons.java.shop;

public class Smartphone extends Prodotto {

    private String codIMEI;
    private int memoria;

    public Smartphone(String nome, String marca, double prezzo, int iva, String codIMEI, int memoria) {
        super(nome, marca, prezzo, iva);
        this.codIMEI = codIMEI;
        this.memoria = memoria;
        // TODO Auto-generated constructor stub
    }

    public String getCodIMEI() {
        return this.codIMEI;
    }

    public int getMemoria() {
        return this.memoria;
    }

    public void setCodIMEI(String cod) {
        this.codIMEI = cod;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

}
