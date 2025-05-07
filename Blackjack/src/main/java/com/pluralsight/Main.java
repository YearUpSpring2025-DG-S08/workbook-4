package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();
        
        Hand hand1 = new Hand();
   
        
        Card c1 = deck.deal();
        c1.flip();

        display(c1);
        
        Card c2 = deck.deal();
        c2.flip();
        
        display(c2);

        hand1.deal(c1);
        hand1.deal(c2);
        
//        // deal 5 cards;
//        for(int i = 0; i < 5; i++){
//            // get a card from the deck
//            Card card = deck.deal();
//            card.flip();
//            System.out.println(card.getSuit());
//            System.out.println(card.getValue());
//            // deal that card to the hand
//            hand1.deal(card);
//        }
        
        int handValue = hand1.getValue();
        System.out.println("This hand is worth " + handValue);
    }
    
    public static void display(Card card){
        if(card.getSuit().equalsIgnoreCase("Hearts") || card.getSuit().equalsIgnoreCase("Diamonds")){
            System.out.println(card.getValue() + ColorCodes.RED + " " + card.getSuit() + ColorCodes.RESET);
        } else if(card.getSuit().equalsIgnoreCase("Spades") || card.getSuit().equalsIgnoreCase("Clubs")){
            System.out.println(card.getValue() + ColorCodes.BLACK + " " + card.getSuit() + ColorCodes.RESET);
        }
    }
}