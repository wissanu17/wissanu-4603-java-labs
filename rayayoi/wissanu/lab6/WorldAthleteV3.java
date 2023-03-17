 /**
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : Febuary 3, 2022
 * 
 */
package rayayoi.wissanu.lab6;

import java.util.*;
import rayayoi.wissanu.lab5.*;
public class WorldAthleteV3 {
    public static void main(String[] args) {
        ArrayList<AthleteV2> athletes =  new ArrayList<AthleteV2>();
        BadmintonPlayerV2 ratchanok = new BadmintonPlayerV2("Ratchanok Intanon", 
        55, 1.68, Athlete.Gender.FEMALE, "Thai", "05/02/1995");
        BoxerV2 wisaksil = new BoxerV2("Wisaksil Wangek", 
        51.5, 1.60, Athlete.Gender.MALE, "Thai", "08/12/1986");
        FootballerV2 tom = new FootballerV2("Tom Brady", 
        102, 1.93, Athlete.Gender.MALE, "American", "03/08/1977");
        athletes.add(ratchanok);
        athletes.add(tom);
        athletes.add(wisaksil);

        for (AthleteV2 athlete : athletes) {
            System.out.println(athlete);
            athlete.practice();
        }
    }
}