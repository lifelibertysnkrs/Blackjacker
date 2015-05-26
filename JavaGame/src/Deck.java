/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joe Parkhill
 */
import java.util.ArrayList;
public class Deck 
{
    private ArrayList<CardObject> deck = new ArrayList<CardObject>();
    private int cards;
    
    public Deck()
    {
        //Keeps track of the cards in the deck
        cards = 52;

        
        //The deck is instantiated with two nested for loops
        //The first for loop is to run through each of the suits
        //The second for loop is to run through each of the face values
        for(int i = 1; i < 5; i++)
        {
            for(int j = 1; j < 14; j++)
            {
                deck.add(new CardObject(j,i));
            }
            
            
        }
    }
    
    public void Shuffle()
    {
        
        //A copy of the deck is created to transfer cards
        ArrayList<CardObject> DummyDeck = new ArrayList<CardObject>();
        
        
        //Here every card of the array list is removed
        //it will then have CardObjects from the DummyDeck added to it
        int i = 0;
        while(deck.size() > 0)
        {
            int Random = (int) Math.random()*(deck.size());
            DummyDeck.add(deck.remove(Random));   
        }
        
        deck = DummyDeck;
    }

    public CardObject Draw()
    {
        ArrayList<CardObject> DummyDeck = new ArrayList<CardObject>();
        
        for(int i = 0; i < deck.size(); i++)
        {
            DummyDeck.add(deck.get(i));
        }
        
        deck.remove(0);
        
        return DummyDeck.get(0);
    }
    
    
    public void Repopulate()
    {
        for(int i = 1; i < 5; i++)
        {
            for(int j = 1; j < 14; j++)
            {
                deck.add(new CardObject(j,i));
            }
            
            
        }
        
        cards = 52;
    }
    
    public int getCard()
    {
        return cards;
    }
}
