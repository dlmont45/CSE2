//Dan Lee
//lab 09
//Methods Program

//  First change Directories of the program
//      cd lab09
//  
//  Compile the program
//      javac Methods.java
//
//  Then run the Program
//      java Methods
//  
//      Program should:
//          -Prompts the user to enter 3 integers
//          -Prints out if the numbers are in ascending order or not.
//
//  Commit Program
//      javac Methods.java
//
//  Push Program
//      javac Methods.java

//  Import Scanner
    //  Import Scanner
    import java.util.Scanner;

//  Define Class
public class Methods{

//  Define Main Method
  public static void main(String [] arg){
	Scanner myScanner=new Scanner(System.in);
	
//  Defining int a,b and c	
	int a,b,c;
	
//  Prompting user to enter 3 integers
	System.out.println("Enter three ints: ");
	a=getInt(myScanner);
	b=getInt(myScanner);
	c=getInt(myScanner);
	
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  } //End of Main Method
  
  //	Begin to write methods
  	public static int getInt(Scanner myScanner) {
  		int result = 0;
  		System.out.print("Enter an Int: ");
  			
  				if (myScanner.hasNextInt()) {
  					int Int = myScanner.nextInt();
  					result = Int;
  				}
  				 else {
  					System.out.print("Please enter an integer: ");
  				}
  		return result;
		}		
  	
		public static int larger(int a, int b) {
			int result;
			if (a > b) {
				result = a;
			}
			else result = b;
		
				return result;
		}
		
		public static Boolean ascending(int a, int b, int c) {
			Boolean result;
			if (a < b && b < c) {
				result = true;
			}
			else 
				result = false;
				
				return result;
		}
}   // End of Class
