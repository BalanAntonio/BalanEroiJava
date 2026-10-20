package org.example;

public class EroeNonIdoneoException extends Exception {
    String nomeEroe;
    int livello;

    public EroeNonIdoneoException(String message,String nomeEroe,int livello) {
        this.nomeEroe = nomeEroe;
        this.livello=livello;
        super(message);
    }
}
