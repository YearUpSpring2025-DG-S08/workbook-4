package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
        // the suit should only be known if the card is face up
        if(isFaceUp){
            return suit;
        } else{
            return "#";
        }
    }

    public String getValue() {
        // the value should only be known if the card is face up
        if(isFaceUp){
            // this is to return the String value of each card
            // A, J, Q, K, 10, 9....
            return value;
        } else{
            return "#";
        }
    }
    
    public int getPointValue() {
        // the value should only be known if the card is face up
        if (isFaceUp) {
            // the point value of cards should be returned
            switch (this.value) {
                case "A":
                    return 11;
                case "2":
                    return 2;
                case "3":
                    return 3;
                case "4":
                    return 4;
                case "5":
                    return 5;
                case "6":
                    return 6;
                case "7":
                    return 7;
                case "8":
                    return 8;
                case "9":
                    return 9;
                case "10", "J", "Q", "K":
                    return 10; // these are merged because they return the same value
            }
        } 
        return 0;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }
    
    public boolean flip(){
        this.isFaceUp = !this.isFaceUp;
        return this.isFaceUp;
    }
}
