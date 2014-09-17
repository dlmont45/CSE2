//Dan Lee
//hw03
//Root Program

//  First change Directories of the program
//      cd hw03
//  
//  Compile the program
//      javac Root.java
//
//  Then run the Program
//      java Root
//  
//      Program should:
//          -Calculate a crude estimate of a cubed root
//          -Calculate value of crude guess when cubed
//
//  Commit Program
//      javac Root.java
//
//  Push Program
//      javac Root.java


//  Import Scanner
        import java.util.Scanner;

//  Define the class
        public class Root {
            
//  Add main method
        public static void main (String [] args) {

//  Begin Declaring input variables
        Scanner myScanner; //Declaring the scanner
        myScanner = new Scanner ( System.in ); //Constructing an instance of the scanner class

//  Input Variables
        System.out.print("Enter a double, and I will print its cube root:"); //Prompt user to enter number
        double x = myScanner.nextDouble(); 
        
        double guess; //input double for "guess"

//  Begin code for Root
        guess = x/3; //Take initial crude guess by diving by 3
        guess = (2*guess*guess*guess+x)/(3*guess*guess); //improve estimate by replacing guess
        guess = (2*guess*guess*guess+x)/(3*guess*guess); //do this 4 more times to better improve accuracy
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        
        double cubed = guess*guess*guess; //Calculate cubed
//  Print outputs 
        System.out.println("The cube root is "+guess+":"); //Print out the cube root of double
        System.out.println(guess+"*"+guess+"*"+guess+"="+cubed); //Print out cubed number. should be close to double
        
       
       
        //testtest/test


            } //End of method
    } //End of class
