package com.ruthvikarya.socashpoker;

public class Poker {
    // each game starts with shuffling the full deck, => each game has 1 deck of cards.
    private Deck deck;
    private Player[] players;

    // then all players are dealt their hands => there are 4 players in the game


    public Poker() {
        // initialize a new deck of cards
        deck = new Deck();
        // 4 players play the game
        players = new Player[4];
        for(int i =0;i<4;i++){
            // initialize all 4 players
            players[i] = new Player();
        }
    }



}
