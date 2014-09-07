//Dan Lee
//Lab02
//Cyclometer program
//
//  First change Directories of the program
//      cd hw01
//  
//  Compile the program
//      javac Cyclometer.java
//
//  Then run the Program
//      javac Cyclometer.java//
//  
//      Program should:
//          -Print number of minutes for each trip
//          -Print number of counts for each trip
//          -Print the distance of each trip in miles
//          -Print distance for two trips combined.
//  Commit Program
//      javac Cyclometer.java
//
//  Push Program
//      javac Cyclometer.java


//  Define a Class
        public class Cyclometer{
            
//  Add main method
        public static void main(String [] args) {

//  Begin code for cyclometer- Distance and units
    int secsTrip1=480; // Seconds taken for trip 1
    int secsTrip2=3220; // Seconds taken for trip 2
    int countsTrip1=1561; // Number of counts for trip 1
    int countsTrip2=9037; // Number of counts for trip 2
    double wheelDiameter=27.0,
    PI=3.14159, // Diameter of wheels in inches, the value of PI
    feetPerMile=5280, // Number of feet in a mile
    inchesPerFoot=12, // Number of inches in a foot
    secondsPerMinute=60; // Number of seconds in a minute
    double distanceTrip1, distanceTrip2, totalDistance; // Distance of trip 1, Distance of trip 2, total distance traveled.

//  Print out numbers used in the storing of variables- Seconds and the counts
    System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
         countsTrip1+" counts. ");
    System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
         countsTrip2+" counts. ");
         
//  Compute the values for the distances
//      Run the calculations; store the values. Document your
//      calculation here. What are you calculating?
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;//Calculation of total distance.
        
//  Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles ");
        System.out.println("Trip 2 was "+distanceTrip2+" miles ");
        System.out.println("The total distance was "+totalDistance+" miles");
        
       
        //test/testtest
    

            }   // End of Main Method
        }   // End of Class