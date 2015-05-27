


import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("> I AM MASSAR. \n I can currently simulate a game of blackjack. Eventually, I will use a Graphical User Interface and \n artificial intelligence to improve your chances of winning.");
        System.out.println("> How many players are there?");
        int numofplayers = scan.nextInt();
        System.out.println("");
        System.out.println("How many decks would you like to use?");
        int numofdecks = scan.nextInt();
        if(numofdecks > 1)
        System.out.println("lol, too bad, I can only handle one deck.");
        System.out.println("");
        
        Deck deck = new Deck();
        deck.Shuffle();
        
        Player players [] = new  Player[numofplayers];
        
        for(int i = 0; i<numofplayers-1; i++){
            players[i] = new Player(false, deck, false, false);
        }
        
        players[numofplayers-1] = new Player(true, deck, false, false);
        Player dealer = players[numofplayers-1];
        System.out.println("Analyzing visual field..."); 
        System.out.println("");
        System.out.println("");
        try {
            Thread.sleep(2500);        
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
        while(quitters<numofplayers){
            
        for(int i = 0; i<numofplayers;i++){
            while(players[i].getBust() != true && players[i].getCount() != 21 && players[i].getQuit() != true){ 
                    
        if(!players[i].getBust() && !players[i].getQuit()){
            System.out.println("");
            System.out.println("");
        System.out.println("Player " + i + " do you want to hit? Enter y for yes.");
            System.out.println("");
        try {
            Thread.sleep(100);        
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Type n for no.");
        String hitnohit = scan.nextLine();
            System.out.println("");
        System.out.println("I forgot to mention, I use audio analysis along with keyboard input. Try loudly saying BANG BANG SOSA for hit, or DUNKAAY for not hit while typing.");
        hitnohit = scan.nextLine();

        if(hitnohit.equals("y") || hitnohit.equals("Y")){
            players[i].hit();
            System.out.println("Confirmed. I have indeed hit it. Your cards are " + players[i].getHand());
            System.out.println("");
            System.out.println("");
            
        }else{
            System.out.println("wimp.");
            System.out.println("");
            quitters++;
            players[i].quitter();
        }
        if(players[i].getCount()>21){
            System.out.println("You bust and lose!");
            players[i].buster();
        }
            System.out.println("Your cards are " + players[i].getHand());
            
                }
            
            }}
            
        }
       System.out.println("And now the dealer draws. His fully revealed hand is" + dealer.getHand());
            while(dealer.getCount()<17){
                dealer.hit();
                System.out.println("The dealer has drawn, his hand is now" + dealer.getHand());
                if(dealer.getCount()>21){
                    System.out.println("The dealer has busted, You win!");
                    
                }
            
                 
       }
            for(int i = 0; i<numofplayers - 1;i++){
                if(players[i].getBust()){
                    System.out.println("Player " + i + "since you busted, you lose");
                    break;
                }else if((21-players[i].getCount())<=(21-dealer.getCount())){
                    System.out.println("You beat the dealer, you win, player " + i +"!" );
                    break;
                }else if((21-players[i].getCount())>(21-dealer.getCount())){
                    System.out.println("The dealer beat you, you lose, player " + i +".");
                    break;
                }else{
                    System.out.println("Rahul probably messed something up. Beat him mercilessly.");
                    break;
                }
                
            }
    }
}
