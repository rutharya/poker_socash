package com.ruthvikarya.socashpoker;

// I will need a CARD class -> it has a value and suite
// value =  2-10,11,12,13,14 (A > K > Q > J > 10...2)
// suite =  Hearts,Spades,Clubs,Diamonds

public class Card {
    private int value;
    private String suite;

    // constructor
    public Card(int value, String suite) {
        this.value = value;
        this.suite = suite;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public String getSuite() {
        return this.suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String toString() {
        // 2 of Spade
        // 5 of Diamond
        // 11 of Hearts
        return Integer.toString(this.value) + "of " + this.suite;
    }





}
