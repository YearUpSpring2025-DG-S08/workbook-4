package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    // creating an ArrayList to add each new instance of a Player
    public static List<Player> players = new ArrayList<>();

    public static void main(String[] args) {

        // creating this instance of a deck to start a game
        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("Welcome to Pomodoro Blackjack. What is your name?");
        Player player = new Player();
        String playerName = scanner.nextLine().trim();
        player.setPlayerName(playerName);
        players.add(player);

        
        System.out.println("Will there be any other players? Y/N");
        String morePlayers = scanner.nextLine().trim().toUpperCase();

        while (!morePlayers.equalsIgnoreCase("N")) {
            if (morePlayers.equalsIgnoreCase("Y")) {
                System.out.println("What is your name?");
                Player newPlayer = new Player();
                String newPlayerName = scanner.nextLine().trim();
                newPlayer.setPlayerName(newPlayerName);
                players.add(newPlayer);
            } else {
                System.out.println("Better Luck next time!");
            }
        }

        
        // starting the game
        System.out.println("Starting game.. Dealing first cards...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        
        for(Player p : players){
            Dealer(deck, p);
            System.out.println(p);
        }
        
//        // get total value of cards so far
//        System.out.print(player);

//        Hand hand1 = new Hand();
//
//
 
        // example of a game starting
//        System.out.println("Dealing first hand......");
//        Card c1 = deck.deal();
//        Card c2 = deck.deal();
//        player.addCardToHand(c1);
//        player.addCardToHand(c2);
//         c1.flip();
//         c2.flip();
//         display(c1);
//         display(c2);

//         // get total value of cards so far
//        System.out.print(player);
        
    }
    
    public static void display(Card card){
        if(card.getSuit().equalsIgnoreCase("Hearts") || card.getSuit().equalsIgnoreCase("Diamonds")){
            System.out.println(card.getValue() + ColorCodes.RED + " " + card.getSuit() + ColorCodes.RESET);
        } else if(card.getSuit().equalsIgnoreCase("Spades") || card.getSuit().equalsIgnoreCase("Clubs")){
                System.out.println(card.getValue() + ColorCodes.WHITE + " " + card.getSuit() + ColorCodes.RESET);
        }
    }
    
    // acts as a dealer and deals cards to a player
    public static void Dealer(Deck deck, Player player){
        // the deck deals out cards that is added to the player hand
        // then flipped to reveal the card and is displayed
        // followed by receiving the total amount for that hand
        Card c1 = deck.deal();
        Card c2 = deck.deal();
        player.addCardToHand(c1);
        player.addCardToHand(c2);
        display(c1);
        display(c2);
        
        // using in class example
//        player.addCardToHand(deck.deal());
//        player.addCardToHand(deck.deal());
        
        
        
    }
}