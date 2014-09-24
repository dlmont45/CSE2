//Dan Lee
//hw 04
//Time Padding Program

//  First change Directories of the program
//      cd hw04
//  
//  Compile the program
//      javac TimePadding.java
//
//  Then run the Program
//      java TimePadding
//  
//      Program should:
//          -Prompts the user to enter the seconds passed during the day.
//          -Print out the number of seconds in conventional clock.
//
//  Commit Program
//      javac TimePadding.java
//
//  Push Program
//      javac TimePadding.java

//  Import Scanner
    import java.util.Scanner;
        
//  Define a Class
    public class TimePadding {
            
//  Define a Method
        public static void main (String [] args) {
            Scanner input = new Scanner(System.in);
        
    //  Prompt the user to give the course number
            System.out.print("Enter the number of seconds: ");
            int secondsInput = input.nextInt();
            
    //  Declaring Variables        
            int seconds; //Number of seconds on Conventional
            int minutes; //Number of minutes on Conventional
            int hours; //Number of hours on Conventional
            
    //  Calculations        
            hours = (int)secondsInput/3600; //trunk to hours
            minutes = (int)((secondsInput-(hours*3600))/60); //use remainder
            seconds = (int)(secondsInput-(hours*3600)-(minutes*60)); //use remainder
            
        //  Begin input functions
                if (hours <= 10 && minutes <= 10 && seconds <= 10) {
                    System.out.println("The time is: 0"+hours+":0"+minutes+":0"+seconds);
                }    //For all cases that need to be padded
                else {
                    System.out.println("The time is: "+hours+":"+minutes+":"+seconds);
                }   //For all cases that are double digits
           
           
           //testtest/test
           
           
           
            
        }   //End of Method
        
    }   //End of Class