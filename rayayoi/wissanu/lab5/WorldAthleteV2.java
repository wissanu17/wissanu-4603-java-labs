 /**
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : January 20, 2022
 * 
 */
package rayayoi.wissanu.lab5;
/**
 * The output of main method will display like below
 * [BadmintonPlayer]<name>, <weight>kg, <height>m, <gender>, <nationality>, <birthdate>, <sport>, <racketlength>cm, rank:<workdranking>
 * [Footballer]<name>, <weight>kg, <height>m, <gender>, <nationality>, <birthdate>, <sport>, <position>, <team>
 * [Boxer]<name>, <weight>kg, <height>m, <gender>, <nationality>, <birthdate>, <sport>, <division>, <golveSize>
 * Bott <name> and <name> play <sport>
 * Tom Brady is 17 years older than Ratchanok Intanon
 * <name> is <year> years younger than <name>
 * <name> is not taller than <name>
 */
public class WorldAthleteV2 {
    public static void main(String[] args) {
        //Set value of badminton player
        BadmintonPlayer ratchanok = new BadmintonPlayer("Ratchanok Intanon", 
        55, 1.68, Athlete.Gender.FEMALE, "Thai", "05/02/1995", 66.5, 4);
        //set value of footballer
        Footballer tom = new Footballer("Tom Brady", 102, 1.93,
         Athlete.Gender.MALE, "American", "03/08/1977", "Quarterback", "New England Patriots");
        //Set value of boxer
        Boxer wisaksil = new Boxer("Wisaksil Wangek", 
        51.5, 1.60, Athlete.Gender.MALE, "Thai", "08/12/1986", "Super Flyweight", "M");
        System.out.println(ratchanok);
        System.out.println(wisaksil);
        System.out.println(tom);
        //Set another badminton player
        BadmintonPlayer nitchaon = new BadmintonPlayer("Nichaon Jindapol", 52, 1.63, 
        Athlete.Gender.FEMALE, "Thailand", "31/03/1998", 67, 11);
        System.out.println("Both " + ratchanok.getName() + " and " + nitchaon.getName() 
        + " play " + BadmintonPlayer.getSport());
        //Use method compareAge()
        ratchanok.compareAge(tom);
        ratchanok.compareAge(nitchaon);
        if (isTaller(wisaksil, tom)) { 
            System.out.println(wisaksil.getName() + " is taller than " + tom.getName());
        } else {
            System.out.println(wisaksil.getName() + " is not taller than " + tom.getName());
        }
    }
    //Return true or false 
    static boolean isTaller(Athlete athleteA, Athlete athleteB) {
        if (athleteA.height > athleteB.height) {
            return true;
        } else {
            return false;
        }
    }
}
