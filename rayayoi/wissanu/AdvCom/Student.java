package rayayoi.wissanu.AdvCom;

import java.io.Serializable;
import java.util.ArrayList;

class Student extends Person implements Serializable {
    private double gpa;
    private ArrayList<String> activities;

    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
        this.activities = new ArrayList<>();
    }

    public Student() {
        super("");
        this.gpa = 0.0;
        this.activities = new ArrayList<>();
    }

    public double getGpa() {
        return gpa;
    }

    public ArrayList<String> getActivities() {
        return activities;
    }

    public void addActivities(ArrayList<String> activities) {
        this.activities.addAll(activities);
    }

    public String toString() {
        return super.toString() + "\nGPA: " + gpa + "\nActivities: " + activities;
    }
}

