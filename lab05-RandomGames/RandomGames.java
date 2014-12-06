//Dan Lee
//Lab 05
//Random Games Program

//  First change Directories of the program
//      cd lab05
//  
//  Compile the program
//      javac RandomGames.java
//
//  Then run the Program
//      java RandomGames
//  
//      Program should:
// 
//
//  Commit Program
//      javac RandomGames.java
//
//  Push Program
//      javac RandomGames.java

import java.util.Scanner;

public class RandomGames {
    			  // main method required for every Java program
   	public static void main(String[] args) {
   	    
   	    Scanner myScanner;
   	    
   	     
                    myScanner = new Scanner( System.in );
                    System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card-  ");
                    
                    char answer;
                    String answerString = myScanner.next();
                    
                    if(answerString.length() != 1){
                        System.out.println("A single Character Expected");
                        return; //leaves the program, i.e. //the program terminates
                    } else {
                        answer = answerString.charAt(0);
                    }
                    
                    
            
                    
                    switch (answer) {
                        case('R' | 'r'):
                            System.out.println(roulette(answer));
                            break;
                            
                        case('C' | 'c'):
                            System.out.println(craps(answer));
                            break;
                            
                        case('P' | 'p'):
                            System.out.println(pickacard(answer));
                            break;
                            
                        default:
                            System.out.println(answer +  " is  not a correct input");
                            return; //leaves the program, i.e. //the program terminates
                        
                    }
                    
                    
                    
                    
        }
                    
                    
    public static String roulette(char a){
        
        /*
        If the user enters “R” or “r” then the program will print
        the results of a play at Roulette, one of the numbers 0, 00, 1, 2, …, 36 (the roulette
        wheel has 18 red numbers, 1, 3, …, 35, 18 black numbers, 2,4,...,36, and a blue 0
        and a blue 00). 
        */
       
        
        
        int number = ((int)(Math.random()*38));
        
        switch (number) {
            
            case(37):
                number = 0;
                break;
            case(38):
                number = 00;
                break;
                
            default:
                break;
        }
            
         String ans = "Roulette: " + number;
            
        
        
        return ans; 
        }
        
        public static String craps(char a){
            
            int diceOne = ((int)(Math.random()*6));
            int diceTwo = ((int)(Math.random()*6));
            int sum = diceOne + diceTwo;
            
            
        
        String ans = "Craps: "+diceOne+"+"+diceTwo+"="+sum;
        
        return ans; 
        } 
        
        public static String pickacard(char a){
        
        String ans = "Method pickacard Is not yet implemented";
        
        return ans; 
        } 
    }