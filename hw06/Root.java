//Dan Lee
//hw 06
//Root Program

//  First change Directories of the program
//      cd hw06
//  
//  Compile the program
//      javac Root.java
//
//  Then run the Program
//      java Root
//  
//      Program should:
//          -Generate random integers and test 100 rounds 1000 times.
//          -Store and present data of times winning, total winnings and times lost.
//
//  Commit Program
//      javac Root.java
//
//  Push Program
//      javac Root.java

//  Import Scanner
    //  Import Scanner
import java.util.Scanner;

//  Define a Class
public class Root {
    
//  Define a Method
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        
//Define the integers
        double low = 0;
        double x = 0;
        double high = 1 + x;
        double middle = ((low + high)/2);
        
        //  Prompting the user to enter a number
        System.out.print("Please enter a number X: ");
            x = input.nextDouble();
        
        //  Begin Loop
        while ((high - low) > (0.0000001 * (1+x))){
            if ((middle * middle) > x) {
                high = middle;
            }
            else low = middle;
            
        }//End of While     
        
        //  Printing the square root of number
        System.out.println("The square root of "+x+" is "+ middle);
        
    }//End of Method
}//End of class
            