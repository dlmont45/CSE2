//Dan Lee
//hw 05
//Boola Boola Program

//  First change Directories of the program
//      cd hw05
//  
//  Compile the program
//      javac BoolaBoola.java
//
//  Then run the Program
//      java BoolaBoola
//  
//      Program should:
//          -Prompts the user to answer from a selection of random Boolean variables.
//          -Print out correct or try again.
//
//  Commit Program
//      javac BoolaBoola.java
//
//  Push Program
//      javac BoolaBoola.java

//  Import Scanner
    import java.util.Scanner;
        
//  Define a Class
    public class BoolaBoola {
        
//  Define Method
        public static void main(String [] args) {
            Scanner input = new Scanner(System.in);

//  Declare variables
            int value = (int)(Math.random());
            int operation = (int)(1+Math.random()*4);
            boolean one;
            boolean two;
            boolean three;
            String response;
            
            if (value >=5) {    //Assigning boolean values
                one = true;
                two = true;
                three = true;
            }
            else {              //Assigning boolean values, else.
                one = false;
                two = false;
                three = false;
            }
                
//  State If and Else Statement.
//  Create 4 cases, and then nest if else statements inside.
            switch (operation) {
                case 1: { System.out.println("Is "+one+" && "+two+" && "+three+", true or false");
                            System.out.print("Enter response: ");
                            response = input.next();
                                if (response.equals("true")){
                                    System.out.println("Correct");
                                }
                                else System.out.println("Wrong; try again");
                                    
                } break;    
            
                case 2: { System.out.println("Is "+one+" && "+two+" || "+three+", true or false");
                            System.out.print("Enter response: ");
                            response = input.next();
                                if (response.equals("true")){
                                    System.out.println("Correct");
                                }
                                else System.out.println("Wrong; try again");
                } break;
                
                case 3: { System.out.println("Is "+one+" || "+two+" || "+three+", true or false");
                            System.out.print("Enter response: ");
                            response = input.next();
                                if (response.equals("true")){
                                    System.out.println("Correct");
                                }
                                else System.out.println("Wrong; try again");
                } break;
                
                case 4: { System.out.println("Is "+one+" || "+two+" && "+three+", true or false");
                            System.out.print("Enter response: ");
                            response = input.next();
                                if (response.equals("true")){
                                    System.out.println("Correct");
                                }
                                else System.out.println("Wrong; try again");
                } break;
            }   //End of switch
            
        }   //End of Method
}   //End of Class

//  testtest/test