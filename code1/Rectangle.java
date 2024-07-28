package com.assignment12.code1;

public class Rectangle extends Shape{
    //1. Write a hierarchy of geometric shape classes 'Circle', 'Rectangle', etc inherited from a common base class 'Shape'
    float length;
    float breadth;
    String colour;
    Rectangle(String colour,float breadth,float length){
        super(colour);
        this.breadth=breadth;
        this.length=length;
    }

    @Override
    public float calculatePerimeter() {
        return 2*(length+breadth);
    }

    @Override
    public float calculateArea() {
        return length*breadth;
    }
}
