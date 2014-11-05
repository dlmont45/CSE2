//Dan Lee
//hw 09
//Blocked Again Program

//  First change Directories of the program
//      cd hw09
//  
//  Compile the program
//      javac BlockedAgain.java
//
//  Then run the Program
//      java BlockedAgain
//  
//      Program should:
//          -Call on methods to test the range and type of input
//          -Use second method to print blocks.
//
//  Commit Program
//      javac BlockedAgain.java
//
//  Push Program
//      javac BlockedAgain.java

//  Import Scanner
import java.util.Scanner;

//  Define class
    public class BlockedAgain {

//  Define Main Method       
        public static void main(String []s){

//  Define variables
        int m;
//force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }   //End of main method
    
        public static int getInt() {
            
            //Prompts user to enter integer.
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Please enter an integer between 1 and 9: ");
            
                Boolean check = checkInt(myScanner);
                    if(check == true) {
                    
                        int t = checkRange(myScanner.nextInt());
                        return t;
                        
                    }   //End of if Statement
                    return 0;
                    
        }   //End of getInt method
            
        public static Boolean checkInt(Scanner myScanner) {
                if(myScanner.hasNextInt() == true) {
                    return true;
                    //  If the input is an integer, return true.
                }
                else {
                    String wrong = myScanner.next();
                    System.out.print("Please enter an integer: ");
                    return checkInt(myScanner); //Returns function to run again
                }
            
        }   //End of checkInt method 
        
        public static int checkRange(int integer) {
            if (integer >= 1 && integer <= 9) {
                return integer; //if the integer is in the right range, return.
            }
            else {
                Scanner myScanner = new Scanner(System.in);
                System.out.print("Please enter a number between 1 and 9: ");
                
                if (checkInt(myScanner) == true) {
                    int number = myScanner.nextInt();
                    return checkRange(number);
                }
                return 0;
            }
            
        }   //End of the checkRange method
        
//  Dictates the amount of blocks needed and calls on block method.    
        public static void allBlocks(int integer) {
            for (int i = 1; i <= integer; i++) {
                    int spaces = 9 - i;
                    block(i, spaces);
            }
            
            
        }   //End of allBlocks method
        
/*  Print out the lines in each block including passing the spaces and and "-"
    needed by calling on the next method, line. */
        public static void block(int integer, int spaces) {
            String character = "" + integer;
            int length = 2 * integer - 1;
            for ( int j = 0; j < integer; j++) {
                System.out.print(line(" ", spaces));
                System.out.println(line(character, length));
            }
            
            System.out.print(line(" ", spaces));
            System.out.println(line("-", length));
        }   //End of block method
/*  Prints out each length and the length and the actual characters by returning
    the method result back into where "line" is called in the block method. */
        public static String line(String character, int length) {
            String result = "";
            for (int y = 0; y < length; y++){
                result += character;
            }
            return result;
            
        }   //End of line method
        

    
}   //End of class

