/** 
 * The program BasicStat that will find the minimum, 
 * the maximum, the average, the median, and the standard deviation 
 * of the list of numbers entered.
 * The program defines two methods, getInput() and CalculateStat()
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

public class BasicStat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (separated by space): ");
        double[] inputnumber = Arrays.stream(scanner.nextLine().split(" ")).filter(x -> !x.equals(""))
                .mapToDouble(Double::parseDouble).toArray();
    Arrays.sort(inputnumber);
    if (inputnumber.length > 10) {
        System.out .println("Please enter a maximum of 10 numbers.");
        System.exit(0);
    }
    if (inputnumber.length == 0) {
        System.out.println("Please enter at least one number.");;
        System.exit(0);;
    }
    System.out.print("Sorted number are ");
    for (double single : inputnumber) {
        System.out.print(single + " ");
    }
    System.out.println ("\nMinimum: " + String.format("%.2f", inputnumber[0]));
    System.out.println("Maximum: " + String.format("%.2f" , inputnumber[inputnumber.length - 1]));
    double sum = 0;
    for (double single : inputnumber) {
        sum = sum + single;
    }
    double avg = sum / inputnumber.length;
    System.out.println("Average: " + String.format("%.2f", avg));
    double medians;
    if (inputnumber.length % 2 == 0) {
        medians = ((double)inputnumber[inputnumber.length / 2] + (double)inputnumber[inputnumber.length / 2 - 1]) / 2;
    } else {
        medians = (double)inputnumber[(int) Math.floor(inputnumber.length / 2)];
    }
    System.out.println("Median: " + String.format("%.2f", medians));
    scanner.close();
    double beforesum = 0;
    double lastsum = 0;
    double[] average = new double[2000];
        for (int i = 0; i < inputnumber.length; i++) {
            double fvalue = (Math.pow((inputnumber[i] - avg),2));
            average[i] = fvalue;
        }
        for (double j : average) {
            lastsum = (beforesum += j);
        }
    Double averagex1 = lastsum/(inputnumber.length);
    double SquareRoot = Math.sqrt(averagex1);
    System.out.println("standard Deviation: " + String.format("%.2f" , SquareRoot));
    }
}


