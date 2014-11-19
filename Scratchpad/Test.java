import java.util.Scanner; 
public class Test {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.print("Input a positive integer: ");
            
        }while (myScanner.hasNextInt() != true);
        
        int number = myScanner.nextInt();
        Boolean result = isPrime(number);
        if (number > 0) {
            
                if (result == true) {
                    System.out.println("Prime!");
                }
                else System.out.println("Not Prime");
        }
        else if (number == 0) {
            System.out.println("Goodbye");
            System.exit(0);
        }
        else System.out.println("Invalid");
    
    }
    
    public static Boolean isPrime(int integer) {
        for(int i = 2; i <= (Math.pow(integer,.5)); i++) {
            int z = (integer/i);
            if (z != 0) {
                return false;
            }
            else {
            return true;
            }
        }
    }






    
      
 
}
    

	
     
    
