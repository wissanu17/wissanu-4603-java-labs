 /**
 * This class AFFChampionship is a subclass of Competition and
 * has two additional variables as teamA and teamB.
 * The AFFChampionship class has two constructors, first one accepts all
 * variables of class Competition and teamA, teamB. 
 * This class has method setPlaces, setSponsorship and toString.
 * 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : Febuary 3, 2022
 * 
 */
package rayayoi.wissanu.lab6;

import java.util.ArrayList;

public class AFFChampionship extends Competition {
    String name;
    String teamA;
    String teamB;

    // This method will contain string of teamA and teamB.
    public AFFChampionship(String teamA, String teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    // This mathod will contain string of name, teamA and teamB;
    public AFFChampionship(String name, String teamA, String teamB) {
        this.name = name;
        this.teamA = teamA;
        this.teamB = teamB;
    }

    // This method contain arraylist string of places.
    public void setPlaces(ArrayList<String> places) {
        System.out.println(name + " play at these stadiums " + "\n" + places);
    }

    // This method get arraylist string of sponsors.
    // This method will check quantity of sponser and print different output.
    public void setSponsorship(ArrayList<String> sponsors) {
        if (sponsors.size() == 1) {
            System.out.println(sponsors.toString().replace("[", "").replace("]", "") + " is a sponsor of " + name);
        } else {
            System.out.println("Sponsors of " + name + " are " + sponsors);
        }
    }

    // This is toString method will override and print output.
    public String toString() {
        return name + " in the final round was the game between " + teamA + " vs. " + teamB + ".";
    }

    @Override
    void setDescription() {
    }

    @Override
    void setSponsorship() {
    }
}