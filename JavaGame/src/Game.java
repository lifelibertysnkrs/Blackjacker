/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew Erickson
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("> I AM MASSAR. \n I can currently simulate a game of blackjack. Eventually, I will use a Graphical User Interface and \n artificial intelligence to improve your chances of winning.");
        System.out.println("> How many players are there?");
        int numofplayers = scan.nextInt();
        System.out.println("How many decks would you like to use?");
        int numofdecks = scan.nextInt();
        System.out.println("lol, too bad, I can only handle one deck.");
        Deck deck = new Deck();
        
        Player players [] = new  Player[numofplayers];
        for(int i = 0; i<numofplayers-1; i++){
            players[i] = new Player(false, deck);
        }
        
        players[numofplayers-1] = new Player(true, deck);
        
        System.out.println("Analyzing visual field..."); 
        try {
            Thread.sleep(4000);        
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Taming the rhinos...");        
        try {
            Thread.sleep(4000);        
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Solving Fermat's last theorem..."); 
        try {
            Thread.sleep(4000);        
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("I now know the cards on the table");
        for(int i = 0; i<numofplayers;i++){
        System.out.println("Player " + i + " has " + players[i].getHand());
        
        }
        for(int i = 0; i<numofplayers;i++){
        System.out.println("Player " + i + " do you want to hit? Enter y for yes, punch Kevin really hard for no");
        try {
            Thread.sleep(2000);        
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Just kidding, type n for no.");
        String hitnohit = scan.nextLine();
        System.out.println("I forgot to mention, I use audio analysis along with keyboard input. Try loudly saying HIT, or NOT HIT while typing.");
        hitnohit = scan.nextLine();
        System.out.println(hitnohit);
        if(hitnohit.equals("y") || hitnohit.equals("Y")){
            players[i].hit();
            System.out.println("Confirmed. I have indeed hit it.");
        }else{
            System.out.println("wimp.");
        }
            System.out.println("Your count is " + players[i].getCount());
        }
        System.out.println("That's all I can do right now. By the way, I don't do any audio analysis. Now you just look silly.");
}
        
        
        
        
        
        
        
        
    }

