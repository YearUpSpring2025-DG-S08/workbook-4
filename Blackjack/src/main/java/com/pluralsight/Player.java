package com.pluralsight;

// this class will handle each new player that plays Blackjack
public class Player {
    
    private int position;
    private String name;
    private boolean hasCards;
    // this variable allows the usage of the Hand class methods
    // this is NOT the same as an instance of a class
    private Hand playerHand;

    public Player(){
        this.hasCards = false;
        // we finally instantiate a class when a Player is created
        this.playerHand = new Hand();
    }
    public Player(String name, boolean hasCards){
        this.name = name;
        this.hasCards = false;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // this method will determine if a player needs a set of cards
    public boolean HasCards() {
        if(playerHand.getSize() == 0){
            return hasCards;
        } else{
            return true;
        }
    }

    public Hand getPlayerHand() {
        return playerHand;
    }
    
    // this method uses another method from the Hand class to give a player cards
    public void addCardToHand(Card card) {
        // the player is dealt a card and alters the hasCards boolean to true
        playerHand.deal(card);
        hasCards = true;
        
    }
    
    // add toString method
    @Override
    public String toString() {
        return name + " " + playerHand.viewHand();
    }
}
