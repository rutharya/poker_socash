package com.ruthvikarya.socashpoker;

// I will need a CARD class -> it has a value and suite
// value =  2-10,11,12,13,14 (A > K > Q > J > 10...2)
// suite =  Hearts,Spades,Clubs,Diamonds

public class Card {
    private String face;
    private String suite;

    // constructor
    public Card(String face, String suite) {
        this.face = face;
        this.suite = suite;
    }

    public String getFace() {
        return this.face;
    }

    public void setFace(String face){
        this.face = face;
    }

    public String getSuite() {
        return this.suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public int getRealValue(String face) {
        switch(face) {
            case "A" : return 14;
            case "K" : return 13;
            case "Q" : return 12;
            case "J" : return 11;
            default  : return Integer.parseInt(face);
        }
    }
    public String toString() {
        // 2 of Spade
        // 5 of Diamond
        // 11 of Hearts
        return this.face + " of " + this.suite;
    }





}
