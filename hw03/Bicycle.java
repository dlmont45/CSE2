//Dan Lee
//hw03
//Bicycle program
//
//  First change Directories of the program
//      cd hw03
//  
//  Compile the program
//      javac Bicycle.java
//
//  Then run the Program
//      java Bicycle
//  
//      Program should:
//          -Print number of Seconds
//          -Print number of counts
//          -Print the distance of each trip in miles
//          -Print average speed
//  Commit Program
//      javac Bicycle.java
//
//  Push Program
//      javac Bicycle.java

//  Import Scanner
        import java.util.Scanner;

//  Define the class
        public class Bicycle {
            
//  Add main method
        public static void main (String [] args) {


//  Begin Declaring input variables
        Scanner myScanner; //Declaring the scanner
        myScanner = new Scanner ( System.in ); //Constructing an instance of the scanner class

//  Begin Code for Bicycle. Input variables
        System.out.print("Enter the number of seconds of trip:") ;
        double secondsOfTrip = myScanner.nextDouble();
        System.out.print("Enter the number of counts of trip:") ;
        double countsOfTrip = myScanner.nextDouble();
        
//  Input distances and units
        double wheelDiameter = 27.0,
        PI = 3.14159,
        secondsPerMinute = 60,
        minutesPerHour = 60,
        inchesPerFoot = 12,
        feetPerMile = 5280;
         secondsOfTrip = 480;
         countsOfTrip = 1561;
        double feetOfTrip;
        double distanceOfTrip;
        double timeOfTrip;
        double milesPerHour;
        
//  Compute the variables
        feetOfTrip = (wheelDiameter*PI*countsOfTrip)/(inchesPerFoot);
        distanceOfTrip = feetOfTrip/feetPerMile;
        timeOfTrip = secondsOfTrip/secondsPerMinute;
        milesPerHour = distanceOfTrip/(timeOfTrip/minutesPerHour);
        
//  Print output
        System.out.println("The distance was "+(int)(distanceOfTrip*100)/100.0+" miles and took "+timeOfTrip+" minutes.");
        System.out.println("The average mph was "+(int)(milesPerHour*100)/100.0+" miles per hour.");
        
        
        
        // testtest/test
        
        
        
        
        
    
        
          
          
           
           
           
            } //End of Method
     } //End of Class