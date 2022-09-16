package com.example.cards;

import java.util.Objects;

public class Card
{
    private Suit suit;
    private FaceValue faceValue;

    private Card() //private constructor with no formal parameters
    {

    }
    public Card(Suit suit, FaceValue faceValue) //Constructor for suit and faceValue
    {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && faceValue == card.faceValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, faceValue);
    }

    public FaceValue getFaceValue()
    {
        return faceValue;
    }

    public Suit getSuit()
    {
        return suit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("suit=")
                .append(suit);
        sb.append("faceValue=")
                .append(faceValue);
        sb.append('}');
        return sb.toString();
    }
}

