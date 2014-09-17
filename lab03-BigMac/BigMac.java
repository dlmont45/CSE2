//Dan Lee
//Lab02
//BigMac Program

//  First change Directories of the program
//      cd lab02
//  
//  Compile the program
//      javac BigMac.java
//
//  Then run the Program
//      java BigMac
//  
//      Program should:
//          -Calculate the cost for Big Macs (subtotal)
//          -Calculate total tax depending on where the Big Mac is bought
//          -Total actually paid for the transaction (including sales tax)
//          
//  Commit Program
//      javac BigMac.java
//
//  Push Program
//      javac BigMac.java


//  Import Scanner Class
        import java. util.Scanner; 

//  Define a Class
        public class BigMac {

//  Define a Main Method
            public static void main(String [] args) {
                
//  Begin declaring input variables
        double Scanner myScanner; //Declaring the scanner 
        myScanner = new Scanner ( System.in ) ; //Constructing an instance of the Scanner Class
        
//  Begin to accept input variables
        System.out.print("Enter the amount of Big Macs (an integer > 0): "); //Prompt the user for number of tickets
        int nBigMacs = myScanner.nextint(); //Accepting the user input

//  Begin to prompt user for cost and tax and accept the input
        System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx); " );
        double bigMac$ = myScanner.nextDouble ();
        System.out.print("Enter the percent tax as a whole number (xx) : ");
        double taxRate = myScanner.nextDouble ();
        taxRate/=100;

// Begin Output
        double cost$;
        int dollars,    //Whole dollar amount of cost
            dimes, pennies; //for storing digits
                        //to the right of the decimal point
                        //for the cost$
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //Get the whole amount, dropping decimal fraction
        dollars = (int)cost$
        //get dimes amount
        //(int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator returns the remainer after the division:   
        //ie. 583%100 -> 83, 27%5-> 2
        dimes = (int)(cost$*10)%10;
        pennies = (int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs+
        " Big Macs, at $"+bigMac$ +" per bigMac, with a" +
        " sales tax of "+ (int)(taxRate*100) + "%, is $"
            +dollars+'.'+dimes+pennies);
         
        
        
        
                
                
            } //End of Main Method
    } //End of Class