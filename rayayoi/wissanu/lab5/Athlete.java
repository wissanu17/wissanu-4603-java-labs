 /**
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : January 20, 2022
 * 
 */
package rayayoi.wissanu.lab5;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Athlete implements Serializable {
    //creat enum
    public enum Gender {
        MALE,FEMALE
    }
    //Declare a variable
    protected String name, nationality;
    protected LocalDate birthdate;
    protected double weight, height;
    protected Gender gender;
    //protected DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //Creat contructor 
    public Athlete(String name, double weight, double height, Gender gender, String nationality, String birthdateToString) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.nationality = nationality;
        //Format birthdateToString to type string 
        DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        birthdate = LocalDate.parse(String.format("%s", birthdateToString), formatter);
    }
    public String toString(){
        return String.format("Athlete [ %s, %.1fkg, %.2fm, %s, %s, %s]", name, weight, height, gender, nationality, birthdate);
    }
    //setter method
    public void setHeight(double height){ this.height = height; }

    public void setWeight(double weight){ this.weight = weight; }

    public void setName(String name){ this.name = name; }

    public void setGender(Gender gender){ this.gender = gender; }

    public void setNationality(String nationality){ this.nationality = nationality; }

    public void setBirthdate(String birthdateToString){ birthdate = LocalDate.parse(String.format("%s", birthdateToString)); }

    //getter method
    public String getName(){ return name; }

    public String getNationality(){ return nationality; }

    public LocalDate getBirthdateLocalDate(){ return birthdate; }

    public double getWeight(){ return weight; }

    public double getHeight(){ return height; }

    public String getGender(){ return String.format("%s", gender); }
    
    //compare method
    public void compareAge(Athlete athlete) {
        LocalDate dateBefore = athlete.birthdate;
	    LocalDate dateAfter = this.birthdate;
	    int year = (int) ChronoUnit.YEARS.between(dateBefore, dateAfter);
        if(year > 0) {
            System.out.println(athlete.getName() + " is " + year + " years older than " +  this.name);
        } else if(year < 0) {
            year *= -1;
            System.out.println(athlete.getName() + " is " + year + " years younger than " +  this.name);
        } else {
            System.out.println(athlete.getName() + " is same age as " +  this.name);
        }
    }
}