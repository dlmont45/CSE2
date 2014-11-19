//Dan Lee
//hw 10
//Poker Odds Program

//  First change Directories of the program
//      cd hw10
//  
//  Compile the program
//      javac PokerOdds.java
//
//  Then run the Program
//      java PokerOdds
//  
/*      Program should:

       Write Two methods that will:
       1. Generate a random hand of cards
       2. Generate 10,000 hands and determine the frequency of pairs.

*/
//  Commit Program
//      javac PokerOdds.java
//
//  Push Program
//      javac PokerOdds.java

//import Random number Generator
import java.util.Random;
//import Scanner
import java.util.Scanner;
//Define Class
public class PokerOdds{
    //Define main Method
  public static void main(String [] arg){
      
      //intializing the deck.
      

    showHands();
    simulateOdds();
    
  } //End of Main Method
  
//  Begin ShowOneHand Method
    public static void showHands() {
    Scanner scan=new Scanner(System.in);
    String answer="";
    
    do {
         int deck[] = new int [52];
      for (int i = 0; i <= 51; i++) {
          deck[i] = i;
      } //Initializes the deck
      
        
        String suit[] = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
        String value[] = new String [14];
      
      
          int deckMax = 52;
          int cards[] = {-1,-1,-1,-1,-1};
            for (int j = 0; j < 5; j++) {
                int target = (int)(Math.random()*deckMax);
                int temp = deck[target];
                cards[j] = temp;
                deck[target] = deck[deckMax-1];
                deck[deckMax-1] = -1;
                deckMax--;
            }
            
            for (int z = 0; z < 5; z++) {
                int suitNum = (int)(cards[z]/13);
                int valueNum = (int)(cards[z]%13);
                    switch (valueNum) {
                        case(0): value[z] = "A";
                                break;
                        case(1): value[z] = "K";
                                break;
                        case(2): value[z] = "Q";
                                break;
                        case(3): value[z] = "J";
                                break;
                        default: 
                        value[z] = Integer.toString(14-valueNum);
                    }
                    switch (suitNum) {
                        case(0): suit[0] +=value[z]+" ";
                            break;
                        case(1): suit[1] += value[z]+" ";
                            break;
                        case(2): suit[2] += value[z]+" ";
                            break;
                        case(3): suit[3] += value[z]+" ";
                            break;
                    }
            }
            
            for (int x = 0; x < 4; x++) {
                System.out.println(suit[x]);
            }
            
            
            
          
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
        answer = scan.next();  
    } while (answer.equals("Y") || answer.equals("y"));
    }   //End of Method
    
    public static Boolean exactlyOneDup(int num[]) {
        int count2 = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                if(num[i] == num[j]) {
                    count2++;
                }
            }
        }
        
        if(count2 == 1) {
            return true;
        }
        else return false;
        
        
    }   //end of Method
    
    public static void simulateOdds() {
        int dupCount [] = new int [13];
        String suit [] = {"A:\t", "K:\t", "Q:\t","J:\t","10:\t","9:\t","8:\t","7:\t","6:\t","5:\t","4:\t","3:\t","2:\t"};
        for (int y = 0; y < 10000; y++) {
            int deck[] = new int [52];
            for (int i = 0; i <= 51; i++) {
                deck[i] = i;
            }
            int deckMax = 52;
            int cards[] = {-1,-1,-1,-1,-1};
            for (int j = 0; j < 5; j++) {
                int target = (int)(Math.random()*deckMax);
                int temp = deck[target];
                cards[j] = temp;
                deck[target] = deck[deckMax-1];
                deck[deckMax-1] = -1;
                deckMax--;
            }
            int value [] = new int [5];
            for (int z = 0; z < 5; z++) {
                int valueNum = (int)(cards[z]%13);
                    value[z] = (14-valueNum);
                    }
            
            
            if (exactlyOneDup(value) == true) {
                for()
                
            }
            
                
        }
        
        
    }//End of Method
}   //End of Class
