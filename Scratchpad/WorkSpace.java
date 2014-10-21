   import java.util.Scanner;

//  Define a Class
public class WorkSpace {

    
//  Define a Method
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        
//  Declare Variables
        int x;
        int rows = 0;

//  Prompt the user
            System.out.print("Please enter an integer x between 1 and 9, inclusive: ");
                x = input.nextInt(); 

//  Begin For Loop
                for (int i = 1; i <= x; i++) {
                    // prints each number stack
                    int column = 2 * i - 1;
                    int spaces = 9 - i;
                    
                    for (int j = 0; j < i; j++) {
                        // print each line
                        for (int s = 0; s < spaces; s++){
                            System.out.print(" ");
                        }
                        for (int y = 0; y < column; y++){
                            System.out.print(i);
                            //print each column
                        }
                        
                        System.out.printf("\n");
                    }   //End of inside Loop for line    
                    
                    //Print the dashes
                    for (int z = 0; z < spaces; z++) { 
                        System.out.print(" ");
                    }
                    for (int l = 0; l < column; l++){
                            System.out.print("-");
                    }
                        System.out.print("\n");
                
                }   //End of For loop
                


//  Begin while Loop                
                int i = 0;
                //  Begin big Loop to print stacks
                while (i <= x) {
                    int j = 0;
                    //  Begin Inside Loop for rows
                    while (j < i){
                        int s = 0;
                        //  Begin to print columns
                        while (s < (9 - i)){
                            System.out.print(" ");
                            s++;    // Print Spaces
                        }
                        int y = 0;
                        while (y < (2 * i - 1)){
                            System.out.print(i);
                            y++;    //Print Characters
                        }
                        System.out.printf("\n"); 
                        j++;
                    }   //End of Small while loop
                    int z = 0;
                    //  Begin loop to print lines
                    while (z < (9 - i)){
                        System.out.print(" ");
                        z++;
                    }
                    int l = 0;
                    while (l < (2 * i -1)){
                        System.out.print("-");
                        l++;
                    }
                    System.out.print("\n");
                    i++;
                }   //End of While Loop


//  Begin Do While Loop
                //  Begin big loop for Stacks
                int i = 1;
                do {
                    //  Begin Second loop to print lines
                    int j = 0;
                    do {
                        //  Loop to print columns
                        int s = 0;
                        do {
                            //Print spaces
                            System.out.print(" ");
                            s++;
                        } while (s < (9 - i));
                        int y =  0;
                        do { 
                            //Print characters
                            System.out.print(i);
                            y++;
                        } while (y < (2 * i - 1));
                        System.out.printf("\n");
                        j++;
                        //End of Inside Loop
                        //Begin Loop to print lines after stack
                    }   while (j < i);
                    int z = 0;
                    do {
                        System.out.print(" ");
                        z++;
                    } while (z < (9 - i));
                    int l = 0;
                    do {
                        System.out.print("-");
                        l++;
                    } while (l < (2 * i -1));
                    System.out.print("\n");
                    i++;
                } while (i <= x);
                //  End of Big Loop
                
                
                
    }   //End of Method
}   //End of Class

            
                
