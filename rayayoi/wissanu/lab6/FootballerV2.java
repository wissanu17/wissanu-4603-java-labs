 /**
 * This class is called FootballerV2 is a subclass of AthleteV2.
 * This class will override the method pactice() and output is <name> + “runs for 10 km and catches a football.
 * 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : Febuary 3, 2022
 * 
 */
package rayayoi.wissanu.lab6;

public class FootballerV2 extends AthleteV2{
    public FootballerV2(String name, double wieght, double height, Gender gender, String nationality, String birthdate) {
        super(name, wieght, height, gender, nationality, birthdate);
    }
    // This method practice will override and print output.
    public void practice() {
        System.out.println(super.name + "runs for 10 km and catches a football");
    }
}
