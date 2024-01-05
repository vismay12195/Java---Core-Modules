package com.program.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.l + " " + box1.w + " " + box1.h);

        // With the side argument constructor
        Box box2 = new Box(5);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);

        // Constructor with 3 arguments
        Box box3 = new Box(5.2,6.3,2.3);
        System.out.println(box3.l + " " + box3.w + " " + box3.h);

        // Default Boxweight constructor
        Boxweight box4 = new Boxweight();
        System.out.println(box4.h + " " + box4.weight);

        // Boxweight constructor with all the arguments of Box and weight itself
        Boxweight box5 = new Boxweight(2.3,4.5,6.4,23.0);
        System.out.println(box5.h + " " + box5.l + " " + box5.w + " " + box5.weight);
    }
}