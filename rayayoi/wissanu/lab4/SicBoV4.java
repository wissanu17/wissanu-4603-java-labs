package rayayoi.wissanu.lab4;

import java.util.Scanner;
/**
 * The program SicBoV4 that is the continuation of SicBoV3 program.
 * but in this program keeps track of what the player has played and what the results are.
 * At first program use {@link #getChoice()} method to aks you to choose what game do you want to play.
 * <br>
 * Welcome to วิษณุ ระยาย้อย (653040460-3) Game : 
 * <ul>
 * <li>Type 1 for choosing high or low numbers.</li>
 * <li>Type 2 for choosing number between 1-6.</li>
 * <li>Enter yur choice : Enter 1 or 2 only </li>
 * <li>if you type 1 or 2 program will go to method {@link #playGame(choice)}
 * <li>and if you type correct format in method {@link #playGame(choice)} 
 * program will show output same as you type wrong format in method getChoice() like below
 *    Game 1 :
 *    You have bet on 6
 *    you loose 10 Bath.
 * <br>
 * Press A to play again. press the other keys to exit. : 
 * <li>if you press the other key program will go to method {@link #gameResult()} and show output in below.
 * 
 * 
 * 
 * stop and show "Good bye!"</li>
 * <li>if you type wrong format in method {@link #getChoice()} or {@link #playGame(int choice)} program will ask you to type again.
 * 
 * @author Wissanu Rayayoi
 * @version 1.0,13/1/2023
 */
public class SicBoV4 {
    static int choice;
    // The maximum number of games
    final static int MAX_INPUT = 100;
    // gamePlay keep track of what the player has play in the game
    static String[] gamePlay = new String[MAX_INPUT];
    // gameResults keep track of what the result of the game
    static String[] gameResult = new String[MAX_INPUT];
    // The current number of games that have been  played
    static int currentInput = 0;
    static Scanner scanner = new Scanner(System.in);
    /**
     * get choice from user
     */
    static void getChoice() {
        System.out.println("Welcome to วิษณุ ระยาย้อย (653040460-3) Game : ");
        System.out.println("Type 1 for choosing high or low numbers.");
        System.out.println("Type 2 for choosing number between 1-6.");
        System.out.print("Enter your choice : ");
        String getchoice = scanner.next();
        if (getchoice.equalsIgnoreCase("1") || (getchoice.equalsIgnoreCase("2"))) {
            choice =  Integer.parseInt(getchoice);
        }
        else {
            getChoice();
        }
    }
    /**
     * 
     * @param pickgame
     */
    static void playGame(int pickgame) {
        if (pickgame == 1) {
            System.out.print("Type in h for high and l for low: ");
            String highlow = scanner.next();
            int dice1 = 1 + (int)(Math.random() * ((6-1) + 1));
            int dice2 = 1 + (int)(Math.random() * ((6-1) + 1));
            int dice3 = 1 + (int)(Math.random() * ((6-1) + 1));
            int total = dice1 + dice2 + dice3;
            if (highlow.equalsIgnoreCase("h") && (total >= 11 && total < 19 ) || (highlow.equalsIgnoreCase("l") && (total > 2 && total < 12 ))) {
                gamePlay[currentInput] = highlow;
                System.out.print("Dice 1 : " + dice1 + ", " + "Dice 2 : " + dice2 + ", " + "Dice 3 : " + dice3);
                System.out.println("Total = " + total);
                String result = "You win 20 Bath.";
                System.out.println(result);
                gameResult[currentInput] = result;
                currentInput++;
            } else if (highlow.equalsIgnoreCase("l") && (total >= 11 && total < 19 ) || (highlow.equalsIgnoreCase("h") && (total > 2 && total < 12 ))){
                gamePlay[currentInput] = highlow;
                System.out.print("Dice 1 : " + dice1 + ", " + "Dice 2 : " + dice2 + ", " + "Dice 3 : " + dice3);
                System.out.println("Total = " + total);
                String result = "You loose 10 Bath.";
                System.out.println(result);
                gameResult[currentInput] = result;
                currentInput++;
            }
            else {
                System.out.println("Incorect input. Enter h for high and l for low only.");
                playGame(choice);
            }
        } else if (pickgame == 2) {
            System.out.print("Type in a number to bet on (1-6): ");
            Integer numAnwser;
            String choosenum = scanner.next();
            if (choosenum.equals("1") || choosenum.equals("2") || choosenum.equals("3") || choosenum.equals("4") 
            || choosenum.equals("5") || choosenum.equals("6")) {
                numAnwser =  Integer.parseInt(choosenum);
                int dice1 = 1 + (int)(Math.random() * ((6-1) + 1));
                int dice2 = 1 + (int)(Math.random() * ((6-1) + 1));
                int dice3 = 1 + (int)(Math.random() * ((6-1) + 1));
                System.out.print("Dice 1 : " + dice1 + ", ");
                System.out.print("Dice 2 : " + dice2 + ", ");
                System.out.println("Dice 3 : " + dice3);
                int getprize = 0;
                if (numAnwser < 7 && numAnwser > 0) {
                    if (numAnwser == dice1) {
                        getprize += 1;
                    } if (numAnwser == dice2) {
                        getprize += 1;
                    } if (numAnwser == dice3) {
                        getprize += 1;
                    } if (getprize == 0 ) {
                        gamePlay[currentInput] = choosenum;
                        String result = "You loose 10 Bath.";
                        System.out.println(result);
                        gameResult[currentInput] = result;
                        currentInput++;
                    } else {
                        gamePlay[currentInput] = choosenum;
                        System.out.println(getprize);
                        int reward = 10 * getprize * (3%5+1);
                        String result = "You win " + reward + " Bath.";
                        System.out.println(result);
                        gameResult[currentInput] = result;
                        currentInput++;
                    }
                }
            } else {
                System.out.println("Incorrect input.Please enter number 1-6 only.");
                playGame(choice);           
            }
        } else {
            System.out.println("Incorrect input. Please enter number 1-2 only.");
            getChoice();
            playGame(choice);
        }
    }
    /**
     * game result
     */
    public static void gameResult() {
        System.out.println("### Game Play Summary ###");
        for (int i = 0; i < currentInput; i++) {
            System.out.println("Game " + i + " : ");
            System.out.println("You have bet on " + gamePlay[i]);
            System.out.println(gameResult[i]);
        }
    } 
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        getChoice();
        playGame(choice);
        while (true) {
        System.out.println("Press A to play again. press the other keys to exit. : ");
        String again1 = scanner.next();
            if (again1.equalsIgnoreCase("a")) {
                    getChoice();
                    playGame(choice);
                } else {
                    gameResult();
                    System.out.println("Good Bye!");
                    break;
                }
        }
    }
}