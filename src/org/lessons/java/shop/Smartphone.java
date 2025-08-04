package org.lessons.java.shop;

public class Smartphone extends Prodotto {

    private String codIMEI;
    private int memoria;

    public Smartphone(String nome, String marca, double prezzo, int iva, boolean tessera, String codIMEI, int memoria) {
        super(nome, marca, prezzo, iva, tessera);
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

    @Override
    public String toString() {
        return String.format("prodotto %s %s %d %.2f", super.toString(), this.getCodIMEI(), this.getMemoria(),
                this.getSconto(getPrezzo()));
    }

    @Override
    public double getSconto(double prezzo) {
        if (this.memoria < 32) {
            return prezzo - (prezzo * 5 / 100);
        } else {
            return super.getSconto(prezzo);
        }
    }

}
