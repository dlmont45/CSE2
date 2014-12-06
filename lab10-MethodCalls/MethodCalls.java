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
            c=join(a,b);
            System.out.println("Join "+a+" to "+b+" to get "+c);
            System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
            System.out.println("Join -9 and -90 to get "+join(-9,-90));
            
        }
        

//  Call on Second Method
        public static int addDigit(int number, int first){
            int exp = 0;
            int neg = 0;
            if(number < 0) {
                neg = -1;
            }
            else if (number > 0) {
                neg = 1;
            }
            
            int pos = Math.abs(number);
            
            
            if (pos > 10 && pos <100) {
                exp = 2;
            }
            else if (pos > 100 && pos < 1000) {
                exp = 3;
            }
            else if (pos > 1000 && pos < 10000) {
                exp = 4;
            }
            else if (pos > 10000 && pos < 100000) {
                exp = 5;
            }
            int c = (first*((int)Math.pow(10,exp)) + pos)*neg; 
            
            return c;
        }
        
        public static int join(int first, int second) {
            String stringNumber1 = String.valueOf(first);
            String stringNumber2 = String.valueOf(second);
            
            if (first < 0 && second < 0) {
                int abs1 = Math.abs(first);
                int abs2 = Math.abs(second);
                
                String one = String.valueOf(abs1);
                String two = String.valueOf(abs2);
                
                String exceptionResult = one + two;
                int resultNeg = Integer.parseInt(exceptionResult);
                return resultNeg;
            }
            
            else {
            
                String stringResult = stringNumber1 + stringNumber2;
            
                int resultInt = Integer.parseInt(stringResult);
            
                return resultInt;
                
            }    
            
            
        }
        
       

    }  
