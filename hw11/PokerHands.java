//Dan Lee
//hw 11
//Poker Hands Program

//  First change Directories of the program
//      cd hw11
//  
//  Compile the program
//      javac PokerHands.java
//
//  Then run the Program
//      java PokerHands
//  
/*      Program should:

       
*/
//  Commit Program
//      javac PokerHands.java
//
//  Push Program
//      javac PokerHands.java
import java.util.*;
public class PokerHands {
    public static void main(String [] args) {
        
        
    
      
      getInput();
      //buildHand();
      //showOneHand();
        
    }//End of Method
    
    
    public static char getInput(){
        
        
        //  Running infinite loop            
            while(true) {
                char input;
	            Scanner myScanner = new Scanner(System.in);
                String x = myScanner.next();
                //  To make sure that the entered is exactly 1 character long
                if (x.length() > 1) {
                    System.out.print("You should enter exactly one character: ");
                    continue; 
                }
                
                // for loop to check char with string
                for(int i = 0; i < 5; i++) {
                    if(x.charAt(0) == x.charAt(i)) {
                        return x.charAt(0);
                    }
                }
                
                // print out "you entered "x"
                    System.out.print("Please enter an acceptable value ");
            
            }   //End of 
        }   //End of First Method

     public static void showOneHand(int hand[]){
    	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
    	String face[]={
           "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
      	"4 ","3 ","2 "};
    	String out="";
    	for(int s=0;s<4;s++){
      	out+=suit[s];
      	for(int rank=0;rank<13;rank++)
        	for(int card=0;card<5;card++)
         	if(hand[card]/13==s && hand[card]%13==rank)
          	out+=face[rank];
      	out+='\n';
    	}
    	System.out.println(out);
      }//End of Method
      
  

}//End of Class

