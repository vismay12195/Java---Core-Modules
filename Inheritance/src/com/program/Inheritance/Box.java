package com.program.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // For Cube
    Box(double side){

        // super(); It basically refers to the Object class as there is no super class of Box and any class that does
        // not have any class above it from which it can inherit its members, it automatically refers to the Object
        // class.

        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void info(){
        System.out.println("Creating the box");
    }
}
