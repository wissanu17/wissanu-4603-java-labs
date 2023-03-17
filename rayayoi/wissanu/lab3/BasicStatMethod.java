/** 
 * The program BasicStat that will find the minimum, 
 * the maximum, the average, the median, and the standard deviation 
 * of the list of numbers entered.
 * Its output format is
 * Enter number (separated by space): 2 5 4 5 8
 * Sorted number are 2.0 4.0 5.0 5.0 8.0
 * Minimum: <minimum of input>
 * Maximum: <maximum of input>
 * Average: <average of input>
 * Median: <median of input>
 * standard Deviation: <standard diviation of input>
 * 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date: January 6, 2022
 * 
 **/

package rayayoi.wissanu.lab3;

import java.util.Scanner;
import java.util.Arrays;

public class BasicStatMethod {
    static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (separated by space): ");
        String arrayinput = scanner.nextLine();
        if (arrayinput.equalsIgnoreCase("")) {
            System.out .println("Please enter at least one numbers.");
            System.exit(0);
        }
        scanner.close();
        return arrayinput;
    }

    static void calculateStat(String arraydouble) {
        String[] newarray = arraydouble.split(" ");
        double[] inputdouble = new double[newarray.length];
        for (int i = 0; i < newarray.length; i++) {
            inputdouble[i] = Double.parseDouble(newarray[i]);
        }
        Arrays.sort(inputdouble);
        if (inputdouble.length > 10) {
            System.out .println("Please enter a maximum of 10 numbers.");
            System.exit(0);
        }
        System.out.print("Sorted number are ");
        for (double data : inputdouble) {
            System.out.print(data + " ");
        }
        System.out.println ("\nMinimum: " + String.format("%.2f", inputdouble[0]));
        System.out.println("Maximum: " + String.format("%.2f" , inputdouble[inputdouble.length - 1]));
        double sum = 0;
        for (double data : inputdouble) {
            sum = sum + data;
        }
        double avg = sum / inputdouble.length;
        System.out.println("Average: " + String.format("%.2f", avg));
        double medians;
        if (inputdouble.length % 2 == 0) {
            medians = ((double)inputdouble[inputdouble.length / 2] + (double)inputdouble[inputdouble.length / 2 - 1]) / 2;
        } else {
            medians = (double)inputdouble[(int) Math.floor(inputdouble.length / 2)];
        }
        System.out.println("Median: " + String.format("%.2f", medians));
        double beforesum = 0;
        double lastsum = 0;
        double[] average = new double[200];
        for (int i = 0; i < inputdouble.length; i++) {
            double lastvalue = (Math.pow((inputdouble[i] - avg),2));
            average[i] = lastvalue;
        }
        for (double j : average) {
            lastsum = (beforesum += j);
        }
        Double newaverage = lastsum / (inputdouble.length);
        double squareroot = Math.sqrt(newaverage);
        System.out.println("standard Deviation: " + String.format("%.2f" , squareroot));
    }
    public static void main(String[] args) {
        String input = getInput();
        calculateStat(input);
    }
}
