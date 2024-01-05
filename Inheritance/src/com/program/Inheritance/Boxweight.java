package com.program.Inheritance;

public class Boxweight extends Box{
    double weight;
    public Boxweight(){
        this.weight = -1.0;
    }

    public Boxweight(double l, double h, double w, double weight) {
        super(l, h, w); // Used to initalize the values of parent class constructor
        this.weight = weight;
    }
}
