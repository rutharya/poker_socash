package com.ruthvikarya.socashpoker;
import java.util.Random;
// I will also need a DECK class -> it will contain an array of cards
// will be reponsible for shuffling, dealing (random) cards to players.
public class Deck {
    private Card deck[];

    private String faces[] = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private String suites[] = {"Spade","Diamond","Heart","Clubs"};


    public Deck(){
        deck = new Card[52]; // todo: magic-number, move to a const
        for(int i=0;i<deck.length;i++){
//            System.out.println("i = " +i+"  i%13 = "+ i%13  + "\t i/13 = " + i/13);
            deck[i] = new Card(faces[i%13],suites[i/13]);
        }
    }

    public void printDeck() {
        for(int i=0;i<deck.length;i++){
            System.out.println(deck[i]);
        }
    }






}
