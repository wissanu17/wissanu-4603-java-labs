/**
 * This StringAPI program is to accepts one input argument (your school name) 
* and save that argument in the variable called schoolName  and then use the method of class String 
* to check whether the variable schoolName has the substring “college” (ignore cases) 
* and “university” (ignore cases) and then display output
*
* Author: Wissanu Rayayoi
* ID: 653040460-3
* Sec: 1
* Date: December 8, 2022
*
**/

package rayayoi.wissanu.lab2;

public class StringAPI {
    public static void main(String[] args) {
        String schoolName = args[0];
        int len_args = args.length;
        String subCollege = "(?i).*college*";
        String subUniversity = "(?i).*university*";
    
        if (len_args == 1 ){
                if (schoolName.matches(subCollege)){
                    System.out.println(schoolName + " is a college");
                } else if (schoolName.matches(subUniversity)){
                    System.out.println(schoolName + " is a university");
                } else {
                    System.out.print(schoolName + " is neither a university nor a college");
                }
        } else {
            System.out.print("StringAPI <schoolName>");
        }
    }
}
