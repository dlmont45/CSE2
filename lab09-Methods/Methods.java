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
	Scanner scan=new Scanner(System.in);
	
//  Defining int a,b and c	
	int a,b,c;
	
//  Prompting user to enter 3 integers
	System.out.println("Enter three ints: ");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	
//	Begin to write nested methods
		public static int larger(int a, int b, int c) {
			int result;
			if (a > b && a > c)
				result = a;
			else if (b > a && b > c)
				result = b;
			else if (c > a && c > b)
				result = c;
		
				return result;
		}
		
		public static int ascending(int a, int b, int c) {
			int result;
			if (a < b && b < c) 
				result = true;
			else 
				result = false;
				
				return results;
		}
		
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  } //End of Main Method
}   // End of Class
