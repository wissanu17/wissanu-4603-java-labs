package com.rayayoi.wissanu.exercises; 

public class RecComputation {
    public static void main(String[] args) {
        int len_args = args.length;
        if (len_args == 2) {
        double height = Double.parseDouble(args[0]) ; 
        double width = Double.parseDouble(args[1]) ;
        double area = height*width;
        double circumference = (height*2) + (width*2) ;
        System.out.println("The circumference of retangle with width = " + width + " and height = " + height + " is " + circumference + " and its area = " + area );}
        else {
        System.out.println("Try again");
    }
 }
}