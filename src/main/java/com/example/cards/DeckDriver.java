package com.example.cards;

public class DeckDriver
{
    public static void main(String[] args) // psvm for main method
    {
        Deck cards = new StandardDeck();
        System.out.println(cards); //sout for system println

        cards.shuffle();
        System.out.println(cards); //sout for system println

    }
}
