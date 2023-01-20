 /**
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : January 20, 2022
 * 
 */
package rayayoi.wissanu.lab5;

public class Footballer extends Athlete {
    public Footballer(String name, double weight, double height, Gender gender,
     String nationality, String birthdate, String position, String team) {
        //Use variable from class Athlete
        super(name, weight, height, gender, nationality, birthdate);
        //declare additional variable from class Athlete 
        this.position = position;
        this.team = team;
    }
    static String sport = "American Football";
    private String position;
    private String team;
    //Override method to display 
    @Override
    public String toString() {
        return String.format("%s, %.1fkg, %.1fm, %s, %s, %s, %s %s, %s", 
        name, weight, height, gender, nationality, birthdate, sport, position, team);
    }
    //Method return sport that athlete play
    public static String getSport() {
        return sport;
    }
}

