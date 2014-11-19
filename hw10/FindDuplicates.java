//Dan Lee
//hw 10
//Find Duplicates Program

//  First change Directories of the program
//      cd hw10
//  
//  Compile the program
//      javac FindDuplicates.java
//
//  Then run the Program
//      java FindDuplicates
//  
/*      Program should:

        Enter 10 ints- 1 23 1 3 4 5 6 7 8 9 
        The array {1, 23, 1, 3, 4, 5, 6, 7, 8, 9} has duplicates.
        The array {1, 23, 1, 3, 4, 5, 6, 7, 8, 9} has exactly one duplicate.
        Go again? Enter 'y' or 'Y', anything else to quit- y
        Enter 10 ints- 1 2 3 4 5 6 7 8 9 0
        The array {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} does not have duplicates.
        The array {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} does not have exactly one duplicate.
        Go again? Enter 'y' or 'Y', anything else to quit- y
        Enter 10 ints- 1 2 1 2 3 4 5 8 9 7
        The array {1, 2, 1, 2, 3, 4, 5, 8, 9, 7} has duplicates.
        The array {1, 2, 1, 2, 3, 4, 5, 8, 9, 7} does not have exactly one duplicate.
        Go again? Enter 'y' or 'Y', anything else to quit- n

*/
//  Commit Program
//      javac FindDuplicates.java
//
//  Push Program
//      javac FindDuplicates.java

//Import Scanner
import java.util.Scanner;
//Define Class
public class FindDuplicates{
    //Define Main Method
  public static void main(String [] arg){
      //Declaring Scanner
    Scanner scan=new Scanner(System.in);
    //Initializing the Array of 10
    int num[]=new int[10];
    String answer="";
    
    //Begins loop for prompt
    do{
      System.out.print("Enter 10 ints- ");  //Prompt user
      
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      } //Stores entered value into array
      
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"

//submits the following in case of many dups.
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num); 
      
//submits the following in the case of only 1 dup.      
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y")); //End of do while loop
  } //End of Main Method

//Writing out the actual printing method to return to main method.
  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
    
  } //End of Method
  
  
  
//  Begin Method hasDups
    public static Boolean hasDups(int num[]) {
        int count1 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                if (num[i] == num[j]) {
                    count1++;
                }
            }
        }
        if (count1 > 0) {
            return true;
        }
        else return false;
        
    }   //End of Method
    
//  Begin Method exactlyOneDup
    public static Boolean exactlyOneDup(int num[]) {
        int count2 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                if(num[i] == num[j]) {
                    count2++;
                }
            }
        }
        
        if(count2 == 1) {
            return true;
        }
        else return false;
    }   //end of Method
    
    
    
    
}   //End of Class
