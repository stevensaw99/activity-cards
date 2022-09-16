package com.example.cards;

import javax.naming.OperationNotSupportedException;

public interface Deck
{

        //uses of a deck object (api)
        void shuffle();
        void cut(int index);
        Card deal();
        Card turnOver();
        int search(Card card);
        void newOrder(Deck cards);
        int size(); // return integer

        default int newSize() throws OperationNotSupportedException
        {
            throw new OperationNotSupportedException();
        }

}
