package com.Deck_Players;

public class Dealer {
    public static void main(String[] args) {
        System.out.println("The deck will randomly print out a card from a full deck each time");

        DeckOfCards player = new DeckOfCards();
        player.deal();
    }
}
