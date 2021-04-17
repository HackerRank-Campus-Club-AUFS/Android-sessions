package com.company;

public class Rectangle {

    static String name="Rectangle Class";
    static int count=0;

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        count++;
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
            this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calcArea(){
        return width*height;
    }


    
    
    
    public static int getCount(){
        return count;
    }
    
    
     


}
