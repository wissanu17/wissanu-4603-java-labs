package wissanu.ex10012023;

class EnKKUStudent extends KKUStudent {
    EnKKUStudent(String inputname) {
        name = inputname;
    }
    protected int gearNumber;

    public String toString() {
        return name + " is a KKU Engineering student with gear number as " + getGearNumber();
    }

    public int getGearNumber() {
        return gearNumber;
    }
    public void setGearNumber(int numofGear) {
        gearNumber = numofGear;
    }
}
