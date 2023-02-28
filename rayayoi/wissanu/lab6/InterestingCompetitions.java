 /**
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : Febuary 3, 2022
 * 
 */
package rayayoi.wissanu.lab6;

import java.util.ArrayList;

public class InterestingCompetitions {
    public static void main(String[] args) {
        AFFChampionship aff2022 = new AFFChampionship("AFF 2022", "Thailand", "Vietnam");
        AFFChampionship aff2020 = new AFFChampionship("AFF 2020", "Thailand", "Indonesia");
        System.out.println(aff2020);
        System.out.println(aff2022);

        ArrayList<String> places = new ArrayList<String>();
        places.add("Hanoi");
        places.add("Bangkok");
        aff2022.setPlaces(places);
        ArrayList<String> sponsors = new ArrayList<String>();
        sponsors.add("Mitsubishi Electronics");
        aff2022.setSponsorship(sponsors);

        places.remove("Hanoi");
        places.add("Kallang");
        aff2020.setPlaces(places);
        sponsors.remove("Mitsubishi Electronics");
        sponsors.add("Suzuki");
        sponsors.add("Yanmar");
        aff2020.setSponsorship(sponsors);

    }
}
