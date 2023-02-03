 /**
 * This class is called AthleteV2 that extend Athlete from lab5.
 *
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : Febuary 3, 2022
 * 
 */
package rayayoi.wissanu.lab6;

public class AthleteV2 extends rayayoi.wissanu.lab5.Athlete {

    public AthleteV2(String name, double wieght, double height, Gender gender, String nationality, String birthdate) {
        super(name, wieght, height, gender, nationality, birthdate);
    }

    void practice() {
        System.out.println(super.name + "run for 10 km");
    }
    
}
