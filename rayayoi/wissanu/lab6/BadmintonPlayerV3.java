 /**
 * This class is name BadmintonPlayerV3 is a subclass of BadmintonPlayerV2 and implements interface BadmintonPlayable and Sprinter.
 * This class has 3 protected attributes are racketLength, worldRanking, and speed.
 * This class has getter and setter for RacketLength, worldRanking and speed.
 * This class have toString method to overide another output.
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
    
    // toString method that return new output.
    @Override
    public String toString() {
        return super.toString() + "\n" + name + " is a Badminton player whose world ranking is " + worldRanking
                + " and has sprint speed as " + speed;
    }
    
    // setter method to set racketLength value.
    @Override
    public void setRacketLength(double racketLength) {
        this.racketLength = racketLength;
    }

    // getter method to get racketLength value.
    @Override
    public double getRacketLength() {
        return racketLength;
    }

    // setter method to set worldRanking value.
    @Override
    public void setWorldRanking(int worldRanking) {
        this.worldRanking = worldRanking;
    }

    // getter method to get worldRanking value.
    @Override
    public int getWorldRanking() {
        return worldRanking;
    }

    // setter method to set speed value.
    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // getter method to get speed value.
    @Override
    public double getSpeed() {
        return speed;
    }
}
