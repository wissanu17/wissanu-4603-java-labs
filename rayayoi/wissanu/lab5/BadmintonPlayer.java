 /**
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : January 20, 2022
 * 
 */
package rayayoi.wissanu.lab5;

class BadmintonPlayer extends Athlete {
    public BadmintonPlayer(String name, double weight, double height, Gender gender, String nationality,
            String birthdate, double racketLength, int worldRanking) {
        //Use variable from class Athlete
        super(name, weight, height, gender, nationality, birthdate);
        //declare additional variable from class Athlete 
        this.racketLength = racketLength;
        this.worldRanking = worldRanking;
    }
    static String sport = "Badminton";
    public static String getSport;
    private double racketLength;
    private int worldRanking;
    
    @Override
    //Override method to display 
    public String toString() {
        return String.format("%s, %.1fkg, %.2fm, %s, %s, %s, %s, %.1fcm, rank:%s", 
        name, weight, height, gender, nationality, birthdate, sport, racketLength, worldRanking);
    }
    //Method return sport that athlete play
    public static String getSport() {
        return sport;
    }
}
