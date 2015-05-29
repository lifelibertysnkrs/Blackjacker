
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
    private boolean DealerStatus;
    boolean bust;
    boolean quit;
    public Player(boolean isDealer, Deck deck1, boolean isBust, boolean isQuit){
        DealerStatus = isDealer;
        bust = isBust;
        quit = isQuit;
        deck = deck1;
        hand.add(deck.Draw());
        hand.add(deck.Draw());
            
        }
    
    public int getCount(){
        int count = 0;
        for(CardObject card:hand){
           count += card.getPointVal(); 
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
         if(DealerStatus){
             handstring = hand.get(0).toString() + " and one hidden card";
         }
         return handstring;
         
     
     }
    public boolean getBust(){
        return bust;
    }
    public boolean getQuit(){
        return quit;
    }
    public void buster(){
        bust = true;
    }
    public void quitter(){
        quit = true;
    }
    
    public void DealerSwitch()
    {
        if(DealerStatus == true)
            DealerStatus = false;
        DealerStatus = true;
    }
}
