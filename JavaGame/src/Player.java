
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul
 */
public class Player {
    private ArrayList<CardObject> hand = new ArrayList<CardObject>();
    public Deck deck;
    public Player(boolean isDealer, Deck deck1){
        boolean DealerStatus = isDealer;
        deck = deck1;
        hand.add(deck.Draw());
        hand.add(deck.Draw());
            
        }
    public int getCount(){
        int count = 0;
        for(CardObject card:hand){
           count += card.getValue(); 
        }
        return count;
    
    }
     public void hit(){
         hand.add(deck.Draw());
    }
     public String getHand(){
         String handstring = "";
         for(CardObject card:hand){
             handstring += card.toString();
             handstring += " and ";
             
         }
         return handstring;
     }
    
}
