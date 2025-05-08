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
        players.add(new Player(playerName, false));

        
        for(Player name : players){
            System.out.println(name.getName());
        }
        
        
        // we're using the setter to set the name that was inputted by the user
        // needed help understanding what the purpose of a setter was and when to use it
//        player.setName(playerName);
//        players.add(player);
//
//        for(Player playerEx : players){
//            System.out.println(playerEx.getName());
//        }

//        System.out.println("Are you sure that's the name you want? You can update if you like");
//        playerName = scanner.nextLine().trim();
//        player.setName(playerName);
//        players.add(player);

//        System.out.println(player);

//        for(Player playerEx : players){
//            System.out.println(playerEx.getName());
//        }

        
//        String morePlayers;
//        do {
//            System.out.println("Will there be any other players? Y/N");
//            morePlayers = scanner.nextLine().trim().toUpperCase();
//
//            switch (morePlayers) {
//                case "Y":
//                    System.out.println("What is your name?");
//                    String newPlayerName = scanner.nextLine().trim();
//                    players.add(new Player(playerName, false));
//                    break;
//                case "N":
//                    break;
//                default:
//                    System.out.println("Will there be new players or not?");
//                    break;
//            }
//        } while (morePlayers != "N");


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
//         
//         // get total value of cards so far
//        System.out.print(player);
        
         
//
//        Card c2 = deck.deal();
//        c2.flip();
//
//        display(c2);
//
//        hand1.deal(c1);
//        hand1.deal(c2);

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

//        int handValue = hand1.getValue();
//        System.out.println("This hand is worth " + handValue);
    }
    
    public static void display(Card card){
        if(card.getSuit().equalsIgnoreCase("Hearts") || card.getSuit().equalsIgnoreCase("Diamonds")){
            System.out.println(card.getValue() + ColorCodes.RED + " " + card.getSuit() + ColorCodes.RESET);
        } else if(card.getSuit().equalsIgnoreCase("Spades") || card.getSuit().equalsIgnoreCase("Clubs")){
                System.out.println(card.getValue() + ColorCodes.WHITE + " " + card.getSuit() + ColorCodes.RESET);
        }
    }
    
    // the following methods are examples of overloading 
//    public void test(String input){
//        System.out.println("TEst method 1: " + input);
//    }
//    
//    public String test(){
//        return "test method 2";
//    }
//    public void test(int num){
//        int total = num + 100;
//        System.out.println(total);
//    }
    
}