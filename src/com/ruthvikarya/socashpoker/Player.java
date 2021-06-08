package com.ruthvikarya.socashpoker;
// I will need PLAYERS class - each player has a hand of 3 cards dealt.
public class Player {
    private Card hand[];

    public Player() {
        hand = new Card[3];
    }

    public Card[] getHand() {
        return hand;
    }

    public String toString() {
        return this.hand[0] + "||" + this.hand[0] + "||" +this.hand[0];
    }
}
