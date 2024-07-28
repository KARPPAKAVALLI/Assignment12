package com.assignment12.code1;

public class Circle extends Shape{
    //1. Write a hierarchy of geometric shape classes 'Circle', 'Rectangle', etc inherited from a common base class 'Shape'
    float radius;
    String colour;
    Circle(String colour,float radius){
        super(colour);
        this.radius=radius;
    }

    @Override
    public float calculateArea() {
        return 3.14f*this.radius*this.radius;
    }

    @Override
    public float calculatePerimeter() {
        return 2*3.14f*radius;
    }
}
