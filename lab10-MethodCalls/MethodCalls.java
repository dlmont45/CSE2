//Dan Lee
//lab 10
//MethodCalls Program

//  First change Directories of the program
//      cd lab10
//  
//  Compile the program
//      javac MethodCalls.java
//
//  Then run the Program
//      java MethodCalls
//  
//      Program should:
/*
        Add 3 to 784 to get 3784
        Add 3, 4, and 5 to 784 to get 543784
        Add 3 to -98 to get: -398
        Join 784 to 22 to get 78422
        Join 87, 42, and 83 to get 874283
        Join -9 and -90 to get 990
*/

//
//  Commit Program
//      javac MethodCalls.java
//
//  Push Program
//      javac MethodCalls.java

//  Import Scanner
    //  Import Scanner
import java.util.Scanner;

//  Define Public Class
    public class MethodCalls{
//  Define Main Method
        public static void main(String []  arg){
            int a=784,b=22,c;
            //Rest of Main Method
            c=addDigit(a,3);
            System.out.println("Add 3 to "+a+" to get "+c);
            c=addDigit(addDigit(c,4),5);
            System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
            System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
/*            c=join(a,b);
            System.out.println("Join "+a+" to "+b+" to get "+c);
            System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
            System.out.println("Join -9 and -90 to get "+join(-9,-90));
*/            
        }
        

//  Call on Second Method
        public static int addDigit(int first, int number){
            int c = (number*1000) + first; 
            return c;
        }
        
        public Static int addDigit((int addDigit(int string, int numberOne)), int numberTwo){
            int addDigit = (numberOne*10000) + string;
            return addDigit;
            int c = addDigit + (numberTwo*100000);
            return c;
        }

    }  
