package com.example.cards;

import java.util.*;

public class StandardDeck implements Deck
{
    List<Card> cards; //declared List of cards

    public StandardDeck()
    {
        this.cards = newDeck();
    }

    private List<Card> newDeck() //private class does not get called into any other method.
    {
        List<Card> result = new ArrayList<>(); //created list to hold cards

        Arrays.stream(Suit.values()) //Arrays needs to be imported, Suit part of enum class
                .forEach(suit -> {

                    Arrays.stream(FaceValue.values())
                            .map(faceValue -> new Card(suit, faceValue))
                            .forEach(newDeck::add);

                });
        return newDeck;
    }

    @Override
    public void shuffle()
    {
        Collections.shuffle(cards); //pass cards list
    }

    @Override
    public void cut(int index)
    {

    }

    @Override
    public Card deal()
    {
        return null;
    }

    @Override
    public Card turnOver()
    {
        return null; //returns null (any returning object)
    }

    @Override
    public int search(Card card)
    {
        return this.cards.indexOf(card);
    }

    @Override
    public void newOrder(Deck cards)
    {

    }

    @Override
    public int size()
    {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StandardDeck that = (StandardDeck) o;
        return Objects.equals(cards, that.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cards);
    }
}
