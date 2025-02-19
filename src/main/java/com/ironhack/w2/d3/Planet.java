package com.ironhack.w2.d3;

public enum Planet {
    MERCURY (3.303e+23, 0.4397e6),
    VENUS (4.869e+24, 6.0518e6),
    MARS (6.421e+23, 3.3972e6);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius){
        this.mass = mass;
        this.radius = radius;
    }

    private double mass(){
        return mass;
    }

    private double radius(){
        return radius;
    }

    public static final double G = 6.67300E-11;

    double surfaceGravity(){
        return G * mass / (radius * radius);
    }

    double surfaceWeight(double otherMass){
        return otherMass * surfaceGravity();
    }

    public static void main(String[] args) {
        double earthWeight = 175;
        double mass = earthWeight / MARS.surfaceGravity();

        System.out.println("Your weight in Mars is: " + mass);
    }
}
