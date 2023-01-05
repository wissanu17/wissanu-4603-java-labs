package rayayoi.wissanu.lab3;
import java.util.Scanner;

public class SciBo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose how do you want to bet: ");
        System.out.println("Type 1 for choosing high or low numbers.");
        System.out.println("Type 2 for choosing number between 1-6.");
        System.out.print("Enter your choice: ");
        Integer userplay = scanner.nextInt();
        if (userplay == 1) {
            System.out.print("Type in h for high and l for low: ");
            String highlow = scanner.next();
            int dice1 = 1 + (int)(Math.random() * ((6-1) + 1));
            int dice2 = 1 + (int)(Math.random() * ((6-1) + 1));
            int dice3 = 1 + (int)(Math.random() * ((6-1) + 1));
            System.out.print("Dice 1 : " + dice1 + ", ");
            System.out.print("Dice 2 : " + dice2 + ", ");
            System.out.println("Dice 3 : " + dice3);
            int total = dice1 + dice2 + dice3;
            System.out.println("Total = " + total);
            if (highlow.equalsIgnoreCase("h") && (total >= 11 && total < 19 ) || (highlow.equalsIgnoreCase("l") && (total > 2 && total < 12 ))) {
                System.out.println("You win 20 Bath.");
            } else if (highlow.equalsIgnoreCase("l") && (total >= 11 && total < 19 ) || (highlow.equalsIgnoreCase("h") && (total > 2 && total < 12 ))){
                    System.out.println("you loose 10 Bath.");
            }
            else {
                System.out.println("Incorect input. Enter h for high and l for low only.");
            }
        } else if (userplay == 2) {
            System.out.print("Type in a number to bet on (1-6): ");
            Integer choosenum = scanner.nextInt();
            int dice1 = 1 + (int)(Math.random() * ((6-1) + 1));
            int dice2 = 1 + (int)(Math.random() * ((6-1) + 1));
            int dice3 = 1 + (int)(Math.random() * ((6-1) + 1));
            System.out.print("Dice 1 : " + dice1 + ", ");
            System.out.print("Dice 2 : " + dice2 + ", ");
            System.out.println("Dice 3 : " + dice3);
            int getprize = 0;
            if (choosenum < 7 && choosenum > 0) {
                if (choosenum == dice1) {
                    getprize += 30;
                } if (choosenum == dice2) {
                    getprize += 30;
                } if (choosenum == dice3) {
                    getprize += 30;
                } if (getprize == 0 ) {
                    System.out.println("you loose 10 Bath.");
                } else {
                    System.out.println("you win " + getprize + " Bath.");
                }
            } else {
                System.out.println("Incorrect input.Please enter number 1-6 only.");           
            }
        } else {
            System.out.println("Incorrect input. Please enter number 1-2 only.");
        }
        scanner.close();
    }
}