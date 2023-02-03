 /**
 * This interface is called BadmintonPlayable that have two attributes which are
 * racketLength and worldRanking and has four public methods which are
 * getRacketLength(), setRacketLength(double), getWorldRanking(),
 * setWorldRanking(int).
 * 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : Febuary 3, 2022
 * 
 */
package rayayoi.wissanu.lab6;

interface BadmintonPlayable {
    double racketLength = 0;
    int worldRanking = 0;

    public void setRacketLength(double racketLength);

    public double getRacketLength();

    public void setWorldRanking(int worldRanking);

    public int getWorldRanking();
}
