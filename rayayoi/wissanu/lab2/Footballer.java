/**
 * This Footballer program is to accept three arguments: footballer name, the 
*  the nationality of the footballer, and the football club that the footballer plays.
*  Its output format is 
*  “My Favorite football player  is <athlete_name>.  
*  His nationality as <athlete_nationality>
*  He plays for <his football club>” 
*
* Author: Wissanu Rayayoi
* ID: 653040460-3
* Sec: 1
* Date: December 8, 2022
*
**/

package rayayoi.wissanu.lab2;

public class Footballer {

    public static void main(String[] args) {
       
        int len_args = args.length;
        if (len_args == 3) {
            String name = (args[0]);
            String nation = (args[1]);
            String club = (args[2]);
            System.out.println("My favorite football player is " + name + ".\n"+ "His nationality is " + nation + ".\n"+ "He play for " + club + ".");
        } else {
            System.out.println("Usage:java Adder <footballer name> <nationality> <footbal club>");
        }
    }
}