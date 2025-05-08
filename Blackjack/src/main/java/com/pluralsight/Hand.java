package com.pluralsight;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<Card>();
    }

    // a Card is dealt to the Hand and the Hand stores the card
    public void deal(Card card) {
        this.cards.add(card);
    }

    public int getSize() {
        return this.cards.size();
    }

    // the Hand uses the methods of each card to determine the value of each card - adds all values
    public int getValue() {
        int total = 0;
        for (Card card : cards) {
            total += card.getPointValue();
        }
        return total;
    }
    
    // this method is unnecessary because of our display method in main
//    public String viewHand() {
//        return cards.toString() + "\nHand Total: " + getValue();
//    }
}
