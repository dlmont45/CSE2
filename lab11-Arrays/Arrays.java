//Dan Lee
//lab 11
//Arrays Program

//  First change Directories of the program
//      cd lab11
//  
//  Compile the program
//      javac Arrays.java
//
//  Then run the Program
//      java Arrays
//  
//      Program should:
/*
    -Create an array that can hold 10 ints
    -Ask the user enter 10 ints and store them in the array
    -Search the array for the highest entry and print it out
    -Search the array for the lowest entry and print it out
    -Sum the ints in the array and print out the sum
    -Copy the contents of the array into a second array in reverse order 
    -Print the contents of the two arrays in two columns, side by side. 
    -Below is sample output that your program should resemble:

*/

//
//  Commit Program
//      javac Arrays.java
//
//  Push Program
//      javac Arrays.java

//  Import Scanner
    //  Import Scanner
import java.util.Scanner;

//  Define Public Class
    public class Arrays{
        
//  Define Main Method
        public static void main (String [] args) {
            //Declare Scanner 
            java.util.Scanner myScanner = new java.util.Scanner(System.in);
            
            int [] number = new int [10];
            int sum = 0;
            
            System.out.print("Enter 10 ints: ");
            for (int i = 0; i < 10; i++) {
                number[i] = myScanner.nextInt();
                sum += number[i];
            }
            
            int max = number[0];
            int min = 0;
            for (int i = 0; i < 10; i++) {
                if(number[i] > max) {
                    max = number[i];
                    min = i;
                }
            }
            
            System.out.println("The lowest entry is: "+min);
            System.out.println("The highest entry is: "+max);
            System.out.println("The sum is: "+sum);
            
            
           
            
        }   //End of Main Method
    }   //End of Class