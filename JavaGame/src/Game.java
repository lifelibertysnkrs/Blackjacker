


import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       // System.out.println("> I AM MASSAR. \n I can currently simulate a game of blackjack. Eventually, I will use a Graphical User Interface and \n artificial intelligence to improve your chances of winning.");
        System.out.println("Lets play some BlackJack");
        System.out.println("");
        System.out.println("");

        System.out.println("> How many players are there?");
        int numofplayers = scan.nextInt();
        System.out.println("");
        System.out.println("How many decks would you like to use?");
        int numofdecks = scan.nextInt();
        scan.nextLine();
        //The first deck object is created
        Deck deck = new Deck();
            
        if(numofdecks > 1)
        {
            //ArryList of deck objects is instantiated
            ArrayList<Deck> d = new ArrayList<Deck>();
            
            //The ArrayList is filled with n - 1 decks because the of the decks
            //has already been instantiated before
            for(int i = 0; i < (numofdecks - 1); i++)
            {
                
                Deck deck1 = new Deck();
                
                d.add(deck1);
            }
            
            //The decks are merged with the mergeDecks method
            deck.mergeDecks(d);
        }
        
        
        //The deck is shuffled
        deck.Shuffle();

        numofplayers ++;    // Adds a spot for the dealer at the end of the players array
        Player players [] = new  Player[numofplayers];      // Creates the array of players and dealer
        
        for(int i = 0; i<numofplayers-1; i++){      // Sets up all of the players in the array except for the last one as players
            players[i] = new Player(false, deck, false, false);
        }
        
        players[numofplayers-1] = new Player(true, deck, false, false); // Makes the last player the dealer
        Player dealer = players[numofplayers-1];
        System.out.println("Analyzing visual field..."); 
        System.out.println("");
        System.out.println("");
        try {
            Thread.sleep(1500);        
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        
        System.out.println("I now know the cards on the table");
        System.out.println("");
        for(int i = 0; i<numofplayers - 1;i++){
        System.out.println("Player " + i + " has " + players[i].getHand());
            System.out.println("");
        
        }
        
        System.out.println("The dealer has " + dealer.getHand());
        System.out.println("");
        int quitters = 0;
        while(quitters<numofplayers-1){
            /*
            
            */
            
        for(int i = 0; i<numofplayers-1;i++){
            if(players[i].getBust() != true && players[i].getCount() != 21 && players[i].getQuit() != true){ 
                    
        if(!players[i].getBust() && !players[i].getQuit()){
            System.out.println("");
            System.out.println("");
        System.out.println("Player " + i + " do you want to hit? Your count is " + players[i].getCount() + ". Enter y for yes.");
            System.out.println("");
    
        
        System.out.println("Type n for no.");
         String hitnohit = scan.nextLine();
            System.out.println(hitnohit);
            System.out.println("");

        if(hitnohit.equals("y") || hitnohit.equals("Y")){
            players[i].hit();
            System.out.println("Confirmed. I have indeed hit it. Your cards are " + players[i].getHand());
            System.out.println("");
            System.out.println("");
            
        }else if(hitnohit.equals("n") || hitnohit.equals("N")){
            System.out.println("wimp.");
            System.out.println("");
            quitters++;
            players[i].quitter();
        }
        if(players[i].getCount()>21){
            System.out.println("You bust!");
            players[i].buster();
            quitters++;
        }
        if(players[i].getCount()==21)
        {
            System.out.println("You hit 21.");
           
        }
            System.out.println("Your cards are " + players[i].getHand());
            System.out.println("");
            System.out.println("The count of your cards is "+players[i].getCount());
            System.out.println("");
            System.out.println("");
            
                }
            
            }}
        }     
        
       players[numofplayers-1].DealerSwitch();
       System.out.println("And now the dealer draws. His fully revealed hand is " + dealer.getHand());
            System.out.println("");
            try {
            Thread.sleep(3000);        
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
            while(dealer.getCount()<17){
                players[numofplayers-1].hit();
                System.out.println("The dealer has drawn, his hand is now " + dealer.getHand());
                System.out.println("");
                try {
            Thread.sleep(3000);        
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
                if(dealer.getCount()>21){
                    System.out.println("The dealer has busted, You win!");
                    System.out.println("");
                    try {
            Thread.sleep(3000);        
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
                    
                }}
            
                 
       
            for(int i = 0; i<numofplayers;i++){
                if(players[i].getBust()){
                    System.out.println("Player " + i + "since you busted, you lose");
                    
                }else if((21-players[i].getCount())<=(21-dealer.getCount())){
                    System.out.println("You beat the dealer, you win, player " + i +"!" );
                    
                }else if((21-players[i].getCount())>(21-dealer.getCount())){
                    System.out.println("The dealer beat you, you lose, player " + i +".");
                    
                }else{
                    System.out.println("Rahul probably messed something up. Beat him mercilessly.");
                    break;
                }
                
            }

            
           // System.out.println("Rahul probably messed something up. Beat him mercilessly.");

           //
            
    }
}
