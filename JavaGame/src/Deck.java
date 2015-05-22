/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joe Parkhill
 */
public class Deck 
{
    private CardObject[] deck = new CardObject[52];
    private int cards;
    
    public Deck()
    {
        //Keeps track of the cards in the deck
        cards = 52;
        
        //The z acts as a tracker for where in the deck array to instantiate the CardObject
        int z = 0;
        
        //The deck is instantiated with two nested for loops
        //The first for loop is to run through each of the suits
        //The second for loop is to run through each of the face values
        for(int i = 1; i < 5; i++)
        {
            for(int j = 2; j < 14; j++)
            {
                deck[z] = new CardObject(j,i);
                
                z++;
            }
            
            z++;
        }
    }
    
    public void Shuffle()
    {
        CardObject[] d = deck;
        
        //A copy of the deck d is created to transfer cards
        CardObject[] DummyDeck = d;
        
        
        //Here every point in the original array is set to null
        //it will then have CardObjects from the DummyDeck placed in it
        for(int i = 0; i < d.length; i++)
        {
            d[i] = null;
        }
        
        //This is a tracker to make sure that there will not be an out of bounds
        //error exception
        int tracker = 0;
        
        while(tracker < 52)
        {
            //The random number is placed in this point of the while loop so that
            //if that point in the array is taken the loop will repeat continually
            // running until it hits an un occupied spot
            int Random = (int) Math.random()*52;
            
            //Check is the location is not taken
            if(d[Random] == null)
            {
                
                //Copies the card from the DummyDeck into d and then removes it from
                //the DummyDeck, the tracker makes sure there isn't a null pointer
                //exception
                d[Random] = DummyDeck[tracker];
                DummyDeck[tracker] = null;
                tracker++;
            }
        }
        //The deck is now replaced with the shuffled version
        deck = d;
    }

    public CardObject Draw()
    {
        //There is going to be a problem is the deck actually runs out
        //because then I won't be able to return anything
        //i acts as a counter for the while loop
        int i = 0;
        
        //the loops runs for locations 0-51
        while(i < 51)
        {
            //Tracks the cards in the deck
            cards--;
            //if a card exists at i then it returns the card at i
            if(deck[i] != null)
                return deck[i];
            
            i++;
            
        }
        
        cards--;
        return deck[51];
        
    }
    
    
    public void Repopulate()
    {
        int z = 0;
        
        for(int i = 1; i < 5; i++)
        {
            for(int j = 2; j < 14; j++)
            {
                deck[z] = new CardObject(j,i);
                
                z++;
            }
            
            z++;
        }
        
        cards = 52;
    }
}
