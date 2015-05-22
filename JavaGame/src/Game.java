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
        
        System.out.println("How many players are there?");
        int numofplayers = scan.nextInt();
        System.out.println("How many decks would you like to use?");
        int numofdecks = scan.nextInt();
        
        ArrayList<CardObject> deck = new ArrayList<CardObject>();
        for(int i = 0; i < numofdecks; i ++)
        {
            deck.add(Deck);
        }
        
        
        
    }
}
