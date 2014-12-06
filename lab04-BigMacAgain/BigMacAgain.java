//Dan Lee
//Lab 04
//Big Mac Again Program

//  First change Directories of the program
//      cd lab04
//  
//  Compile the program
//      javac BigMacAgain.java
//
//  Then run the Program
//      java BigMacAgain
//  
//      Program should:
//          -Prompts the user to enter a double
//          -Print out first four digits right of the decimal point
//
//  Commit Program
//      javac BigMacAgain.java
//
//  Push Program
//      javac BigMacAgain.java


//  import scanner
        import java.util.Scanner;

//  Define the class
        public class BigMacAgain {

//  Add Main Method
        public static void main (String [] args) {
            
//  Declare Scanner
        Scanner myScanner = new Scanner ( System.in );
        

//  Begin declaring input variables
        
        System.out.print("Enter the number of Big Macs ordered: ");
        int BigMacNumber;
        if(myScanner.hasNextInt()) {
                BigMacNumber = myScanner.nextInt();
        } 
        else {
                System.out.println("You did not enter an integer.");
                return; //terminate program.
        }
        //  Declare variables and units
        double BigMacCost = 2.22;
        double TotalBigMacCost = BigMacNumber*BigMacCost;
        double FriesCost = 2.15;
        double TotalCost =  Math.floor((TotalBigMacCost+FriesCost)*100)/100;
        

        
        
                System.out.println("You ordered "+BigMacNumber+" Big Macs for "+BigMacNumber+" x2.22="+TotalBigMacCost);
                System.out.print("Do you want an order of fries (Y/y/N/n)? ");
                char Extra = myScanner.next().charAt(0);
                if (Extra == 'Y' || Extra == 'y') {
                        System.out.println("You ordered fries at a cost of $2.15");
                        System.out.println("Your meal came to be $"+TotalCost+" dollars");
                }
                else {
                        System.out.println("You did not order fries");
                        System.out.println("Your meal came to be $"+TotalCost+" dollars");
                        
                }
                
    

        
        
        
            

       
       
            
        } //End of method
} //End of class
