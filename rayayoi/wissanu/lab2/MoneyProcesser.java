/**
 * This MoneyProcesser program is compute how much money.User input the number of notes of 
*1,000 Baht, 500 Baht, 100 Baht and 20 Baht, the program should output the total amount of money
*
* Author: Wissanu Rayayoi
* ID: 653040460-3
* Sec: 1
* Date: December 8, 2022
*
**/

package rayayoi.wissanu.lab2;
public class MoneyProcesser {
  
    public static void main(String[] args){
    int len_args = args.length ;
    if (len_args == 4) {
        int oneThousand = Integer.parseInt(args[0]);
        int fiveHundred = Integer.parseInt(args[1]);
        int oneHundred = Integer.parseInt(args[2]);
        int twenty = Integer.parseInt(args[3]);
        oneThousand = 1000*oneThousand;
        fiveHundred = 500*fiveHundred;
        oneHundred = 100*oneHundred;
        twenty = 20*twenty ;
        int totalMoney = oneThousand + fiveHundred + oneHundred + twenty ; 
        System.out.println("total money is " + totalMoney + " Bath" );
    } else {
        System.out.println("Usage:Money Processer <# of 1,000 Bath> <# of 500 Bath> <# of 100 Bath> <# of 20 Bath>");
    }
    }
}