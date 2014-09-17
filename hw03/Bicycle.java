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
        System.out.print("Enter the number of seconds of trip:") ; //Prompt user for number of seconds of trip
        double secondsOfTrip = myScanner.nextDouble();
        System.out.print("Enter the number of counts of trip:") ; //Prompt user to ender number of counts of trip
        double countsOfTrip = myScanner.nextDouble();
        
//  Input distances and units
        double wheelDiameter = 27.0, //Declating wheel diameter
        PI = 3.14159, //PI
        secondsPerMinute = 60, 
        minutesPerHour = 60,
        inchesPerFoot = 12,
        feetPerMile = 5280;
         secondsOfTrip = 480;
         countsOfTrip = 1561;
        double feetOfTrip; //Declaring the feet per trip
        double distanceOfTrip; //Declaring the distance of trip
        double timeOfTrip; //Declaring the time of trip
        double milesPerHour; //Declaring the miles per hour
        
//  Compute the variables
        feetOfTrip = (wheelDiameter*PI*countsOfTrip)/(inchesPerFoot); //Computing feet of trip
        distanceOfTrip = feetOfTrip/feetPerMile; //Computing distance of trip
        timeOfTrip = secondsOfTrip/secondsPerMinute; //Computing the time of trip
        milesPerHour = distanceOfTrip/(timeOfTrip/minutesPerHour); //Computing the miles per hour
        
//  Print outputs
        System.out.println("The distance was "+(int)(distanceOfTrip*100)/100.0+" miles and took "+timeOfTrip+" minutes.");
        System.out.println("The average mph was "+(int)(milesPerHour*100)/100.0+" miles per hour."); //multiply and divide by 100
        
        
        
                
                // testtest/test
        
        
            } //End of Method
     } //End of Class