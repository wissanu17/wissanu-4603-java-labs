
package rayayoi.wissanu.lab5;

class Boxer extends Athlete {
    
    public Boxer(String name, double weight, double height, Gender gender,
     String nationality, String birthdate, String division, String golveSize) {
        //Use variable from class Athlete
        super(name, weight, height, gender, nationality, birthdate);
        //declare additional variable from class Athlete 
        this.division = division;
        this.golveSize = golveSize;
    }
    static String sport = "Boxing";
    private String division;
    private String golveSize;
    //Override method to display 
    @Override
    public String toString() {
        return String.format("%s, %.1fkg, %.1fm, %s, %s, %s, %s %s, %s", 
        name, weight, height, gender, nationality, birthdate, sport, division, golveSize);
    }
    //Method return sport that athlete play
    public static String getSport() {
        return sport;
    }
}

