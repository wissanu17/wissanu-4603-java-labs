package rayayoi.wissanu.lab4;
import java.util.Scanner;
/**
 * The program SicBoV3 that is the continuation of SicBoV2 program.
 * but in this program if you enter wrong format in method {@link #getChoice()} program will ask you to choose again.
 * same as method {@link #playGame(int choice)}
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
 * <br>
 * Press A to play again. press the other keys to exit. : 
 * <li>if you press the other key program will stop and show "Good bye!"</li>
 * <li>if you type wrong format in method {@link #getChoice()} or {@link #playGame(int choice)} program will ask you to type again.
 * 
 * @author Wissanu Rayayoi
 * @version 1.0,13/1/2023
 */
public class SicBoV3 {
    static int choice;
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
                System.out.print("Dice 1 : " + dice1 + ", " + "Dice 2 : " + dice2 + ", " + "Dice 3 : " + dice3);
                System.out.println("Total = " + total);
                System.out.println("You win 20 Bath.");
            } else if (highlow.equalsIgnoreCase("l") && (total >= 11 && total < 19 ) || (highlow.equalsIgnoreCase("h") && (total > 2 && total < 12 ))){
                System.out.print("Dice 1 : " + dice1 + ", " + "Dice 2 : " + dice2 + ", " + "Dice 3 : " + dice3);
                System.out.println("Total = " + total);
                System.out.println("You loose 10 Bath.");
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
                        System.out.println("You loose 10 Bath.");
                    } else {
                        System.out.println(getprize);
                        int reward;
                        reward = 10 * getprize * (3%5+1);
                        System.out.println("You win " + reward + " Bath.");
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
                    System.out.println("Good Bye!");
                    break;
                }
        }
    } 
}
