//Dan Lee
//hw 05
//Burger King Program

//  First change Directories of the program
//      cd hw05
//  
//  Compile the program
//      javac BurgerKing.java
//
//  Then run the Program
//      java BurgerKing
//  
//      Program should:
//          -Prompts the user to enter the selection of item.
//          -Print out the item and any additional information.
//
//  Commit Program
//      javac BurgerKing.java
//
//  Push Program
//      javac BurgerKing.java

//  Import Scanner
    import java.util.Scanner;
        
//  Define a Class
    public class BurgerKing {
        
//  Define Method
        public static void main(String [] args) {
            Scanner input = new Scanner(System.in);
     
//  Begin prompt to ask user
            System.out.print("Enter a letter to indicate choice of Burger (B or b)" +
            "Soda (S or s) Fries (F or f) "); 
            String item = " ";
            String friesKind = " ";
            String burgerKind = " ";
            String sodaKind = " ";
            
            char x;
            char fries;
            char soda;
            char burger;
            
            item = input.next();
            x = item.charAt(0);
            
            sodaKind = input.next();
            soda = sodaKind.charAt(0);
            
            friesKind = input.next();
            fries = friesKind.charAt(0);
            
            burgerKind = input.next();
            burger = burgerKind.charAt(0);
            
            
//  Begin if else statements to include all options
//      Created 3 cases for burger, soda and fries
//      Then I nested the options each item has as seperate cases inside the cases.
            if (!(item.length() > 1)) { //Only accepting the first digits.
                
                switch (x) {
                    case 'B':
                    case 'b':   
                        System.out.print("Enter for choice of cheese, all the fixins or none: ");
                        burgerKind = input.next();
                            switch (burger) {
                                case 'C':
                                case 'c':
                                    System.out.println("You ordered a burger with cheese.");
                                    break;
                                case 'A':
                                case 'a':
                                    System.out.println("You ordered a burger with all the fixins.");
                                    break;
                                case 'N':
                                case 'n':
                                    System.out.println("You ordered a burger with no additions.");
                                    break;
                                        }   //End of Burger Switch
                                        break;
                    case 'S':
                    case 's':
                        System.out.print("Enter for choice of Pepsi(P or p), Coke, Sprite, or Mountain Dew: ");
                        sodaKind = input.next();
                            switch (soda) {
                                case 'P':
                                case 'p':
                                    System.out.println("You ordered a Pepsi.");
                                    break;
                                case 'C':
                                case 'c':
                                    System.out.println("You ordered a Coke.");
                                    break;
                                case 'S':
                                case 's':
                                    System.out.println("You ordered a Sprite.");
                                    break;
                                case 'M':
                                case 'm':
                                    System.out.println("You ordered a Mountain Dew.");
                                    break;
                                        }   //End of Soda Switch
                                        break;
                    case 'F':
                    case 'f':
                        System.out.print("Enter for Size of fries(L or l): ");
                        friesKind = input.next();
                            switch (fries) {
                                case 'L':
                                case 'l':
                                    System.out.println("You ordered large fries.");
                                    break;
                                case 'S':
                                case 's':
                                    System.out.println("You ordered small fries.");
                                    break;
                                        }   //End of Fries Switch
                                        break;
                            
                    
                    }   //End of Selection switch
            }   //End of if
            
            else System.out.println("You did not enter B, b, S, s, F, or f");   //The else statement

            
     
        
        }   //End of method
        
}   //End of class

            //testtest/test
    
    