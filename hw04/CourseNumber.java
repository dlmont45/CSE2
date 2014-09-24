//Dan Lee
//hw 04
//Course Number Program

//  First change Directories of the program
//      cd hw04
//  
//  Compile the program
//      javac CourseNumber.java
//
//  Then run the Program
//      java CourseNumber
//  
//      Program should:
//          -Prompts the user to enter the course number.
//          -Print out the semester and year the course was given.
//
//  Commit Program
//      javac CourseNumber.java
//
//  Push Program
//      javac CourseNumber.java

//  Import Scanner
    import java.util.Scanner;
        
//  Define a Class
    public class CourseNumber {
            
//  Define a Method
        public static void main (String [] args) {
            Scanner input = new Scanner(System.in);
        
    //  Prompt the user to give the course number
            System.out.print("Enter the Course Number: ");
            int course = input.nextInt();
            int year; 
            int semester;
            
            year = (int)(course/100);
            semester = course - (year*100);
            
            if (course >= 185610 && course <=201440) {
                switch (semester){
                    case 10: System.out.println("The course was taken in the Spring Semester of "+year); break;
                    case 20: System.out.println("The course was taken in the Summer 1 Semester of "+year); break;
                    case 30: System.out.println("The course was taken in the Summer 2 Semester of "+year); break;
                    case 40: System.out.println("The course was taken in the Fall Semester of "+year);
                }
                
            }
            else { System.out.println("You did not enter a correct course number.");
            }
            
            
            
            
        }   //End of Method
    
    }   //End of Class     