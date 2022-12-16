/**
 * This DataType program is that declare the following variables in the given types and conditions:
*A String variable with value = your name (firstname lastname)
*A String variable with value = your student ID
*A char variable with value = theFirstLetterOfYourFirstName (need to use String subroutine to get the first letter)
*A boolean variable with value = true
*An int variable with value = theLastTwoDigitsOfYourlIDNumber (declare a variable with an octal value)  For example, 
for 34 in base 10, you should declare it as  myIDInOctal = 042
*An int variable with value = theLastTwoDigitsOfYourIDNumber (declare a variable with a hexadecimal value)
*A long variable with value = theLastTwoDigitsOfYourIDNumber (declare a variable with a long value)
*A float variable with value = theLastTwoDigitsOfYourIDNumber and has the floating point of theFirstTwoDigitsOfYourIDNumber
*A double variable with value = theLastTwoDigitsOfYourIDNumber and has the floating point of theLastTwoDigitsOfCurrentYear
*
* Author: Wissanu Rayayoi
* ID: 653040460-3
* Sec: 1
* Date: December 8, 2022
*
**/
package rayayoi.wissanu.lab2;

public class DataType {
    public static void main(String[] args){
        String name = "Wissanu Rayayoi" ;
        String id = "6530404603" ;
        char firstchar = 'P' ;
        Boolean boolean1 = true ;
        int octal = 003 ; 
        int hexal = 0x03 ;
        long Lid = 03L;
        float dotID = 03.65f;
        double dotYear = 03.22d;
        
        System.out.println("My name is " + name);
        System.out.println("My student ID was " + id);
        System.out.println(firstchar + " "+ boolean1 + " " + octal + " " + hexal );
        System.out.println(Lid + " " + dotID + " " + dotYear);
    }
    
}
