//Dan Lee
//hw 06
//Roulette Program

//  First change Directories of the program
//      cd hw06
//  
//  Compile the program
//      javac Roulette.java
//
//  Then run the Program
//      java Roulette
//  
//      Program should:
//          -Generate random integers and test 100 rounds 1000 times.
//          -Store and present data of times winning, total winnings and times lost.
//
//  Commit Program
//      javac Roulette.java
//
//  Push Program
//      javac Roulette.java

//  Define a Class
    public class Roulette {

//  Define a Method
        public static void main(String[] args) {

//  List variables for Loop
            int winnings = 0;
            int right = 0;
            int wrong = 0;
            int profit = 0;
            int lost = 0;
            int finalWinnings;
            int random;
            int myRandom;
            int x = 0;
            int y = 0;
            double money = 0;

        
//  Begin Loops
            while (x < 1000) {  //Outer loop of 1000 trials
                myRandom = (int) (Math.random() * 38);  //Players Random for game
                while (y < 100) {   //Game Loop
                    random = (int) (Math.random() * 38);    //Roulette Random
                    if (random == myRandom) {
                        right++;
                    } else {
                        wrong++;
                    }
                    if (right >= 3) {
                    profit++;
                    }
                    else if (right == 0) {
                    lost++;
                    }
                    money += right*36;
                    y++;        //End of first trial
            }
            
            //Reset variables so loop can restart
            
            right = 0;
            wrong = 0;
            x++;    //End of first game
        }
        //Print out results stored
        System.out.println("You made money " + profit + " times.");
        System.out.println("You made "+ money + " dollars out of 100,000");
        System.out.println("You lost all of your money " + lost + " times.");

    }//End of Method
}//End of Class
