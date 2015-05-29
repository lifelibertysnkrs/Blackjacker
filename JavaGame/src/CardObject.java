/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joe Parkhill
 */
public class CardObject 
{
   private String facevalue;
   private String suit;
   private int FaceTracker;
   private int SuitTracker;
   private boolean FaceUp;
   
   public CardObject(int n, int s)
   {
       FaceUp = true;
       if(n >= 2 && n <=10)
       {
           facevalue = "" + n;
       }
       if(n == 1)
       {
           facevalue = "ace";
       }
       if(n == 11)
       {
           facevalue = "jack";
       }
       if(n == 12)
       {
           facevalue = "queen";
       }
       if(n == 13)
       {
           facevalue = "king";
       }
       if(s == 1)
       {
           suit = "hearts";
       }
       if(s == 2)
       {
           suit = "diamonds";
       }
       if(s == 3)
       {
           suit = "clubs";
       }
       
       if(s == 4)
       {
           suit = "spades";
       }
       
       FaceTracker = n;
       SuitTracker = s;
   }
   
   public int getFaceTracker()
   {
       return FaceTracker;
   }
   
   public int getSuitTracker()
   {
       return SuitTracker;
   }
   
   public String toString()
   {
       return "" + facevalue + " of " + suit;
   }
   
   public boolean getFaceUp()
   {
       //Returns the current status of FaceUp
       return FaceUp;
   }
   
   public boolean ChangeFaceUp()
   {
       //If FaceUp is true it will become false, and if false true
       if(this.getFaceUp() == true)
           return FaceUp = false;
       return FaceUp = true;
   }
   
   public int getPointVal()
   {
       
       //uses the FaceTracker value to get the face of the card
       //returns appropriate value based on face
       if(FaceTracker == 1)
           return 1;
       if(FaceTracker == 2)
           return 2;
       if(FaceTracker == 3)
           return 3;
       if(FaceTracker == 4)
           return 4;
       if(FaceTracker == 5)
           return 5;
       if(FaceTracker == 6)
           return 6;
       if(FaceTracker == 7)
           return 7;
       if(FaceTracker == 8)
           return 8;
       if(FaceTracker == 9)
           return 9;
       if(FaceTracker == 10)
           return 10;
       if(FaceTracker == 11)
           return 10;
       if(FaceTracker == 12)
           return 10;
       
       return 10;
       
   }
}
