//Dan Lee
//hw 04
//Income Tax Program

//  First change Directories of the program
//      cd hw04
//  
//  Compile the program
//      javac IncomeTax.java
//
//  Then run the Program
//      java IncomeTax
//  
//      Program should:
//          -Prompts the user to enter an income in the tens of thousands.
//          -Print out the amount of tax based on income
//
//  Commit Program
//      javac IncomeTax.java
//
//  Push Program
//      javac IncomeTax.java

//  Import Scanner
    import java.util.Scanner;
        
//  Define a Class
    public class IncomeTax {
            
//  Define a Method
        public static void main (String [] args) {
            Scanner input = new Scanner(System.in);
            
//  Prompt the User to enter a salary
            System.out.print("Enter Salary giving the tens of thousands: ");
            int income = input.nextInt();
            
            //  Begin If Else Statements to include all scenarios
            
            if (income < 0)
                System.out.println("You did not enter a positive integer.");
            else if (income < 20)
                System.out.println("The tax rate on income is 5%, and the tax is $"+(int)((income*.05)*10000)+" dollars.");
            else if (income < 40)
                System.out.println("The tax rate on income is 7%, and the tax is $"+(int)((income*.07)*10000)+" dollars.");
            else if (income < 78)
                System.out.println("The tax rate on income is 12%, and the tax is $"+(int)((income*.12)*10000)+" dollars.");
            else if (income >= 78)
                System.out.println("The tax rate on income is 14%, and the tax is $"+(int)((income*.14)*10000)+" dollars.");
            

        //testtest/test
            
            
        } //End of Method
} //End of Class
