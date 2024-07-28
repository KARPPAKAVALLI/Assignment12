package com.assignment12.code1;

public class Square extends Shape{
    //1. Write a hierarchy of geometric shape classes 'Circle', 'Rectangle', etc inherited from a common base class 'Shape'
    float length;
    String colour;
    Square(String colour,float length){
        super(colour);
        this.length=length;
    }

    @Override
    public float calculateArea() {
        return length*length;
    }

    @Override
    public float calculatePerimeter() {
        return 4*length;
    }
}
