 /**
 * This class is called BoxerV2 is a subclass of AthleteV2.
 * This class will override the method pactice() and print new output.
 * 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : Febuary 3, 2022
 * 
 */
package rayayoi.wissanu.lab6;

public class BoxerV2 extends AthleteV2 {
    public BoxerV2(String name, double wieght, double height, Gender gender, String nationality, String birthdate) {
        super(name, wieght, height, gender, nationality, birthdate);
    }
    // method practice will override and print new output.
    void practice() {
        System.out.println(super.name + "runs for 10 km and swings arms");
    }
}

