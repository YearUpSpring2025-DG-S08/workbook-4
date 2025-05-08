package com.pluralsight;

// this class will handle each new player that plays Blackjack
public class Player {
    
    private String playerName;
    private boolean hasCards;
    // this variable allows the usage of the Hand class methods
    // this is NOT the same as an instance of a class
    private Hand playerHand;


    // overloaded player default method
    public Player(){
        this.hasCards = false;
        // we finally instantiate a class when a Player is created
        this.playerHand = new Hand();
    }
    public Player(String playerName){
        this.playerName = playerName;
        this.hasCards = false;
//        this.playerHand = new Hand();
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    // this method will determine if a player needs a set of cards
    public boolean HasCards() {
        if(playerHand.getSize() == 0){
            return hasCards;
        } else{
            return true;
        }
    }
    
    // this method uses another method from the Hand class to give a player cards
    // switched method to return as a Card
    public Card addCardToHand(Card card) {
        // the player is dealt a card and alters the hasCards boolean to true
        // added logic so that if the player has less than 2 cards, they will be dealt 2 cards
        playerHand.deal(card);
        card.flip();
        hasCards = true;
        return card;
    }
    
    // this method will allow the Main method access to the Hand class through the Player
    public Hand getPlayerHand() {
        return playerHand;
    }
    
    // add toString method
    @Override
    public String toString() {
        return playerName + "'s total hand is: " + playerHand.getValue();
    }
    
    public String toString(Player player){
        return playerName + " is the winner!";
    }
}
