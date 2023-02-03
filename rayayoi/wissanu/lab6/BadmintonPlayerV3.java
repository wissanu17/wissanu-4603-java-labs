 /**
 * This class is called BadmintonPlayerV3 is a subclass of BadmintonPlayerV2 and
 * implements interface BadmintonPlayable and Sprinter.
 * This class has three protected attributes which are racketLength,
 * worldRanking, and speed.
 * This class has getter and setter of RacketLength, worldRanking and speed.
 * This class have toString method have been override that having the same
 * output as the Athlete object has and also has its own string as “<name> is a
 * Badminton player whose world ranking is <worldRanking> and has sprint speed
 * as <speed>”.
 * 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : Febuary 3, 2022
 * 
 */
package rayayoi.wissanu.lab6;

public class BadmintonPlayerV3 extends BadmintonPlayerV2 implements Sprinter, BadmintonPlayable {
    protected double racketLength;
    protected int worldRanking;
    protected double speed;

    public BadmintonPlayerV3(String name, double weight, double height, Gender gender, String nationality,
            String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    // This is setter method to set racketLength value.
    @Override
    public void setRacketLength(double racketLength) {
        this.racketLength = racketLength;
    }

    // This is getter method to get racketLength value.
    @Override
    public double getRacketLength() {
        return racketLength;
    }

    // This is setter method to set worldRanking value.
    @Override
    public void setWorldRanking(int worldRanking) {
        this.worldRanking = worldRanking;
    }

    // This is getter method to get worldRanking value.
    @Override
    public int getWorldRanking() {
        return worldRanking;
    }

    // This is setter method to set speed value.
    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // This is getter method to get speed value.
    @Override
    public double getSpeed() {
        return speed;
    }

    // This toString method that return output.
    @Override
    public String toString() {
        return super.toString() + "\n" + name + " is a Badminton player whose world ranking is " + worldRanking
                + " and has sprint speed as " + speed;
    }
}
