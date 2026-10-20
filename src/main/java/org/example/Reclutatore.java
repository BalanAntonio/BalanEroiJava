package org.example;

import net.datafaker.Faker;

import java.util.Random;

import static java.lang.IO.println;

public class Reclutatore {
    Faker faker; String nome; int livello; int livelloMissione;
    Random r = new Random();

    public Reclutatore(int livelloMissione){
        this.livelloMissione = livelloMissione;
        faker = new Faker();
        nome = faker.superhero().name();
        livello = r.nextInt(100)+1;
    }

    public void GeneraNuovoEroe(){
        nome = faker.superhero().name();
        livello = r.nextInt(100)+1;
    }

    public void Testa() throws EroeNonIdoneoException {
        //println("L'eroe "+nome+" e' livello "+livello);
        if(livello<livelloMissione){
            throw new EroeNonIdoneoException("L'eroe "+nome+" non e' idoneo a fare la missione. Livello: "+livello,nome,livello);
        }
        println("L'eroe "+nome+" e' idoneo per la missione. Livello: "+livello);
    }
}
