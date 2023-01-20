 /**
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : January 20, 2022
 * 
 */
package rayayoi.wissanu.lab5;
import rayayoi.wissanu.lab5.Athlete.Gender;
/**
 * The output of main method will display like below
 * <name>'s height is 1.68
 * <name>'s height has increaded to <height>
 * Athlete [ <name>, <weight>kg, <height>m, <gender>, <nationality>, <birthdate>]
 * Athlete [ <name>, <weight>kg, <height>m, <gender>, <nationality>, <birthdate>]
 * Athlete [ <name>, <weight>kg, <height>m, <gender>, <nationality>, <birthdate>]
 */
public class WorldAthlete {
    public static void main(String[] args) {
        //Set value of each athlete
        Athlete ratchanok = new Athlete("Ratchanok Intanon", 
        55, 1.68, Gender.FEMALE, "Thai", "05/02/1995");
        Athlete wisaksil = new Athlete("Wisaksil Wangek", 
        51.5, 1.60, Gender.MALE, "Thai", "08/12/1986");
        Athlete tom = new Athlete("Tom Brady", 
        102, 1.93, Gender.MALE, "American", "03/08/1977");
        //Display output
        System.out.println(ratchanok.getName() + "'s height is " + ratchanok.getHeight());
        //Change height of athlete ratchanok
        ratchanok.setHeight(1.70);
        System.out.println(ratchanok.getName() + "'s height has increaded to  " + ratchanok.getHeight());
        System.out.println(ratchanok);
        System.out.println(wisaksil);
        System.out.println(tom);
    }
}
