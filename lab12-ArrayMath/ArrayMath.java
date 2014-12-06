//Dan Lee
//lab 12
//Array Math Program

//  First change Directories of the program
//      cd lab12
//  
//  Compile the program
//      javac ArrayMath.java
//
//  Then run the Program
//      java ArrayMath
//  
//      Program should:
/*
   -Create two Methods that are called in the Main Method.
   -Display Correct results.
*/

//
//  Commit Program
//      javac ArrayMath.java
//
//  Push Program
//      javac ArrayMath.java
import java.util.Arrays;
//  Define Class
public class ArrayMath{
    //Define Main Method
  public static void main(String [] arg){
      //Initiate Arrays
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    //Prints the Results
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  //Begin Method display
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }//End of Method
  
  //Begin Method addArrays
  public static double [] addArrays(double [] a, double [] b) {
      int x = a.length;
      if (b.length > a.length) {
          x = b.length;
      }
      double [] result = new double [x];
      for (int i = 0; i < a.length; i++) {
        if(i < a.length) result[i] += a[i];
        if(i < b.length) result[i] += b[i];
      }//**********HOW DO I ADD THE 0'S???
      return result;
  }//End of Method
  
  //Begin Method equals
  public static Boolean equals(double [] a, double [] b) {
      if (a.length == b.length) {
          for (int i = 0; i < a.length; i++) {
              if (a[i] == b[i]) {
                  continue;
              }
              else return false;
          }
          return true;
      }
      else return false;
  }//End of Method
  
}//End of Class
