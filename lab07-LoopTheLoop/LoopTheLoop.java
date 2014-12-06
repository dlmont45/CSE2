//Dan Lee
//lab 07
//Root Program

//  First change Directories of the program
//      cd lab07
//  
//  Compile the program
//      javac LoopTheLoop.java
//
//  Then run the Program
//      java LoopTheLoop
//  
//      Program should:
//          -Print out Stars as asked
//
//  Commit Program
//      javac LoopTheLoop.java
//
//  Push Program
//      javac LoopTheLoop.java

//  Import Scanner
    //  Import Scanner

import java.util.Scanner;

public class  LoopTheLoop{
    			  // main method required for every Java program
   	public static void main(String[] args) {
   	  String line = "";
   	  
   	  Scanner scan = new Scanner( System.in );
   	  
   	  int answer;
   	  char letter;
   	  
   	  	do {
   	  	    
   	    System.out.print("Enter an int between 1 and 15- "); 
   	    int nStars = scan.nextInt(); 

   	    if(nStars<0 || nStars>16){
   	        System.out.println("Your int was not in the range [1.15]");
   	    }
   	    for(int i = 0; i < nStars; i++) {
   	        System.out.print("*");
   	    }
   	    System.out.print("\n");
   	    
   	    for(int j = 1; j <= nStars; j++) {
   	        for(int z = 0; z < j; z++) {
   	            System.out.print("*");
   	        }
   	        System.out.print("\n");
   	    }

        
   	    Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print(" \n Enter y or Y to go again- ");
        letter = myScanner.next().charAt(0);
        } while( letter == 'Y' || letter == 'y');
   	
    }
}
