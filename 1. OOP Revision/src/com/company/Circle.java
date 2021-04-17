package com.company;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea(){
        return radius*(22/7.0);
    }
}
