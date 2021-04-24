package com.company;

import java.util.ArrayList;

public class Main {

    /**
     * Final Keyword
     *
     * Variable ==> Constant
     * Method ==> prevent Override
     * Class ==> prevent Inhertance
     */


    /**
     * Access Modifiers
     *
     * public ==> every where.
     * private ==> same class.
     * protected ==> same class, childs.
     * default ==> same class, same package.
     */


    public static void main(String[] args) {
        ArrayList<Shape> shapes=new ArrayList<>();
//        ArrayList<Circle> circles=new ArrayList<>();
//        ArrayList<Rectangle2> rectangles=new ArrayList<>();

        shapes.add(new Circle(17));
        shapes.add(new Circle(18));
        shapes.add(new Circle(19));
        shapes.add(new Rectangle2(15,16));
        shapes.add(new Rectangle2(12,18));
        shapes.add(new Rectangle2(14,19));
//
//        for(int i=0;i<shapes.size();i++){
//            System.out.println(shapes.get(i).calcArea());
//        }


        Circle c1=new Circle(15);
        Shape c2=new Circle(15);

        displayAreOfShape(c2);
        displayAreOfShape(c1);


    }


    public static void displayAreOfShape(Shape s1){
        System.out.println(s1.calcArea());
    }
}
