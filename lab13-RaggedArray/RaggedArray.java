//Dan Lee
//lab 13
//Ragged Array Program


//  First change Directories of the program
//      cd lab13
//  
//  Compile the program
//      javac RaggedArray.java
//
//  Then run the Program
//      java RaggedArray
//  
//      Program should:
/*
    -Fill the array with random numbers in the range 0...39, inclusive.
    -Display the array
    -Sort each row of the array in ascending order
    -Display the array.

*/

//
//  Commit Program
//      javac RaggedArray.java
//
//  Push Program
//      javac RaggedArray.java

//  Define Class
import java.util.*;
public class RaggedArray {
    public static void main (String [] args) {
        Random rand = new Random();
        //Initiate Array
        int [][] ragged = new int [5][];
        for (int i = 0; i < 5; i++) {
            ragged[i] = new int [5+(i*3)];
            for (int j = 0; j < ragged[i].length; j++) {
                ragged[i][j] = rand.nextInt(40);
            }
        }

        //Print Arrays
        System.out.println("The array before sorting");
        print(ragged);
        System.out.println();
        sort(ragged);
        System.out.println("The array after sorting");
        print(ragged);

        
    
     
    }//End of Method
    
    //Begin Sort Method
    public static void sort(int [][] b) {
        /*for(int x = 0; x < b.length; x++) {
            int u, v, first, temp;
            for (u = 0; u <= b[u].length; u++) {
                first = 0;
                for (v = u; v <= b[v].length; v++) {
                    if (b[v] < b[first]) {
                        first = v;
                    }
                }    
            temp = b[first];
            b[first] = b[u];
            b[u] = temp;
            
            } */
        for (int x = 0; x < b.length; x++) {
            java.util.Arrays.sort(b[x]);
        }
    }//End of Method
    
    //Begin print Method
    public static void print(int [][] a) {
        for(int z = 0; z < a.length; z++) {
            System.out.println(Arrays.toString(a[z]));
        } 
    }//End of Method
    
}//End of Classm

