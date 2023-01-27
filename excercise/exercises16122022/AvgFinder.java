package rayayoi.wissanu.exercises3; 

public class AvgFinder {

    static int avg(int num1 ,int num2) {
        int avgTotal = (num1 + num2) / 2;
        return avgTotal;

    }
    static double avg(Double num1 ,Double num2) {
        double avgTotal = (num1 + num2) / 2;
        return avgTotal;

    }
    static int avg(int num1 ,int num2 ,int num3) {
        int avgTotal = (num1 + num2 + num3) / 3;
        return avgTotal;
    }
    public static void main(String[] args) {
        int a =2, b = 3, c = 4;
        double i = 2.2, j = 3.3;
        System.out.println("The average of " + a + " " + b + " = " + avg(a,b));
        System.out.println("The average of " + a + " " + b + " " + c + " = " + avg(a, b, c));
        System.out.println("The average of " + i + " " + j + " = " + avg(i, j));
    }
}

