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
        Scanner myScanner = new Scanner ( System.in ) ; //Constructing an instance of the Scanner Class
        
//  Begin to accept input variables
        System.out.print("Enter the amount of Big Macs (an integer > 0): "); //Prompt the user for number of tickets
        int nBigMac = myScanner.nextInt(); //Accepting the user input

//  Begin to prompt user for cost and tax and accept the input
        System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx); " );
        double bigMacCost = myScanner.nextDouble ();
        System.out.print("Enter the percent tax as a whole number (xx) : ");
        double taxRate = myScanner.nextDouble ();
        taxRate /= 100;

// Begin Output
        double cost$ = 0;
        int dollars = 0;    //Whole dollar amount of cost
        int dimes = 0;
        int pennies = 0; //for storing digits
                        //to the right of the decimal point
                        //for the cost$
        cost$ = nBigMac*bigMacCost*(1+taxRate);
        //Get the whole amount, dropping decimal fraction
        dollars = (int)cost$;
        //get dimes amount
        //(int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator returns the remainer after the division:   
        //ie. 583%100 -> 83, 27%5-> 2
        dimes = (int)(cost$*10)%10;
        pennies = (int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMac+
        " Big Macs, at $"+bigMacCost +" per bigMac, with a" +
        " sales tax of "+ (int)(taxRate*100) + "%, is $"
            +dollars+'.'+dimes+pennies);
         
        
        
        
                
                
            } //End of Main Method
    } //End of Class