//Dan Lee
//lab 08
//More Loops Program

//  First change Directories of the program
//      cd lab08
//  
//  Compile the program
//      javac MoreLoops.java
//
//  Then run the Program
//      java MoreLoops
//  
//      Program should:
//          -Rewrite lines of code using different kinds of loops
//          -Still have the same output as before.
//
//  Commit Program
//      javac MoreLoops.java
//
//  Push Program
//      javac MoreLoops.java



//    import java.util.Scanner;
//        public class MoreLoops{
//            public static void main(String[] arg){
//	        Scanner scan=new Scanner(System.in);
//	        int n=0;
//
//	            System.out.print("Enter an int- ");
//	                while(!scan.hasNextInt()){
//	                scan.next(); //get rid of the junk entered by user
//	                System.out.print("You did not enter an int; try again- ");
//              	}

        import java.util.Scanner;
            public class MoreLoops{
                public static void main(String[] arg){
	            Scanner scan=new Scanner(System.in);
	            int n=0;

	                System.out.print("Enter an int- ");
	                do {
	                scan.next(); //get rid of the junk entered by user
	                System.out.print("You did not enter an int; try again- ");
                	}  while (!scan.hasNextInt())
                	
                	
//        n=scan.nextInt();
//
//	    for(int j=0;j<n && j<40;j++){
//	        for(int k=0;k<j+1;k++){
//		    System.out.print('*');
//	        }
//	    System.out.println();
//	    }        	


        n=scan.nextInt();
        
        int j = 0
        int k = 0
        
	    while(j < n && j < 40){
	        while (k < j + 1){
		    System.out.print('*');
		    k++
	        }
	    System.out.println();
	    j++
	    }
	    
	    
//	    int k=4;
//
//	    do{
//	        System.out.println("k="+k);
//	        k++;
//  	    }
//              while(k<4);
        
        int k = 4
        
        while (k < 4) {
            System.out.println("k="+k);
            k++
        }
        
        
//        int count=0;
//        while(true){
//        switch(n){
//        default: System.out.println(n + " is > 5 or <1");
//        break;
//        case 1:
//        case 2: System.out.print("Case 2 ");
//        continue;
//        case 3: break;
//        case 4: System.out.println("Case 4");
//        case 5: System.out.println("Case 5");
//        break;
//        }
//        count++;
//        if(count>10)
//        break;
//        }

        int count=0;
        while(true){
	        switch(n){
	        default: System.out.println(n + " is > 5 or <1");
		        break;
	    case 1: 
	    case 2: System.out.print("Case 2 "); 
		    continue;
	    case 3: break;
	    case 4: System.out.println("Case 4");
	    case 5: System.out.println("Case 5");
		    break;
	    }
	    count++;
	    if(count>10)
		    break;
