//Dan Lee
//hw 11
//Matrix Sorter Program

//  First change Directories of the program
//      cd hw11
//  
//  Compile the program
//      javac MatrixSorter.java
//
//  Then run the Program
//      java MatrixSorter
//  
/*      Program should:

       
*/
//  Commit Program
//      javac MatrixSorter.java
//
//  Push Program
//      javac MatrixSorter.java

import java.util.*;
public class MatrixSorter {
    public static void main(String [] args) {
        int mat3d[][][];
        mat3d=buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+
      	findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
        
        //TEST FOR THE SORT*****
        // int[] test = {1,2,4,2,6,5,3};
        // System.out.println(Arrays.toString(test));
        // sort(test);
        //         System.out.println(Arrays.toString(test));


        
        
    }//End of Main Method
    
    //Begin build Method
    public static int [][][] buildMat3d() {
        Random rand = new Random(); //Initialize Random
        int [][][] a = new int [3][][];//Create Array
        for (int i = 0; i < 3; i++) {
            a[i] = new int [3+(i*2)][];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new int [j+i+1];
                for (int z = 0; z < a[i][j].length; z++) {
                    a[i][j][z] = rand.nextInt(100); //Assign Random Value
                }
            }
        }
        return a; //Return the build
    }//End of Method
    
    //Method Given
    public static void show(int [][][] Mat3d) {
        for(int f = 0; f < Mat3d.length; f++) {
            System.out.println("--------------------------------Slab "+(f+1));
            for(int z = 0; z < Mat3d[f].length; z++) {
                for(int j = 0; j < Mat3d[f][z].length; j++) {
                    System.out.print(Mat3d[f][z][j] + " ");
                }
                System.out.print("\n");
            }
        }
        System.out.println("--------------------------------");
    }//End of Method
    
    //Begin findMin Method
    public static int findMin(int [][][] a) {
        int min = a[0][0][0]; //Set min to first of first of first array
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                for(int z = 0; z < a[i][j].length; z++) {
                    if(a[i][j][z] < min) { //Compare the values
                        min = a [i][j][z]; //Set new min
                    }
                }
            }
        }
        return min; //Return min
    }//End of Method
    
    //Begin insertion sort to sort the first column
     public static void sort(int [][] c) {
        for(int p = 0; p < c.length; p++) {
            sort(c[p]); //Call on selection sort to sort each row first
        }
        //Insertion Sort
        for(int k = 1; k < c.length; k++) {
            // find the insertion location while moving all larger element up
            int j = k;
            while (j > 0 && c[j][0] < c[j-1][0]) {
                int[] temp  = c[j];
                c[j] = c[j - 1];
                c[j - 1] = temp;
                j--;
            }
        }
    }//End of Method
    
    //Selection Sort for each row
    public static void sort(int [] b) {
        for (int i = 0; i < b.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < b.length; j++) {
                if (b[j] < b[index]) {
                    index = j;
                }
            }
            int temp = b[index];  
            b[index] = b[i];
            b[i] = temp;
        }
    }//End of Method

   
    
    
}//End of Class