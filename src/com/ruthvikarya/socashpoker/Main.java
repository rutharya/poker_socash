package com.ruthvikarya.socashpoker;

public class Main {

    public static void main(String[] args) {

        System.out.println("PartyNight fun - SoCash_Poker!!");

        // 1. Use a standard deck of cards (no Joker)
            // I will need a CARD class -> it has a value and suite
                    // value =  2-10,11,12,13,14 (A > K > Q > J > 10...2)
                    // suite =  Hearts,Spades,Clubs,Diamonds
            // I will also need a DECK class -> it will contain an array of cards
                    // will be reponsible for shuffling, dealing (random) cards to players.

        // 2. To start a game,
            // I will need PLAYERS class - each player has a hand of 3 cards dealt.
            // I will also need a SOCASH_POKER game class -
                // each game starts with shuffling the full deck,
                // then all players are dealt their hands
                // check is made to seee who the winner is.

                // a game of poker ends with multiple rounds played. so,
                // create a construct of best of 5 rounds for the party game.

        int round = 1; // todo : lets make it so that we can play multiple rounds
        // start a game of poker
        Poker game = new Poker();

        // todo: game.dealCards();
        // todo:  game.printResult();

    }
}
