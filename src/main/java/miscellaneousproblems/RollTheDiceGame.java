package miscellaneousproblems;

import java.util.Random;
import java.util.Scanner;

/**
 * The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 * 1.Roll the die for the user (generate a Random number between 1 – 6)
 *   and advance the user that number of spaces
 *   on the game board. Here’s the code to do this ((import is java.util.Random):
 * 2.After each roll, tell the user which game space they are on and how many more
 * spaces they have to go to win.
 * 3.Repeat this 4 additional times, for 5 rolls in total.
 * 4.However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
 * 5.If they are greater than or less than 20 spaces exactly, they lose.
 *
 * Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */

public class RollTheDiceGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Roll the Die! Let's begin...");
        Random rm=new Random();
        int lastSpace=20;
        int maxRolls=5;
        int currentSpace=0;

        for(int i =0;i<maxRolls;i++){
            int die=rm.nextInt(6)+1;
            currentSpace=currentSpace+die;
            System.out.println(String.format("Roll #%d: You've rolled a %d. ", i, die));
                if(lastSpace==0){
                    System.out.println("\"You're on space \" + currentSpace + \". Congrats, you win!\"");
                    break;
                }
                else if(currentSpace>lastSpace) {
                    System.out.println("\"You're on space \" + currentSpace + \". Sorry , you loss!\"");
                    break;
                }
                    else if(i==maxRolls && currentSpace < lastSpace){
                        System.out.println("You're on space " + currentSpace + ".");
                        System.out.println("Unfortunately, you didn't make it to all " +
                                lastSpace + " spaces. You lose!");
                    }
                    else{
                        int spacesToGo=lastSpace-currentSpace;{
                        System.out.print("You are now on space " + currentSpace +
                                " and have " + spacesToGo + " more to go.");

                    }
                }
        }

    }
}
