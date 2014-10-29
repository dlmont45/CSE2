//Dan Lee
//hw 08
//HW8 Program

//  First change Directories of the program
//      cd hw08
//  
//  Compile the program
//      javac HW8.java
//
//  Then run the Program
//      java HW8
//  
//      Program should:
//          -Call on overloaded methods.
//          -Print out desired output.
//
//  Commit Program
//      javac HW8.java
//
//  Push Program
//      javac HW8.java

//  Import Scanner
    //  Import Scanner
import java.util.Scanner;

//  Define a Class
public class HW8 {
    
//  Define Main Method
  public static void main(String []arg){
	char input;
	Scanner myScanner = new Scanner(System.in);
	
//  Prompt user to enter C or c
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(myScanner,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(myScanner,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
 	System.out.println("You entered '"+input+"'");
	}
	input=getInput(myScanner,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }
  
//  Begin Method Overloading
        public static char getInput(Scanner myScanner, String valid){
//  Running infinite loop            
            while(true) {
                String x = myScanner.next();
                //  To make sure that the entered is exactly 1 character long
                if (x.length() > 1) {
                    System.out.print("You should enter exactly one character: ");
                    continue; 
                }
                
                // for loop to check char with string
                for(int i = 0; i < valid.length(); i++) {
                    if(x.charAt(0) == valid.charAt(i)) {
                        return x.charAt(0);
                    }
                }
                
                // print out "you entered "x"
                    System.out.print("Please enter a value from '"+ valid+"': ");
            
            }   //End of 
        }   //End of First Method
        
        
//  Second Method        
        public static char getInput(Scanner myScanner, String valid, int tries) {
        //  For loop to run program 5 times
        for (int p = 1; p <= tries; p++) {
            String y = myScanner.next();
            //  Check String length 
            if (y.length() > 1) {
                System.out.print("Enter only one character: ");
                continue;
            }
            //  Check String with char
            for(int i = 0; i < valid.length(); i++) {
                if(y.charAt(0) == valid.charAt(i)) {
                    return y.charAt(0);
                }
            }
            //  Did not match the desired char
            System.out.print("You did not enter a character from the list; try again: ");
            continue;   //Continue out of the if statement
            
        }   //End of 5 for loop
        //  Print out failed message after 5 prompts.
        System.out.println("You failed after "+tries+" tries.");
        return ' ';
        }   //End of the second Method
        
        

//  Begin third Method        
        public static char getInput(Scanner myScanner, String prompt, String valid){
            while(true) {
                //  Prompt user to enter one of the desired characters
                System.out.println(prompt + "\n" + "Please Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9': ");
                String z = myScanner.next();
                //  If statement to check length of character string
                if (z.length() > 1) {
                    System.out.println("You should enter exactly one character: ");
                    continue; 
                }
                
                // for loop to check char with string
                for(int i = 0; i < valid.length(); i++) {
                    if(z.charAt(0) == valid.charAt(i)) {
                        return z.charAt(0);
                    }
                }
                
                // print out "you entered "z"
                    System.out.println("You did not enter an acceptable character.");
            
            }   //End of Infinite Loop
        }   //End of third Method

}   //End of Class