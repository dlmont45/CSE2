//Dan Lee
//hw 04
//Month Program

//  First change Directories of the program
//      cd hw04
//  
//  Compile the program
//      javac Month.java
//
//  Then run the Program
//      java Month
//  
//      Program should:
//          -Prompts the user to enter the month and the year.
//          -Print out the number of days in that month.
//
//  Commit Program
//      javac Month.java
//
//  Push Program
//      javac Month.java

//  Import Scanner
    import java.util.Scanner;
        
//  Define a Class
    public class Month {
            
//  Define a Method
        public static void main (String [] args) {
            Scanner input = new Scanner(System.in);
            
//  Prompt the User to enter a salary
            System.out.print("Enter an integer giving the number of the month: ");
            int month = input.nextInt();
        
        //Begin If else statements to include all possibilities.
            
            if (month >= 1 && month <= 12) {   
                
                switch (month) {
                    case 1: System.out.println("This month has 31 days."); break;
                    case 2: 
                        System.out.print("Please Enter the Year: ");
                        int year = input.nextInt();
                        if (year % 4 == 0) {
                            System.out.println("This month has 29 days.");
                        }
                        else {
                        System.out.println("This month has 28 days.");
                        }  break;
                    case 3: System.out.println("This month has 31 days."); break;
                    case 4: System.out.println("This month has 30 days."); break;
                    case 5: System.out.println("This month has 31 days."); break;
                    case 6: System.out.println("This month has 30 days."); break;
                    case 7: System.out.println("This month has 31 days."); break;
                    case 8: System.out.println("This month has 31 days."); break;
                    case 9: System.out.println("This month has 30 days."); break;
                    case 10: System.out.println("This month has 31 days."); break;
                    case 11: System.out.println("This month has 30 days."); break;
                    case 12: System.out.println("This month has 31 days.");
                }   //End of Switch
            }   //End of If
            
            else System.out.println("You did not enter a month between 1-12.");
            
            //testtest/test


            }   //End of Method


}   //End of Class.