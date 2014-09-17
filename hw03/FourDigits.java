//Dan Lee
//hw03
//Four Digits Program

//  First change Directories of the program
//      cd hw03
//  
//  Compile the program
//      javac FourDigits.java
//
//  Then run the Program
//      java FourDigits
//  
//      Program should:
//          -Prompts the user to enter a double
//          -Print out first four digits right of the decimal point
//
//  Commit Program
//      javac FourDigits.java
//
//  Push Program
//      javac FourDigits.java


//  Import Scanner
        import java.util.Scanner;

//  Define the class
        public class FourDigits {
            
//  Add main method
        public static void main (String [] args) {

//  Begin Declaring input variables
        Scanner myScanner; //Declaring the scanner
        myScanner = new Scanner ( System.in ); //Constructing an instance of the scanner class

//  Input Variables
        System.out.print("Enter a double and I will display the first four digits to the right of the decimal:"); //Prompt user to enter number
        double number = myScanner.nextDouble();
        
        double IntNumber; //Integer of double 
        double n1; //10th place
        double n2; //100th place
        double n3; //1000th place
        double n4; //10,000th place
        double decimals; //digits right of the decimal
        double FinalDecimals; //Final Decimals
        
//  Begin code for FourDigits
        IntNumber = (int)(number); //Trunkated number of double
        decimals = (number - IntNumber)*1000; //Calculating the decimals
        n1 = (int)(decimals*10); //Calculating n1
        n2 = ((int)(decimals*100)-(n1*10)); //Calculating n2
        n3 = ((int)(decimals*1000)-(n1*100)-(n2*10)); //Calculating n3
        n4 = ((int)(decimals*10000)-(n1*1000)-(n2*100)-(n3*10)); //Calculating n4
        FinalDecimals = (int)(n1*1000)+(n2*100)+(n3*10)+(n4); //Calculating final decimal

// Print Output
        System.out.println("The four digits are: "+FinalDecimals); //Print final four digits
        
        
        
        //testtest/test


        } //End of Method
} //End of Class